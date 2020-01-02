package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.NewMaterialMapper;
import com.gamc.efactory.model.dataObject.Dict;
import com.gamc.efactory.model.dataObject.NewMaterial;
import com.gamc.efactory.model.dataObject.Order;
import com.gamc.efactory.service.NewMaterialService;
import com.gamc.efactory.util.AttDateUtil;
import com.gamc.efactory.util.EasyUIUtil;
import com.gamc.efactory.util.StringUtil;
import com.github.pagehelper.PageHelper;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zeho Lee on 2019/10/6.
 */
@RestController
@RequestMapping("/newMaterial")
public class NewMaterialController {
    @Autowired
    NewMaterialMapper newMaterialMapper;
    @Autowired
    NewMaterialService newMaterialService;
    
    @RequestMapping(value = "/list")
    public JSONObject listNewMaterial(NewMaterial newMaterial, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
        int total = newMaterialMapper.countNewMaterial(newMaterial);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }

        return EasyUIUtil.formatDataToDatagird(newMaterialMapper.queryNewMaterial(newMaterial), total);
    }

    /**
     * @描述 审核新增材料申请，一次只能审核一条
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/10/7
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value = "/check")
    public JSONObject checkNewMaterial(NewMaterial newMaterial){
        return newMaterialService.checkNewMaterial(newMaterial);
    }

    @RequestMapping(value = "/download")
    public void downloadOrderContract(@RequestParam(value = "ids")String newMaterialIds, HttpServletResponse response){
        String[] newMaterialIdsStr = newMaterialIds.split(",");
        Integer[] newMaterialIdsInteger = new Integer[newMaterialIdsStr.length];
        for (int i = 0; i < newMaterialIdsStr.length; i++) {
            newMaterialIdsInteger[i] = Integer.parseInt(newMaterialIdsStr[i]);
        }
        NewMaterial newMaterial = NewMaterial.QueryBuild().newMaterialIdList(newMaterialIdsInteger).state("已审核").build();
        List<NewMaterial> newMaterialList = newMaterialMapper.queryNewMaterial(newMaterial);
        try {
            String[] columnNames = {"newMaterialCode","newMaterialName","newMaterialGroup","newMaterialUnit","newMaterialSpecs","warehouseSymbol"};
            // 创建 Excel 文件的输入流对象，这里获取了项目根目录
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + new File(".").getAbsolutePath());
            InputStream excelFileInputStream = new FileInputStream("src\\main\\resources\\excel-template\\资材通用物料导入240.xls");

            // XSSFWorkbook 就代表一个 Excel 文件

            // 创建其对象，就打开这个 Excel 文件

            HSSFWorkbook workbook = new HSSFWorkbook(excelFileInputStream);

            // 输入流使用后，及时关闭！这是文件流操作中极好的一个习惯！
            HSSFSheet sheet = workbook.getSheet("资材通用数据");
            HSSFCellStyle style = workbook.createCellStyle();
            style.setBorderLeft((short) 1);
            style.setBorderRight((short) 1);
            style.setBorderTop((short) 1);
            style.setBorderBottom((short) 1);

            //数据从第三栏开始
            int dataRow = 2;

            for(int i=0;i<newMaterialList.size();i++){
                HSSFRow row = sheet.createRow(dataRow+i);
                NewMaterial newMaterialExample = newMaterialList.get(i);
                for(int j=0;j<columnNames.length;j++){
                    HSSFCell cell = row.createCell(j);
                    cell.setCellValue(EasyUIUtil.getFieldValueByName(columnNames[j], newMaterialExample));
                    cell.setCellStyle(style);
                }
            }

            String filename = URLEncoder.encode("资材通用物料导入240.xls","UTF8");
            OutputStream output = response.getOutputStream();
            response.reset();
            response.setHeader("Content-disposition", "attachment; filename=\"" + filename + "\"");
            response.setContentType("application/msexcel");

            workbook.write(output);
            output.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
