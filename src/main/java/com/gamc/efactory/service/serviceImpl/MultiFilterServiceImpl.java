package com.gamc.efactory.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.ColumnNameAndCommentMapper;
import com.gamc.efactory.model.dataObject.ColumnNameAndComment;
import com.gamc.efactory.service.MultiFilterService;
import com.gamc.efactory.util.EasyUIUtil;
import com.gamc.efactory.util.StringUtil;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Zeho Lee on 2020/1/6.
 */
@Service
public class MultiFilterServiceImpl implements MultiFilterService{
    Logger logger = LoggerFactory.getLogger(MultiFilterServiceImpl.class);
    @Autowired
    ColumnNameAndCommentMapper columnNameAndCommentMapper;
    /**
     * @描述 获取字段名与字段描述（中英文）
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/6
     * @参变量
     * @返回
     * @抛出异常
     */
    public JSONArray columnNameAndCommentQuery(String schema, String table){
        JSONArray result = new JSONArray();
        try{
            List<ColumnNameAndComment> columnNameAndComments = columnNameAndCommentMapper.getColumnNameAndComment(schema, table);
            result = EasyUIUtil.formatDataToComboBox(columnNameAndComments);
            return result;
        }
        catch (Exception e){
            logger.error(e.getMessage());
            return result;
        }
    }

    /**
     * @描述 拼接字段
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/6
     * @参变量
     * @返回
     * @抛出异常
     */
    public JSONObject multiFilterQuery(String table, String condition, String page, String rows, String orderByColumn){
        JSONObject result = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject json=JSONObject.parseObject(condition);

        String str_temp="";
        if(StringUtil.isNotEmpty(condition)) {
            int rowLength = Integer.parseInt(json.get("rowLength").toString());
            for (int i = 0; i < rowLength; i++) {
                if (json.get("QueryCondition[" + i + "].conditionOption").equals("equal")) {
                    str_temp += " and " + json.get("QueryCondition[" + i + "].conditionField").toString() + " ='" + json.get("QueryCondition[" + i + "].conditionValue").toString() + "'";
                } else if (json.get("QueryCondition[" + i + "].conditionOption").equals("like")) {
                    str_temp += " and " + json.get("QueryCondition[" + i + "].conditionField").toString() + " like '%" + json.get("QueryCondition[" + i + "].conditionValue").toString() + "%'";
                } else if (json.get("QueryCondition[" + i + "].conditionOption").equals("between")) {
                    str_temp += " and " + json.get("QueryCondition[" + i + "].conditionField").toString() + " BETWEEN '" + json.get("QueryCondition[" + i + "].conditionValueLeft").toString() + "' and '" + json.get("QueryCondition[" + i + "].conditionValueRight").toString() + "' ";
                } else if (json.get("QueryCondition[" + i + "].conditionOption").equals("greater")) {
                    str_temp += " and " + json.get("QueryCondition[" + i + "].conditionField").toString() + " >='" + json.get("QueryCondition[" + i + "].conditionValue").toString() + "'";
                } else if (json.get("QueryCondition[" + i + "].conditionOption").equals("less")) {
                    str_temp += " and " + json.get("QueryCondition[" + i + "].conditionField").toString() + " <='" + json.get("QueryCondition[" + i + "].conditionValue").toString() + "'";
                } else if (json.get("QueryCondition[" + i + "].conditionOption").equals("unequal")) {
                    str_temp += " and " + json.get("QueryCondition[" + i + "].conditionField").toString() + " <>'" + json.get("QueryCondition[" + i + "].conditionValue").toString() + "'";
                }
            }
        }

        int total = columnNameAndCommentMapper.multiFilterCount(table, str_temp);
        if(page != null && rows != null && orderByColumn !=null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows),  orderByColumn + " desc");
        }
        List<HashMap<String, String>> list = columnNameAndCommentMapper.multiFilter(table, str_temp);
        for(HashMap obj:list){
            JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(obj));
            jsonArray.add(jsonObject);
        }

        result.put("total", total);
        result.put("rows", jsonArray);
        return result;
    }
}
