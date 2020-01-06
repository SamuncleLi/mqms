package com.gamc.efactory.dao;

import com.gamc.efactory.model.dataObject.ColumnNameAndComment;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Zeho Lee on 2020/1/6.
 */
public interface ColumnNameAndCommentMapper{
    @Select("select COLUMN_NAME,COLUMN_COMMENT from information_schema.COLUMNS where TABLE_SCHEMA = #{schema} and TABLE_NAME = #{table}")
    @Results({
            @Result(column="COLUMN_NAME",property="columnName"),
            @Result(column="COLUMN_COMMENT",property="comment")
    })
    public List<ColumnNameAndComment> getColumnNameAndComment(@Param("schema")String schema, @Param("table")String table)throws SQLException;

    @Select("select * from #{table} #{condition} limit (#{page}-1)*#{rows}, #{page} * #{rows}")
    @ResultType(HashMap.class)
    public List<HashMap<String, String>> multiFilter(@Param("table")String table, @Param("condition")String condition, @Param("page")int page, @Param("rows")int rows);

    @Select("select * from #{table} #{condition}")
    @ResultType(HashMap.class)
    public int multiFilterCount(String table, String condition);
}
