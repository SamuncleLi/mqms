package com.gamc.efactory.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gamc.efactory.config.Config;
import com.gamc.efactory.dao.MqmsFailureAnalysisMapper;
import com.gamc.efactory.dao.MqmsFailureTrackMapper;
import com.gamc.efactory.dao.MqmsVoucherMapper;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.FailureTrackService;
import com.gamc.efactory.util.AttDateUtil;
import com.gamc.efactory.util.AttHttpRequestUtil;
import com.gamc.efactory.util.StringUtil;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zeho Lee on 2020/3/13.
 */
@Service
public class FailureTrackServiceImpl implements FailureTrackService{
    @Autowired
    MqmsVoucherMapper mqmsVoucherMapper;
    @Autowired
    MqmsFailureTrackMapper mqmsFailureTrackMapper;
    @Autowired
    MqmsFailureAnalysisMapper mqmsFailureAnalysisMapper;
    //获取基础信息
    public ProcessForm.DataDisplayGroup getBasicInfo(String voucherCode) throws IOException {
        MqmsVoucher mqmsVoucher = new MqmsVoucher();
        mqmsVoucher.setVoucherCode(voucherCode);
        mqmsVoucher = mqmsVoucherMapper.queryMqmsVoucherLimit1(mqmsVoucher);
        ObjectMapper objectMapper = new ObjectMapper();

        String structure1 = "[[1, 1, 1, 1], [1, 1, 1, 1],[1, 1, 1, 1],[4]]";
        List<List<Integer>> mStructure1 = objectMapper.readValue(structure1.toString(), List.class);
        ProcessForm.DataDisplaySingle single1 = new ProcessForm.DataDisplaySingle();
        single1.setTitle("质量反馈单号");
        single1.setType("text");
        single1.setContent(mqmsVoucher.getVoucherCode());
        single1.setCol(1);
        single1.setRow(1);
        ProcessForm.DataDisplaySingle single2 = new ProcessForm.DataDisplaySingle();
        single2.setTitle("vin码");
        single2.setType("text");
        single2.setContent(mqmsVoucher.getVinCode());
        single2.setCol(2);
        single2.setRow(1);
        ProcessForm.DataDisplaySingle single3 = new ProcessForm.DataDisplaySingle();
        single3.setTitle("零件代码");
        single3.setType("text");
        single3.setContent(mqmsVoucher.getPartsCode());
        single3.setCol(3);
        single3.setRow(1);
        ProcessForm.DataDisplaySingle single4 = new ProcessForm.DataDisplaySingle();
        single4.setTitle("零件名称");
        single4.setType("text");
        single4.setContent(mqmsVoucher.getPartsName());
        single4.setCol(4);
        single4.setRow(1);
        ProcessForm.DataDisplaySingle single5 = new ProcessForm.DataDisplaySingle();
        single5.setTitle("故障日期");
        single5.setType("text");
        single5.setContent(mqmsVoucher.getFailureDate());
        single5.setCol(1);
        single5.setRow(2);
        ProcessForm.DataDisplaySingle single6 = new ProcessForm.DataDisplaySingle();
        single6.setTitle("销售店");
        single6.setType("text");
        single6.setContent(mqmsVoucher.getDealerName());
        single6.setCol(2);
        single6.setRow(2);
        ProcessForm.DataDisplaySingle single7 = new ProcessForm.DataDisplaySingle();
        single7.setTitle("发动机或变速箱");
        single7.setType("text");
        single7.setContent(mqmsVoucher.getEngOrTran());
        single7.setCol(3);
        single7.setRow(2);
        ProcessForm.DataDisplaySingle single8 = new ProcessForm.DataDisplaySingle();
        single8.setTitle("eng整理");
        single8.setType("text");
        single8.setContent(mqmsVoucher.getEngArrange());
        single8.setCol(4);
        single8.setRow(2);
        ProcessForm.DataDisplaySingle single11 = new ProcessForm.DataDisplaySingle();
        single11.setTitle("发动机号");
        single11.setType("text");
        single11.setContent(mqmsVoucher.getEgtypeCode());
        single11.setCol(1);
        single11.setRow(3);
        ProcessForm.DataDisplaySingle single10 = new ProcessForm.DataDisplaySingle();
        single10.setTitle("变速箱号");
        single10.setType("text");
        single10.setContent(mqmsVoucher.getTransmissionCode());
        single10.setCol(2);
        single10.setRow(3);
        ProcessForm.DataDisplaySingle single9 = new ProcessForm.DataDisplaySingle();
        single9.setTitle("诊断结果");
        single9.setType("text");
        single9.setContent(mqmsVoucher.getDiagnosticResult());
        single9.setCol(1);
        single9.setRow(4);
        ProcessForm.DataDisplayGroup group = new ProcessForm.DataDisplayGroup();
        group.addData(single1);
        group.addData(single2);
        group.addData(single3);
        group.addData(single4);
        group.addData(single5);
        group.addData(single6);
        group.addData(single7);
        group.addData(single8);
        group.addData(single9);
        group.addData(single10);
        group.addData(single11);
        group.setGroup_name("基本信息");

        group.setStructure(mStructure1);
        return group;
    }

