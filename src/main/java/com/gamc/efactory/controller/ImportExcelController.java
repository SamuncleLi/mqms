package com.gamc.efactory.controller;

import com.gamc.efactory.service.ProductionService;
import com.gamc.efactory.service.VeiDataService;
//import com.gamc.efactory.service.ProductionService;
//import com.gamc.efactory.service.SalesService;
import com.gamc.efactory.service.VeiDataService;
import com.gamc.efactory.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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
    @Autowired
    private VeiDataService veiDataService;
    @RequestMapping(value = "/veiData")
    public String exImportVeiData(@RequestParam()MultipartFile file, HttpSession session) {

        boolean a = false;

        String fileName = file.getOriginalFilename();
//        System.out.println(fileName);

        try {
            a = veiDataService.batchImport(fileName, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "数据成功导入";
    }
    @Autowired
    private ProductionService productionService;
    @RequestMapping(value = "/productionData")
    public String exImportProductionData(@RequestParam()MultipartFile file, HttpSession session) {

        boolean a = false;

        String fileName = file.getOriginalFilename();
//        System.out.println(fileName);

        try {
            a = productionService.batchImport(fileName, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "数据成功导入";
    }
}