package com.gamc.efactory.service;

import com.gamc.efactory.model.dataObject.MqmsFailureTrack;
import com.gamc.efactory.model.dataObject.ProcessForm;
import com.gamc.efactory.model.dataObject.SimpleApplicationObject;
import com.gamc.efactory.model.dataObject.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * Created by Zeho Lee on 2020/3/13.
 */
public interface FailureTrackService {
    //获取基础信息
    public ProcessForm.DataDisplayGroup getBasicInfo(String vooucherCode) throws IOException;
    //获取历史填写信息
    public ProcessForm.DataDisplayGroup getPreviousInfo (int failureTrackId) throws Exception;
    //获取附件信息
    public ProcessForm.DataDisplayGroup getAppendixInfo(int failureTrackId) throws Exception;
    //文件上传
    public MqmsFailureTrack fileUpload(List<MultipartFile> file, SimpleApplicationObject simpleApplicationObject, User user, MqmsFailureTrack mqmsFailureTrack, String appendix) throws Exception;
    //获取工程师解析信息
    public ProcessForm.DataDisplayGroup getEngineerInfo(int failureTrackId, String flag) throws Exception;
}