    //获取历史填写信息
    public ProcessForm.DataDisplayGroup getPreviousInfo(int failureTrackId) throws Exception{
        ProcessForm.DataDisplayGroup group = new ProcessForm.DataDisplayGroup();

        MqmsFailureTrack mqmsFailureTrack = new MqmsFailureTrack();
        mqmsFailureTrack.setFailureTrackId(failureTrackId);
        mqmsFailureTrack = mqmsFailureTrackMapper.queryMqmsFailureTrackLimit1(mqmsFailureTrack);

        ObjectMapper objectMapper = new ObjectMapper();

        String structure1 = "[[1, 1, 1, 1], [2,2], [2,1,1]]";
        List<List<Integer>> mStructure1 = objectMapper.readValue(structure1.toString(), List.class);
        ProcessForm.DataDisplaySingle single1 = new ProcessForm.DataDisplaySingle();
        single1.setTitle("负责人");
        single1.setType("text");
        single1.setContent(mqmsFailureTrack.getTrackBeginerName());
        single1.setCol(1);
        single1.setRow(1);
        ProcessForm.DataDisplaySingle single2 = new ProcessForm.DataDisplaySingle();
        single2.setTitle("外观检查");
        single2.setType("text");
        single2.setContent(mqmsFailureTrack.getAppearance());
        single2.setCol(2);
        single2.setRow(1);
        ProcessForm.DataDisplaySingle single3 = new ProcessForm.DataDisplaySingle();
        single3.setTitle("故障再现人");
        single3.setType("text");
        single3.setContent(mqmsFailureTrack.getFailureReappearPersonName());
        single3.setCol(3);
        single3.setRow(1);
        ProcessForm.DataDisplaySingle single4 = new ProcessForm.DataDisplaySingle();
        single4.setTitle("再现日期");
        single4.setType("text");
        single4.setContent(mqmsFailureTrack.getFailureReappearDate());
        single4.setCol(4);
        single4.setRow(1);
        ProcessForm.DataDisplaySingle single5 = new ProcessForm.DataDisplaySingle();
        single5.setTitle("再现工况");
        single5.setType("text");
        single5.setContent(mqmsFailureTrack.getFailureReappearSituation());
        single5.setCol(1);
        single5.setRow(2);
        ProcessForm.DataDisplaySingle single6 = new ProcessForm.DataDisplaySingle();
        single6.setTitle("再现结果");
        single6.setType("text");
        single6.setContent(mqmsFailureTrack.getFailureReappearResult());
        single6.setCol(3);
        single6.setRow(2);
        ProcessForm.DataDisplaySingle single7 = new ProcessForm.DataDisplaySingle();
        single7.setTitle("解析科室");
        single7.setType("text");
        single7.setContent(mqmsFailureTrack.getAnalysisDepartments());
        single7.setCol(1);
        single7.setRow(3);
        ProcessForm.DataDisplaySingle single8 = new ProcessForm.DataDisplaySingle();
        single8.setTitle("解析截点");
        single8.setType("text");
        single8.setContent(mqmsFailureTrack.getAnalysisDeadline());
        single8.setCol(3);
        single8.setRow(3);
        ProcessForm.DataDisplaySingle single9 = new ProcessForm.DataDisplaySingle();
        single9.setTitle("解析要求");
        single9.setType("text");
        single9.setContent(mqmsFailureTrack.getAnalysisRequirement());
        single9.setCol(4);
        single9.setRow(3);
        group.addData(single1);
        group.addData(single2);
        group.addData(single3);
        group.addData(single4);
        group.addData(single5);
        group.addData(single6);
        group.addData(single7);
        group.addData(single8);
        group.addData(single9);
        group.setGroup_name("不良追踪信息");

        group.setStructure(mStructure1);

        return group;
    }

