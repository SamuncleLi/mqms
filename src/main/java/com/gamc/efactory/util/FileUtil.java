package com.gamc.efactory.util;

import com.gamc.efactory.config.Config;
import com.gamc.efactory.dao.MqmsFailureTrackMapper;
import com.gamc.efactory.model.dataObject.MqmsFailureTrack;
import com.gamc.efactory.model.dataObject.SimpleApplicationObject;
import com.gamc.efactory.model.dataObject.User;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Zehao on 2020/3/23.
 */
public class FileUtil {
    public static MqmsFailureTrack fileUpload(List<MultipartFile> file, SimpleApplicationObject simpleApplicationObject, User user, MqmsFailureTrack mqmsFailureTrack, String appendix) throws Exception{
        for(MultipartFile multipartFile:file){
            byte[] bytes = multipartFile.getBytes();
            Resource resource = new ClassPathResource("");
            System.out.println(resource.getFile().getAbsolutePath());
            //建文件夹
            File dir = new File(Config.windowsFile.getVarName() + "\\" + mqmsFailureTrack.getFailureTrackId());
            dir.mkdir();
            //保存文件
            Path path = Paths.get(Config.windowsFile.getVarName() + "\\" + mqmsFailureTrack.getFailureTrackId() + "\\" + simpleApplicationObject.getTaskName() + user.getUserName() + "-" + multipartFile.getOriginalFilename());
            Files.write(path, bytes);
            if(StringUtil.isNotEmpty(appendix)){
                appendix = appendix + ",,";
            }
            else {
                appendix = "";
            }
            appendix = appendix + mqmsFailureTrack.getFailureTrackId() + "/" + simpleApplicationObject.getTaskName() + user.getUserName() + "-" + multipartFile.getOriginalFilename();
        }
        mqmsFailureTrack.setAppendix(appendix);
        return mqmsFailureTrack;
    }
}
