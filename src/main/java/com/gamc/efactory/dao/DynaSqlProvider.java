package com.gamc.efactory.dao;

import com.gamc.efactory.util.StringUtil;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Zeho Lee on 2020/1/9.
 * 动态sql拼接
 */
public class DynaSqlProvider {
//    public String dynaInsert(String table, final Student student){
//        return new SQL(){
//            {
//                INSERT_INTO("t_student");
//                if(student.getName()!=null){
//                    VALUES("name", "#{name}");
//                }
//                if(student.getAge()!=null){
//                    VALUES("age", "#{age}");
//                }
//            }
//        }.toString();
//    }
//
//    public String updateDy(final Student student){
//        return new SQL(){
//            {
//                UPDATE("t_student");
//                if(student.getName()!=null){
//                    SET("name=#{name}");
//                }
//                if(student.getAge()!=null){
//                    SET("age=#{age}");
//                }
//                WHERE("id=#{id}");
//            }
//        }.toString();
//    }
//
//    public String deleteStudent(){
//        return new SQL(){
//            {
//                DELETE_FROM("t_student");
//                WHERE("id=#{id}");
//            }
//        }.toString();
//    }
//
//    public String getStudentById(){
//        return new SQL(){
//            {
//                SELECT("*");
//                FROM("t_student");
//                WHERE("id=#{id}");
//            }
//        }.toString();
//    }

//    @Select("select * from ${table} <if test=\"condition!=null\">\n" +
//            "                        ${condition}\n" +
//            "                    </if> limit ${begin}, ${end}")
//    @ResultType(HashMap.class)
//    public List<HashMap<String, String>> multiFilter(@Param("table")String table, @Param("condition")String condition, @Param("begin")int begin, @Param("end")int end);


    //动态查询语句的拼接
    public String dynaSelect(final String table, final String condition){
        return new SQL(){
            {
                SELECT("*");
                FROM(table);
                StringBuffer sb=new StringBuffer();
                if(StringUtil.isNotEmpty(condition)){
                    sb.append(condition);
                }
                if(!sb.toString().equals("")){
                    WHERE(sb.toString().replaceFirst("and", ""));
                }
            }
        }.toString();
    }

    public String dynaSelectCount(final String table, final String condition){
        return new SQL(){
            {
                SELECT("count(*)");
                FROM(table);
                StringBuffer sb=new StringBuffer();
                if(StringUtil.isNotEmpty(condition)){
                    sb.append(condition);
                }
                if(!sb.toString().equals("")){
                    WHERE(sb.toString().replaceFirst("and", ""));
                }
            }
        }.toString();
    }
}
