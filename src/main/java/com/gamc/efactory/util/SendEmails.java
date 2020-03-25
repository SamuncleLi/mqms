package com.gamc.efactory.util;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gamc.efactory.model.dataObject.ProcessForm;
import com.gamc.efactory.model.dataObject.ProcessForm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xxjs-gd-llf
 * DATETIME:2017/10/9 11:37
 * Description:
 */
public class SendEmails {


    public static void main(String[] args) {

//        String mail = "lizeh@gacmotor.com,limz@gacmotor.com";//发送对象的邮箱
       /* String mail = "lzhshenqing@126.com";
        //String mail = "gaoyh@gacmotor.com"; //发送对象的邮箱
        //String mail = "13631312014@163.com"; //发送对象的邮箱
        String title = "系统测试邮件，请勿回复";
        String content = "<div>系统测试邮件，请勿回复!</div><br/><hr/><a href='http://localhost:8080/qc_main.jsp'>http://localhost:8080/qc_main.jsp</a>";
        MailInfo info = new MailInfo();
        info.setToAddress(mail);
        info.setSubject(title);
        info.setContent(content);
        try{
            MailSend.sendHtmlMail(info);
        }catch(Exception e){
            System.out.print("'"+title+"'的邮件发送失败！");
            e.printStackTrace();
        }*/

      /* List<List<String>> list=new ArrayList<>();
       List<String> a=new ArrayList<>();
       a.add("1");a.add("2");a.add("3");a.add("4");
        List<String> b=new ArrayList<>();
        b.add("1");b.add("2");b.add("3");b.add("4");
        list.add(a);list.add(b);
        System.out.println(list.toString());*/
       /* String str="[[1, 2, 1], [1, 1, 1, 1]]";
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            List<List<Integer>> list = objectMapper.readValue(str, List.class);
            System.out.println(list.toString());
        }catch (Exception e){
            e.printStackTrace();
        }*/
        try {
        ObjectMapper objectMapper=new ObjectMapper();
        ProcessForm processForm=new ProcessForm();

        String structure1="[[1, 1, 1, 1], [2, 2]]";
        List<List<Integer>> mStructure1=objectMapper.readValue(structure1.toString(),List.class);
        ProcessForm.DataDisplaySingle single1=new ProcessForm.DataDisplaySingle();
        single1.setTitle("标题1");
        single1.setType("text");
        single1.setContent("sssssssssssssssss");
        single1.setCol(1);
        single1.setRow(1);
        ProcessForm.DataDisplaySingle single2=new ProcessForm.DataDisplaySingle();
        single2.setTitle("标题2");
        single2.setType("text");
        single2.setContent("ddddddddddddddd");
        single2.setCol(2);
        single2.setRow(1);
        ProcessForm.DataDisplaySingle single3=new ProcessForm.DataDisplaySingle();
        single3.setTitle("图片");
        single3.setType("image");
        single3.setContent("http://192.168.100.250:8081/test/generic/web/20191216-000001-before1");
        single3.setCol(1);
        single3.setRow(2);
        ProcessForm.DataDisplaySingle single4=new ProcessForm.DataDisplaySingle();
        single4.setTitle("文件");
        single4.setType("file");
        single4.setContent("https://downpack.baidu.com/litebaiduboxapp_AndroidPhone_1020164i.apk");
        single4.setCol(3);
        single4.setRow(2);
        ProcessForm.DataDisplayGroup group=new ProcessForm.DataDisplayGroup();
        group.addData(single1);group.addData(single2);group.addData(single3);group.addData(single4);
        group.setGroup_name("group1");


        group.setStructure(mStructure1);
        processForm.addNormalData(group);
        String structure2="[[1, 1, 1, 1], [1, 1, 1, 1]]";
        ProcessForm.SubmitFormGroup submitFormGroup=new ProcessForm.SubmitFormGroup();
        ProcessForm.SubmitFormSingle submitFormSingle1=new ProcessForm.SubmitFormSingle();
        submitFormSingle1.setType("textbox");
        submitFormSingle1.setTitle("textbox");
        submitFormSingle1.setName("textbox");
        submitFormSingle1.setRow(1);
        submitFormSingle1.setCol(1);
        ProcessForm.SubmitFormSingle submitFormSingle2=new ProcessForm.SubmitFormSingle();
        submitFormSingle2.setType("combobox-multi");
        submitFormSingle2.setTitle("combobox-multi");
        submitFormSingle2.setName("combobox-multi");
        submitFormSingle2.setRow(1);
        submitFormSingle2.setCol(2);
        submitFormSingle2.setData_url("/static/test.json");
//        submitFormSingle2.addOption("ss","ss");
//        submitFormSingle2.addOption("aa","aa");
        submitFormGroup.addSubmitSingle(submitFormSingle1);submitFormGroup.addSubmitSingle(submitFormSingle2);
        List<List<Integer>> mStructure2=null;

            mStructure2=objectMapper.readValue(structure2.toString(),List.class);

        submitFormGroup.setStructure(mStructure2);
        processForm.setSubmitForm(submitFormGroup);
        ProcessForm.SubmitButton submitButton=new ProcessForm.SubmitButton();

        submitButton.setName("提交");
        submitButton.setUrl("ssss");
        processForm.addSubmitButton(submitButton);
        JSONObject jsonObject=new JSONObject();
        JSONArray shrIds=new JSONArray();
        JSONObject variables=new JSONObject();
        variables.put("arrayVariables",shrIds);
        JSONObject proCK=new JSONObject();
        proCK.put("xz",1279);
        proCK.put("kz",1279);
        variables.put("processChecker",proCK);
        jsonObject.put("variables", variables.toString());
        jsonObject.put("processName","qc_produce_question");
        jsonObject.put("userId",1279);
        jsonObject.put("userName","ss");
        jsonObject.put("applyTime",AttDateUtil.getNow("standard"));
        jsonObject.put("formName","design_imp_account_auth");
        jsonObject.put("formId",1);
        jsonObject.put("simpleReason","simple");
        jsonObject.put("processInstTitle","活动表单");
        String str=objectMapper.writeValueAsString(processForm);
        jsonObject.put("form_data",str);
        String url="http://localhost:8081/process/SAO/build";

            AttHttpRequestUtil.httpPost(url, jsonObject, false);
        }catch (Exception e){

        }




    }

}
