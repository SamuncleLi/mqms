package com.gamc.efactory.util;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.BuiltinFormats;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class BigExcelReader {

    enum xssfDataType {
        BOOL, ERROR, FORMULA, INLINESTR, SSTINDEX, NUMBER
    }

    private static final int ERROR = 1;
    private static final int BOOLEAN = 1;
    private static final int NUMBER = 2;
    private static final int STRING = 3;
    private static final int DATE = 4;
    public static final String DATE_FORMAT_STR = "yyyy-MM-dd HH:mm:ss";


    // private DataFormatter formatter = new DataFormatter();
    private InputStream sheet;
    private XMLReader parser;
    private InputSource sheetSource;
    private int index = 0;

    /**
     * 读大数据量Excel
     *
     * @throws IOException
     * @throws OpenXML4JException
     * @throws SAXException
     */
    //@param maxColNum 读取的最大列数
    protected BigExcelReader(String filename) throws IOException, OpenXML4JException, SAXException {
        OPCPackage pkg = OPCPackage.open(filename);
        init(pkg);
    }

    /**
     * 读大数据量Excel
     *
     * @param file Excel文件
     * @throws IOException
     * @throws OpenXML4JException
     * @throws SAXException
     */
    //@param maxColNum 读取的最大列数
    public BigExcelReader(File file) throws IOException, OpenXML4JException, SAXException {
        //取得文件的读写权限
        OPCPackage pkg = OPCPackage.open(file);
        init(pkg);
    }

    /**
     * 读大数据量Excel
     *
     * @param in Excel文件输入流
     * @throws IOException
     * @throws OpenXML4JException
     * @throws SAXException
     */
    public BigExcelReader(InputStream in) throws IOException, OpenXML4JException, SAXException {
        OPCPackage pkg = OPCPackage.open(in);
        init(pkg);
    }

    /**
     * 初始化 将Excel转换为XML
     *
     * @param pkg
     * @throws IOException
     * @throws OpenXML4JException
     * @throws SAXException
     */
    private void init(OPCPackage pkg) throws IOException, OpenXML4JException, SAXException {
        XSSFReader xssfReader = new XSSFReader(pkg);//实例化xssfReader
        SharedStringsTable sharedStringsTable = xssfReader.getSharedStringsTable();//获取当前Excel所有Sheet中字符串
        StylesTable stylesTable = xssfReader.getStylesTable();//获取当前Excel所有Sheet中单元格样式
        String rid = getRid(xssfReader);//解析文件，得到rid
        if(rid == null){
            throw new RuntimeException("解析xml出错了，rid获取失败");
        }
//        sheet = xssfReader.getSheet("rId"+ sheetId);只遍历一个电子表格，其中sheetId为要遍历的sheet索引，从1开始，1-3
//        sheet = xssfReader.getSheet("rId3");
        sheet = xssfReader.getSheet(rid);
        parser = fetchSheetParser(sharedStringsTable, stylesTable);
        sheetSource = new InputSource(sheet);
    }

    /**
     * 执行解析操作
     *
     * @return 读取的Excel行数
     */
    public int parse() {
        try {
            parser.parse(sheetSource);
        } catch (IOException | SAXException e) {
            e.printStackTrace();
        } finally {
            if (sheet != null) {
                try {
                    sheet.close();//关闭输入流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return index;
    }

    private XMLReader fetchSheetParser(SharedStringsTable sharedStringsTable, StylesTable stylesTable) throws SAXException {
        XMLReader parser = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
        ContentHandler handler = new SheetHandler(sharedStringsTable, stylesTable);
        parser.setContentHandler(handler);
        return parser;
    }

    private String getRid(XSSFReader xssfReader){
        try {
            InputStream wbIn = xssfReader.getWorkbookData();//输入流
            final Map<String, String> map = new HashMap<>();
            XMLReader parserRid = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
            parserRid.setContentHandler(new DefaultHandler() {
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//                    System.out.println(qName+"vvvvvvvvvvvvvvvvvvvvvvvv");
                    if (qName.equals("sheet")) {
                        //获取rid的值
                        String sheetIndex = attributes.getValue("sheetId");
//                        System.out.println(sheetIndex+"wwwwwwwwwwwwwwwwwwwwwwwwwwwww");
                        //sheet不一定是第一个，所以暂时先屏蔽
//                        if("1".equals(sheetIndex)){
                        String rid = attributes.getValue("r:id");
                        map.put("rid", rid);
//                        System.out.println(rid);
//                        }

                    }
                }
            });
            InputSource inputSource = new InputSource(wbIn);
            parserRid.parse(inputSource);

            wbIn.close();
            return map.get("rid");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * SAX解析的处理类
     * 每解析一行数据后通过outputRow(String[] datas, int[] rowTypes, int rowIndex)方法进行输出
     *
     * @author zpin
     */
    private class SheetHandler extends DefaultHandler {
        private SharedStringsTable sharedStringsTable; // 存放映射字符串
        private StylesTable stylesTable;// 存放单元格样式
        private String readValue;// 存放读取值
        private xssfDataType dataType;// 单元格类型
        private String[] rowDatas;// 存放一行中的所有数据
        private int[] rowTypes;// 存放一行中所有数据类型
        private int colIdx;// 当前所在列

        private int formatIndex;
        private String formatString;// 对数值型的数据直接读为数值，不对其格式化，所以隐掉此处
        private final DataFormatter formatter = new DataFormatter();
        //解析结果保存
        private List<String[]> container =  new LinkedList<>();

        private SheetHandler(SharedStringsTable sst, StylesTable stylesTable) {
            this.sharedStringsTable = sst;
            this.stylesTable = stylesTable;
        }

        private String formateDateToString(Date date) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式化日期
            return sdf.format(date);

        }

        @Override
        public void endDocument() throws SAXException {
            try {
                doTask();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        public void startElement(String uri, String localName, String name,
                                 Attributes attributes) throws SAXException {
            if (name.equals("c")) {// c > 单元格
                colIdx = getColumn(attributes);
                String cellType = attributes.getValue("t");
                String cellStyle = attributes.getValue("s");

                this.dataType = xssfDataType.NUMBER;
                if ("b".equals(cellType)) {
                    this.dataType = xssfDataType.BOOL;
                } else if ("e".equals(cellType)) {
                    this.dataType = xssfDataType.ERROR;
                } else if ("inlineStr".equals(cellType)) {
                    this.dataType = xssfDataType.INLINESTR;
                } else if ("s".equals(cellType)) {
                    this.dataType = xssfDataType.SSTINDEX;
                } else if ("str".equals(cellType)) {
                    this.dataType = xssfDataType.FORMULA;
                }
                //原版无法正确解析日期
                else if (cellStyle != null) {
                    // It's a number, but almost certainly one
                    // with a special style or format
                    int styleIndex = Integer.parseInt(cellStyle);
                    XSSFCellStyle style = stylesTable.getStyleAt(styleIndex);
                    this.formatIndex = style.getDataFormat();
                    this.formatString = style.getDataFormatString();
                    if (this.formatString == null)
                        this.formatString = BuiltinFormats.getBuiltinFormat(this.formatIndex);
                }
            }
//                 else if (cellStyle != null) { //处理日期
//                    int styleIndex = Integer.parseInt(cellStyle);
////                    System.out.println(styleIndex);
//                    XSSFCellStyle style = stylesTable.getStyleAt(styleIndex);
//                    formatIndex = style.getDataFormat();
//                    System.out.println(formatIndex);
//                    formatString = style.getDataFormatString();
////                     System.out.println(formatString+"111111111111111111111111");
////                    System.out.println(formatString);
////                    if (formatString.contains("m/d/yy") || formatString.contains("yyyy/mm/dd") || formatString.contains("yyyy/m/d")|| formatString.contains("yyyy-mm-dd")) {
////                        this.dataType = xssfDataType.DATE;
////                        System.out.println("9999999999999999999999999999999999");
////                        formatString = "yyyy-mm-dd";
////                    }
//                    if (Arrays.asList(22,176,177,182,183,186).contains(formatIndex)){
//                        this.dataType = xssfDataType.DATE;
////                        System.out.println("99999999999999999999999999999999999999");
//                        formatString = "yyyy-MM-dd";
//                    }
//
//                    else if (formatString == null) {
//                        this.dataType = xssfDataType.Null;
////                        System.out.println("cccccccccccccccccccccccccccccccccccccc");
//                        formatString = BuiltinFormats.getBuiltinFormat(formatIndex);
//
//                    }
//
////                    if (cellStyle != null) {
////                    int styleIndex = Integer.parseInt(cellStyle);
////                    XSSFCellStyle style = stylesTable.getStyleAt(styleIndex);
////                    this.formatIndex = style.getDataFormat();
////                this.formatString = style.getDataFormatString();
//////                    if ("m/d/yy" == formatString){
//////
//////                    }
////                    if (formatString == null){
////                        this.dataType = xssfDataType.Null;
////                        formatString = BuiltinFormats.getBuiltinFormat(formatIndex);
////                    }
//                    else {
//                        this.dataType = xssfDataType.DATE;
//                        //full format is "yyyy-MM-dd hh:mm:ss.SSS";
//                        formatString = "yyyy-MM-dd";
//                    }
//                }
//            }
            // 解析到一行的开始处时，初始化数组
            else if (name.equals("row")) {
                int cols = getColsNum(attributes);// 获取该行的单元格数
                rowDatas = new String[cols];
                rowTypes = new int[cols];
            }
            readValue = "";
        }

        public void endElement(String uri, String localName, String name)
                throws SAXException {
            if (name.equals("v") || name.equals("t")) { // 单元格的值
                switch (this.dataType) {
                    case BOOL: {
                        char first = readValue.charAt(0);
                        rowDatas[colIdx] = first == '0' ? "FALSE" : "TRUE";
                        rowTypes[colIdx] = BOOLEAN;
                        break;
                    }
                    case ERROR: {
                        rowDatas[colIdx] = "ERROR:" + readValue;
                        rowTypes[colIdx] = ERROR;
                        break;
                    }
                    case INLINESTR: {
                        rowDatas[colIdx] = new XSSFRichTextString(readValue).toString();
                        rowTypes[colIdx] = STRING;
                        break;
                    }
                    case SSTINDEX: {
                        int idx = Integer.parseInt(readValue);
                        rowDatas[colIdx] = new XSSFRichTextString(sharedStringsTable.getEntryAt(idx)).toString();
                        rowTypes[colIdx] = STRING;
                        break;
                    }
                    case FORMULA: {
                        rowDatas[colIdx] = readValue;
                        rowTypes[colIdx] = STRING;
                        break;
                    }
//                    case NUMBER: {
////                        // 判断是否是日期格式
////                        if (HSSFDateUtil.isADateFormat(formatIndex, readValue)) {
////                            Double d = Double.parseDouble(readValue);
////                            Date date = HSSFDateUtil.getJavaDate(d);
////                            rowDatas[colIdx] = formateDateToString(date);
////                            rowTypes[colIdx] = DATE;
////                        }
//                        if (formatString != null){
//                            rowDatas[colIdx]= formatter.formatRawCellContents(Double.parseDouble(readValue), formatIndex, formatString);
//                            rowTypes[colIdx] = NUMBER;
//                        }
//                        else {
//                            rowDatas[colIdx] = readValue;
//                            rowTypes[colIdx] = NUMBER;
//                        }
//                        break;
//                    }
//                    case DATE:
//                        try{
//                            rowDatas[colIdx]  = formatter.formatRawCellContents(Double.parseDouble(readValue), formatIndex, formatString);
//                            rowTypes[colIdx] = DATE;
//                        }catch(NumberFormatException ex){
//                            rowDatas[colIdx] = readValue;
//                        }
//                        rowDatas[colIdx] = rowDatas[colIdx].replace(" ", "");
                    case NUMBER: {

                        // 判断是否是日期格式
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat sdfHMS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        if (formatIndex == 14 || formatIndex == 31 || formatIndex == 57 || formatIndex == 58
                                || (176 == formatIndex)|| (182 <= formatIndex && formatIndex <= 196)
                                || (210 <= formatIndex && formatIndex <= 213) || formatIndex == 180 ||(208 == formatIndex)) {// 日期
//                            System.out.println(readValue+"'"+formatIndex+"'"+"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                            Date date = DateUtil.getJavaDate(Double.parseDouble(readValue));
                            rowDatas[colIdx]=sdf.format(date);
                            rowTypes[colIdx] = STRING;
                        }
                        else if((formatIndex==178)|| (formatIndex == 177)){
//                           //时分秒
//                            System.out.println(readValue+"'"+formatIndex+"'"+"BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
                            Date date = DateUtil.getJavaDate(Double.parseDouble(readValue));
                            rowDatas[colIdx]=sdfHMS.format(date);
                            rowTypes[colIdx] = STRING;

                        }
                        else if (formatIndex == 20 || formatIndex == 32 || formatIndex == 183 || (200 <= formatIndex && formatIndex <= 209)) {//时间
                            Date date = DateUtil.getJavaDate(Double.parseDouble(readValue));
                            rowDatas[colIdx]=sdf.format(date);
                            rowTypes[colIdx] = STRING;

                        } else {
                            if (readValue.contains("E")) {//科学计数法
                                String[] split = readValue.split("\\+");
                                String e = split[0].replaceAll("E|e", "");
                                rowDatas[colIdx] = e.replace(".", "");
                                rowTypes[colIdx] = NUMBER;
                            } else {
//                                System.out.println(readValue+"'"+formatIndex+"'"+"cccccccccccccccccccccccccccccccc");
                                rowDatas[colIdx] = readValue;
                                rowTypes[colIdx] = STRING;
                            }
                        }
                        break;

                    }
                }
            }
                // 当解析一定行数时输出数据
            else if (name.equals("row")) {
                    container.add(rowDatas);
                    if (container.size() == 5000) {
                        try {
                            doTask();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    //outputRow(rowDatas, rowTypes, index++);
                }

            }


        public void characters(char[] ch, int start, int length)
                throws SAXException {
            readValue += new String(ch, start, length);
        }
        public void doTask() throws IllegalAccessException {
            outputAllRow(container);
            //执行保存
           /* for(String[] row : container){
          Map<String, Object> map = new HashMap<String, Object>();
          map.put("", row.);
                for(String cell : row){
                    System.out.print(cell+",");
                }
                System.out.println();
            }*/

            this.container.clear();
        }

    /*@Override
    public void endDocument() throws SAXException {
        doTask();
    }*/
    }

    /**
     * 输出每一行的数据
     *
     * @param datas    数据
     * @param rowTypes 数据类型
     * @param rowIndex 所在行
     */
    //public abstract void outputRow(String[] datas, int[] rowTypes, int rowIndex);

    /**
     * 输出数据
     * @param lists
     */
    public abstract void outputAllRow(List<String[]> lists) throws IllegalAccessException;

    private int getColumn(Attributes attrubuts) {
        String name = attrubuts.getValue("r");
        int column = -1;
        for (int i = 0; i < name.length(); ++i) {
            if (Character.isDigit(name.charAt(i))) {
                break;
            }
            int c = name.charAt(i);
            column = (column + 1) * 26 + c - 'A';
        }
        return column;
    }

    private int getColsNum(Attributes attrubuts) {
        String spans = attrubuts.getValue("spans");
        String cols = spans.substring(spans.indexOf(":") + 1);
//        System.out.println(cols+"ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        return Integer.parseInt(cols);

        //String cols = attrubuts.getValue("r");
//        String cols = "20";
//        return Integer.parseInt(cols);
    }


}
