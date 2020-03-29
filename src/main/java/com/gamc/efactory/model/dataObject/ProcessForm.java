package com.gamc.efactory.model.dataObject;

import com.alibaba.fastjson.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessForm implements Serializable {
    /**
     * normalData用于展示内容，一个 DataDisplayGroup 代表一个展示区域
     * listData用于展示列表内容（类似easyui 的datagrid） 一个DataDisplayList 代表一个块（datagrid）
     * submitForm用于放置评审者需要填写的表单，系统自动会在此表单基础上添加隐藏的表单控件，内容为流程系统的task信息：
     *           taskName simpleApplicationObjectId processInstId auditorUserId taskId flag
     * submitButton用于展示评审者点击的按钮 一个SubmitButton代表一个按钮
     *
     */
    private List<DataDisplayGroup> normalData;
    private List<DataDisplayList>   listData;
    private SubmitFormGroup submitForm;
    private List<SubmitButton>  submitButton;

    private String script;

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public List<SubmitButton> getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(List<SubmitButton> submitButton) {
        this.submitButton = submitButton;
    }

    public SubmitFormGroup getSubmitForm() {
        return submitForm;
    }

    public void setSubmitForm(SubmitFormGroup submitForm) {
        this.submitForm = submitForm;
    }

    public List<DataDisplayGroup> getNormalData() {
        return normalData;
    }

    public void setNormalData(List<DataDisplayGroup> normalData) {
        this.normalData = normalData;
    }

    public List<DataDisplayList> getListData() {
        return listData;
    }

    public void setListData(List<DataDisplayList> listData) {
        this.listData = listData;
    }
    public void addNormalData(DataDisplayGroup dataDisplayGroup){
        if(normalData==null){
            normalData=new ArrayList<>();
        }
        normalData.add(dataDisplayGroup);
    }
    public void addListData(DataDisplayList dataDisplayList){
        if(listData==null){
            listData=new ArrayList<>();
        }
        listData.add(dataDisplayList);
    }
    public void addSubmitButton(SubmitButton button){
        if(submitButton==null){
            submitButton=new ArrayList<>();
        }
        submitButton.add(button);
    }

    public static DataDisplayGroup buildDataDisplayGroup(){
        return new DataDisplayGroup();
    }

    public static DataDisplaySingle buildDataDisplaySingle(){
        return new DataDisplaySingle();
    }
    public static DatagridHead buildDatagridHead(){
        return new DatagridHead();
    }
    public static DataDisplayList buildDataDisplayList(){
        return new DataDisplayList();
    }
    public static DatagridData buildDatagridData(){
        return new DatagridData();
    }
    public static SubmitFormGroup buildSubmitFormGroup(){
        return new SubmitFormGroup();
    }
    public static SubmitButton buildSubmitButton(){
        return new SubmitButton();
    }

    /**
     * DataDisplayGroup 表示一个数据展示区域
     * group_name(必填) 展示区域的标题
     * structure(必填)  描述电脑版本上该区域的表格结构（手机版无视该结构）
     *            表格最多只能有四列，列于列之间可以合并
     *            示例： [[1,1,1,1],[2,2]]表示该表格有两行，第一行是4列  ，第二行第一列和第二列合并，第三列和第四列合并
     *            列数可以有省缺值，例如[[1],[1]] 表示有两行，每一行都是4列，但是每一行的数组里至少放一个1
     * data（必填）       展示内容的集合
     */
    public static   class DataDisplayGroup implements Serializable{
        private String group_name;
        private List<List<Integer>> structure;
        private List<DataDisplaySingle> data;

        public String getGroup_name() {
            return group_name;
        }

        public void setGroup_name(String group_name) {
            this.group_name = group_name;
        }

        public List<List<Integer>> getStructure() {
            return structure;
        }

        public void setStructure(List<List<Integer>> structure) {
            this.structure = structure;
        }

        public List<DataDisplaySingle> getData() {
            return data;
        }

        public void setData(List<DataDisplaySingle> data) {
            this.data = data;
        }
        public void addData(DataDisplaySingle dataDisplaySingle){
            if(data==null){
                data=new ArrayList<>();
            }
            data.add(dataDisplaySingle);
        }
    }

    /**
     * DataDisplaySingle 用于描述单个展示的内容
     * type（必填）      类型，包括： text image file (TODO:pdf)
     * content（必填）  具体的内容，如果类型是image/file/pdf 则为文件的url地址
     * title（必填）    标题
     * row/col（必填）  展示的内容所在的表格结构的行数和列数（起始值为1不是0）
     */
    public static class DataDisplaySingle implements Serializable{
        private    String type;
        private    String content;
        private    String title;
        private    int row;
        private    int col;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public void setCol(int col) {
            this.col = col;
        }
    }

    /**
     * DataDisplayList 表示一个列表数据展示区域
     * group_name（必填）  列表的名称
     * head（必填）        表头信息,手机版的列表为手风琴列表，加载时只显示一行内容，点击才显示剩余内容。
     *                     未展开前显示的这一行内容为head集合的第一个，所以请确保head的第一个DatagridHead能够体现出这一行数据的特性，
     *                     例如如果这是一个零件出库列表，则第一个DatagridHead应为"零件名称"
     * data_url（选填）    数据来源的url，返回的数据类型应为JSONArray(method:get)
     * data（选填）        列表的数据（类似easyui datagrid 获取的JSONArray）
     */

    public static class DataDisplayList implements Serializable{
        private String group_name;
        private String data_url;
        private List<DatagridHead> head;
        private JSONArray data;

        public String getGroup_name() {
            return group_name;
        }

        public void setGroup_name(String group_name) {
            this.group_name = group_name;
        }

        public String getData_url() {
            return data_url;
        }

        public void setData_url(String data_url) {
            this.data_url = data_url;
        }

        public List<DatagridHead> getHead() {
            return head;
        }

        public void setHead(List<DatagridHead> head) {
            this.head = head;
        }

        public JSONArray getData() {
            return data;
        }

        public void setData(JSONArray data) {
            this.data = data;
        }
        public void addDatagridHead(DatagridHead datagridHead){
            if(head!=null){
                head=new ArrayList<>();
            }
            head.add(datagridHead);
        }
    }

    /**
     * DatagridHead 数据列表的表头信息
     * name（必填）  表头名称
     * field（必填） 数据的key值
     * width（必填） 表头宽度，单位为px（只有PC版才会生效）
     */
    public static class DatagridHead implements Serializable{
        private String name;
        private String field;
        private String width;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }
    }
    public static class DatagridDataSingle{
        private String field;
        private String name;
        private String value;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
    public static class DatagridData{
      private List<DatagridDataSingle> dataList;

        public List<DatagridDataSingle> getDataList() {
            return dataList;
        }

        public void setDataList(List<DatagridDataSingle> dataList) {
            this.dataList = dataList;
        }
    }

    /**
     * SubmitFormGroup用于描述一个表单
     * input(必填)  表单控件的集合,一个SubmitFormSingle代表一个控件
     * structure(必填)  描述电脑版本上该表单的表格结构（手机版无视该结构）
     *            表格最多只能有四列，列于列之间可以合并
     *            示例： [[1,1,1,1],[2,2]]表示该表格有两行，第一行是4列  ，第二行第一列和第二列合并，第三列和第四列合并
     *            列数可以有省缺值，例如[[1],[1]] 表示有两行，每一行都是4列，但是每一行的数组里至少放一个1
     */
    public static class SubmitFormGroup implements Serializable{
        private List<SubmitFormSingle> input;
        private List<List<Integer>> structure;

        public List<SubmitFormSingle> getInput() {
            return input;
        }

        public void setInput(List<SubmitFormSingle> input) {
            this.input = input;
        }

        public List<List<Integer>> getStructure() {
            return structure;
        }

        public void setStructure(List<List<Integer>> structure) {
            this.structure = structure;
        }
        public void addSubmitSingle(SubmitFormSingle submitFormSingle){
            if(input==null){
                input=new ArrayList<>();
            }
            input.add(submitFormSingle);
        }
    }

    /**
     * SubmitFormSingle 用于描述一个表单控件
     * type（必填） 控件类型，包括：text（纯文本，不用填写任何东西） combobox(组合单选框 TODO:PC版的能够填写，手机版的只能选择)
     *                            combobox-multi(多选框)
     *                            textbox datebox filebox
     * name（必填） 控件提交时的name值，不能使用的name值：
     * title（必填） 控件的标题
     *             taskName simpleApplicationObjectId processInstId auditorUserId taskId flag
     * row/col（必填） 控件所在表单结构的行数和列数（起始值为1）
     * text（选填） 如果控件类型为text(纯文本)，则填写文本内容，其他类型不用填
     * input_id（选填） 控件的id,如果控件类型为combobox或combobox-multi必填，其他无特殊情况不用填.
     *                 已经被占用的id不能使用，它们有：
     *                 datagrid 开头的id ;download；app;add_list；mask;loading;L9;
     * lines（选填） textbox的行数(默认为1)
     * data_url（选填） combobox/combobox-multi 的数据源，页面会从该url获取选项内容,url返回的类型为JSONArray,每个JSONObject的格式为{"name":"xxxx","value":"xxx"}
     *                 系统向该url获取请求时(method:get)还会附带一个JSON对象，内容为task信息，有： taskName simpleApplicationObjectId processInstId auditorUserId taskId flag
     * option(选填)    combobox/combobox-multi的选项内容，其中第一个String对应选项的显示内容(即name值)，第二个String对应选项的实际提交内容(即value值)
     *                 例如option为: {{"是":"yes"},{"否":"no"}}，则该下拉框的选项为"是"和"否"，如果选了"是",则表单提交的值为"yes"
     * attr(选填)    控件的属性值，系统会自动写入控件的标签里（*同样的属性值在PC版和手机版可能会有差异）
     *               例如：attr为：{{"data-options":"editable:false,required:true"}} 的控件
     *               系统 生成的html（以PC为例） 为："<input  ##id## style='width:95%;height:##height##' class=##class##  name=##name## data-options="editable:false,required:true">
     *               不能写入的属性：id;style;class;name;placeholder;
     */
    public static class SubmitFormSingle implements Serializable{
        private String type;
        private String name;
        private String text;
        private String input_id;
        private String title;
        private int lines;
        private int row;
        private int col;
        private String data_url;
        private Map<String,String> attr;
        private Map<String,String> option;

        public String getData_url() {
            return data_url;
        }

        public void setData_url(String data_url) {
            this.data_url = data_url;
        }

        public int getLines() {
            return lines;
        }

        public void setLines(int lines) {
            this.lines = lines;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public void setCol(int col) {
            this.col = col;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }



        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInput_id() {
            return input_id;
        }

        public void setInput_id(String input_id) {
            this.input_id = input_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Map<String, String> getAttr() {
            return attr;
        }

        public void setAttr(Map<String, String> attr) {
            this.attr = attr;
        }

        public Map<String, String> getOption() {
            return option;
        }

        public void setOption(Map<String, String> option) {
            this.option = option;
        }
        public void addAttr(String name,String value){
            if(attr==null){
                attr=new HashMap<>();
            }
            attr.put(name,value);
        }
        public void addOption(String name,String value){
            if(option==null){
                option=new HashMap<>();
            }
            option.put(name,value);
        }
    }

    /**
     * SubmitButton 用于描述一个按钮
     * name(必填) 按扭的名称
     * url（必填） 当点击按钮时，系统会向该url提交表单，如果SubmitFormGroup为空，系统也会提交隐藏表单，表单内容为task的相关信息：
     *             taskName simpleApplicationObjectId processInstId auditorUserId taskId flag
     * button_id（选填）按钮的id，非特殊情况不要填，不能使用已被占用的id，他们有：
     *                  datagrid 开头的id ;download；app;add_list；mask;loading;L9;
     * icon（选填） PC版按钮的图标，手机版没有图标，可填的值有：
     *             blank;add;edit;clear;remove;save;cut;ok;no;cancel;reload;search;print;help;undo;redo;back;sum;tip;next;filter;man;lock;more;
     *
     */
    public static class SubmitButton{
        private String button_id;
        private String name;
        private String url;
        private String icon;

        public String getButton_id() {
            return button_id;
        }

        public void setButton_id(String button_id) {
            this.button_id = button_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
    public static class name_value implements Serializable{
        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
