package com.gamc.efactory.controller;

import com.gamc.efactory.model.dataObject.User;
import com.gamc.efactory.service.*;
//import com.gamc.efactory.service.ProductionService;
//import com.gamc.efactory.service.SalesService;
import com.gamc.efactory.service.VeiDataService;
import com.gamc.efactory.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by UZI on 2019/12/30.
 */
@RestController
@RequestMapping("/import")
public class ImportExcelController {
//    @RequestMapping("/upload")
//    public void uploadFile(@RequestParam("file") MultipartFile file){
//        try{
//            List<List<String>> results = ExcelUtil.importXlsx(file.getInputStream());
////            System.out.println(results.get(1).get(1));
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    @Autowired
//    private ProductionService productionService;
//    @RequestMapping(value = "/production")
//    public String exImport_production(@RequestParam()MultipartFile file, HttpSession session) {
//
//        boolean a = false;
//
//        String fileName = file.getOriginalFilename();
////        System.out.println(fileName);
//
//        try {
//            a = productionService.batchImport(fileName, file);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "数据成功导入";
//    }
//    @Autowired
//    private SalesService salesService;
//    @RequestMapping(value = "/sales")
//    public String exImport_sales(@RequestParam()MultipartFile file, HttpSession session) {
//
//        boolean a = false;
//
//        String fileName = file.getOriginalFilename();
////        System.out.println(fileName);
//
//        try {
//            a = salesService.batchImport(fileName, file);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "数据成功导入";
//    }
    /**
     * VEI数导入
     */
    @Autowired
    private VeiDataService veiDataService;
    @RequestMapping(value = "/veiData")
    public String exImportVeiData(@RequestParam("file")MultipartFile multipartFile,HttpServletRequest request) {

        //判断上传内容是否符合要求
        String fileName = multipartFile.getOriginalFilename();
        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
            return "上传的文件格式不正确";
        }

        String files = saveFile(multipartFile, request);
        int result = 0;
        try {
            result =  veiDataService.addLists(files,request);
            System.out.println(result+"555555555555555555555555555555555555555555555555555555555");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            File file = new File(files);
            System.gc();
            boolean delSuccess = file.delete();
            if(delSuccess){
                System.out.println("删除文件成功");
            }else{
                System.out.println("删除文件失败");
            }
        }
        if(result==1){
            return "文件上传成功";}
        else{
            return "文件上传失败";}
    }

    /**
     * 生产数据导入
     */
    @Autowired
    private ProductionService productionService;
    @RequestMapping(value = "/productionData")
    public String exImportProductionData(@RequestParam("file")MultipartFile multipartFile,HttpServletRequest request) {


            //判断上传内容是否符合要求
            String fileName = multipartFile.getOriginalFilename();
            if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
                return "上传的文件格式不正确";
            }

            String files = saveFile(multipartFile, request);
            int result = 0;
            try {
                result =  productionService.addLists(files,request);
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                File file = new File(files);
                System.gc();
                boolean delSuccess = file.delete();
                if(delSuccess){
                    System.out.println("删除文件成功");
                }else{
                    System.out.println("删除文件失败");
            }
            }
            if(result==1){
                return "文件上传成功";}
            else{
                return "文件上传失败";}
        }

    /**
     * 销售数据导入
     */
    @Autowired
    private SalesService salesService;
//    @PostMapping(value = "/salesData", consumes = "multipart/*", headers = "content-type=multipart/form-data")
    @RequestMapping(value = "/salesData")
    public String addBlacklist(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request

        ) {
            //判断上传内容是否符合要求
            String fileName = multipartFile.getOriginalFilename();
            if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
                return "上传的文件格式不正确";
            }

            String files = saveFile(multipartFile, request);
            int result = 0;
            try {
                result =  salesService.addLists(files,request);
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                File file = new File(files);
                System.gc();
                boolean delSuccess = file.delete();
                if(delSuccess){
                    System.out.println("删除文件成功");
                }else{
                    System.out.println("删除文件失败");
                }
            }
            if(result==1){
                return "文件上传成功";}
            else{
                return "文件上传失败";}
        }

//    public String exImportSalesData(@RequestParam()MultipartFile file, HttpSession session) {
//
//        boolean a = false;
//
//        String fileName = file.getOriginalFilename();
////        System.out.println("111111111111111111111111111111111111111111");
////        System.out.println(fileName);
//
//        try {
//            a = salesService.batchImport(fileName, file, session);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "数据成功导入";

    /**
     * 复制文件到服务器本地
     * @param multipartFile
     * @param request
     * @return
     */
        private String saveFile(MultipartFile multipartFile, HttpServletRequest request) {
            String path;
            String fileName = multipartFile.getOriginalFilename();
            // 判断文件类型
            String realPath = request.getSession().getServletContext().getRealPath("/");
            String uuid = UUID.randomUUID().toString();
//            System.out.println(realPath+"1222222222222222222222222222222222222222222222222222222222222222222222222");
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
            String trueFileName = fileName+uuid;
            // 设置存放Excel文件的路径
            path = realPath + trueFileName;
            //C:\Users\UZI\AppData\Local\Temp\tomcat-docbase.3729691707234394010.8086\
            File file = new File(path);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
            try {
                multipartFile.transferTo(new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }

            return path;
        }



    @Autowired
    private SalesPointService salesPointService;
    @RequestMapping(value = "/salesPointData")
    public String exImportSalesPointData(@RequestParam()MultipartFile file, HttpSession session) {

        boolean a = false;

        String fileName = file.getOriginalFilename();
//        System.out.println((User)session.getAttribute("user"));

        try {
            a = salesPointService.batchImport(fileName, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "数据成功导入";
    }
}