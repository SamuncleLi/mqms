package com.gamc.efactory.util;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * Created by Zeho Lee on 2019/1/6.
 */
public class EasyUIUtil {
    //泛型方法
    /**
     * @描述 生成Datagrid数据格式
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/1/24
     * @参变量
     * @返回
     * @抛出异常
    */
    public static <T> JSONObject formatDataToDatagird(List<T> objects, int total){
        JSONObject result = new JSONObject();
        String[] fieldNames;
        //todo object为空的防错
        if(objects.size() == 0){
            return new JSONObject();
        }
        fieldNames = getFieldName(objects.get(0));
        JSONArray jsonArray = new JSONArray();
        for (T o : objects) {
            JSONObject jsonObject = new JSONObject();
            for (String fieldName : fieldNames) {
                jsonObject.put(fieldName, getFieldValueByName(fieldName,o));
            }
            jsonArray.add(jsonObject);
        }
        result.put("rows", jsonArray);
        result.put("total", total);
        return result;
    }

    /**
     * @描述 生成combobox数据格式
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/1/24
     * @参变量
     * @返回
     * @抛出异常
    */
    public static <T> JSONArray formatDataToComboBox(List<?> objects) {
        JSONArray result = new JSONArray();
        String[] fieldNames;
        //todo object为空的防错
        fieldNames = getFieldName(objects.get(0));
        for (Object o : objects) {
            JSONObject jsonObject = new JSONObject();
            for (String fieldName : fieldNames) {
                jsonObject.put(fieldName, getFieldValueByName(fieldName, o));
                if(fieldName.equals("dictDefault") && getFieldValueByName(fieldName, o).equals("1")){
                    jsonObject.put("selected", getFieldValueByName(fieldName, o));
                }
            }
            result.add(jsonObject);
        }
        return result;
    }

    /**
     * @描述 生成treegrid主树的数据格式
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/3/5
     * @参变量
     * @返回
     * @抛出异常
    */
    public static <T> JSONObject formatDataToTreegirdParent(Map<?,?> map) {
        int idFiled = 0;
        JSONArray jsonArray = new JSONArray();
        //遍历map获取key
        for (Map.Entry<?,?> entry : map.entrySet()) {
            idFiled++;
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("treeField", entry.getKey());
            jsonObject.put("idField", idFiled);
            jsonObject.put("info", entry.getValue());
            jsonArray.add(jsonObject);
        }

        JSONObject result = new JSONObject();
        result.put("total", idFiled);
        result.put("rows", jsonArray);
        return result;

    }

    /**
     * @描述 生成treegrid的子树数据格式
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/3/5
     * @参变量
     * @返回
     * @抛出异常
    */
    public static JSONArray formatDataToTreegirdParent(List objects){
        JSONArray result = new JSONArray();
        String[] fieldNames;
        //todo object为空的防错
        fieldNames = getFieldName(objects.get(0));
        for (Object o : objects) {
            JSONObject jsonObject = new JSONObject();
            for (String fieldName : fieldNames) {
                jsonObject.put(fieldName, getFieldValueByName(fieldName, o));
            }
            result.add(jsonObject);
        }
        return result;
    }

    //获取属性名
    public static String[] getFieldName(Object o){
        Field[] fields=o.getClass().getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        for(int i=0;i<fields.length;i++){
            System.out.println(fields[i].getType());
            fieldNames[i]=fields[i].getName();
        }
        return fieldNames;
    }

    //使用反射通过对象获取属性的值
    public static <T> String getFieldValueByName(String fieldName, Object o) {
        try {
            // 通过属性获取对象的属性
            Field field = o.getClass().getDeclaredField(fieldName);
            // 对象的属性的访问权限设置为可访问
            field.setAccessible(true);
            // 获取属性的对应的值
            if (field.get(o) == null){
                return null;
            }
            else {
                String value = field.get(o).toString();
                return value;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //通过属性名设置属性
    public static void setFieldValueByName(String fieldName, Object o, Object value) {
        try {
            // 通过属性获取对象的属性
            Field field = o.getClass().getDeclaredField(fieldName);
            // 对象的属性的访问权限设置为可访问
            field.setAccessible(true);
            // 获取属性的对应的值
            field.set(o, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