    //获取附件信息
    public ProcessForm.DataDisplayGroup getAppendixInfo(int failureTrackId) throws Exception{
        ProcessForm.DataDisplayGroup group = new ProcessForm.DataDisplayGroup();

        MqmsFailureTrack mqmsFailureTrack = new MqmsFailureTrack();
        mqmsFailureTrack.setFailureTrackId(failureTrackId);
        mqmsFailureTrack = mqmsFailureTrackMapper.queryMqmsFailureTrackLimit1(mqmsFailureTrack);

        ObjectMapper objectMapper = new ObjectMapper();

        String appendix = mqmsFailureTrack.getAppendix();
        //判空
        if(StringUtil.isNotEmpty(appendix)){
            String[] appendixs = appendix.split(",,");
            int rows = appendixs.length/4 + 1;
            String rowStructure = "[1,1,1,1]";

            String structure1 = "[";
            for(int i=0;i<rows;i++){
                structure1 += rowStructure;
            }
            structure1+="]";
            List<List<Integer>> mStructure1 = objectMapper.readValue(structure1.toString(), List.class);
            for(int i=0;i<appendixs.length;i++){
                ProcessForm.DataDisplaySingle single = new ProcessForm.DataDisplaySingle();
                single.setTitle(appendixs[i]);
                single.setType("file");
                single.setContent(Config.windowsDownloadPrefix.getVarName() + appendixs[i]);
                single.setCol(i % 4 + 1);
                single.setRow(i / 4 + 1);
                group.addData(single);
            }
            group.setGroup_name("附件信息");

            group.setStructure(mStructure1);

            return group;
        }
        else {
            return null;
        }

    }

    //上传附件
    public MqmsFailureTrack fileUpload(List<MultipartFile> file, SimpleApplicationObject simpleApplicationObject, User user, MqmsFailureTrack mqmsFailureTrack, String appendix) throws Exception{
        System.out.println(file.get(0).isEmpty());
        //如果没有上传文件
        if(file.get(0).isEmpty()){
            return mqmsFailureTrack;
        }
        else{
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

    //获取多实例解析信息
    public ProcessForm.DataDisplayGroup getEngineerInfo(int failureTrackId, String flag) throws Exception{
        //获取comment数量
        MqmsFailureAnalysis mqmsFailureAnalysis = new MqmsFailureAnalysis();
        List<MqmsFailureAnalysis> mqmsFailureAnalysisList = mqmsFailureAnalysisMapper.queryMqmsFailureAnalysis(mqmsFailureAnalysis.QueryBuild().failureTrackId(failureTrackId).flag(flag));

        int count=0;
        ProcessForm.DataDisplayGroup group = new ProcessForm.DataDisplayGroup();
        String rowStructure = "[4],";
        String structure1 = "[";
        for(int i=0;i<mqmsFailureAnalysisList.size();i++){
            structure1 += rowStructure;
        }
        structure1 = structure1.substring(0, structure1.length() - 1);
        structure1 += "]";
        //展现评论
        for(int i=0;i<mqmsFailureAnalysisList.size();i++){
            String comment = mqmsFailureAnalysisList.get(i).getFailureAnalystComment();
            if(StringUtil.isNotEmpty(comment)){
                ProcessForm.DataDisplaySingle single = new ProcessForm.DataDisplaySingle();
                single.setTitle(mqmsFailureAnalysisList.get(i).getFailureAnalystName());
                single.setType("text");
                single.setContent(comment);
                single.setCol(1);
                single.setRow(i + 1);
                group.addData(single);
            }
        }
        group.setGroup_name("解析信息");
        ObjectMapper objectMapper = new ObjectMapper();
        List<List<Integer>> mStructure1 = objectMapper.readValue(structure1.toString(), List.class);
        group.setStructure(mStructure1);

        return group;
    }

    //获取工程师解析信息
    public List<ProcessForm.DataDisplayGroup> getAllEngineerInfo(int failureTrackId) throws Exception{
        //获取flag数
        List<String> flags = mqmsFailureAnalysisMapper.queryFlags(failureTrackId);
        List<ProcessForm.DataDisplayGroup> res = new ArrayList<>(flags.size());
        for(String flag:flags) {
            ProcessForm.DataDisplayGroup group = new ProcessForm.DataDisplayGroup();
            group = getEngineerInfo(failureTrackId, flag);
            res.add(group);
        }
        return res;
    }


}
