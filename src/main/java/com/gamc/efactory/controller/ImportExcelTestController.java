package com.gamc.efactory.controller;

import com.gamc.efactory.service.ProductionService;
import com.gamc.efactory.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by UZI on 2020/3/5.
 */
@RestController
@RequestMapping("/import")
public class ImportExcelTestController {

    @Autowired
    private TestService testService;
    @PostMapping(value = "/excelIn", consumes = "multipart/*", headers = "content-type=multipart/form-data")
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
            result =  testService.addBlackLists(files);
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
        return String.valueOf(result);
    }



    private String saveFile(MultipartFile multipartFile, HttpServletRequest request) {
        String path;
        String fileName = multipartFile.getOriginalFilename();
        // 判断文件类型
        String realPath = request.getSession().getServletContext().getRealPath("/");
        String trueFileName = fileName;
        // 设置存放Excel文件的路径
        path = realPath + trueFileName;
        System.out.println(path+"11111111111111111111111111111111111111111111111111111111");
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


}
