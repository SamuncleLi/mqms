package com.gamc.efactory.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * Created by Zeho Lee on 2020/1/6.
 */
@Service
public interface MultiFilterService {
    /**
     * @描述 获取字段名与字段描述（中英文）
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/6
     * @参变量
     * @返回
     * @抛出异常
     */
    public JSONArray columnNameAndCommentQuery(String schema, String table);

    /**
     * @描述 拼接字段
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/6
     * @参变量
     * @返回
     * @抛出异常
     */
    public JSONObject multiFilterQuery(String table, String condition, String page, String rows, String orderByColumn);
}
