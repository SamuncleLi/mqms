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

    @SelectProvider(type=DynaSqlProvider.class,method="dynaSelect")
    public List<HashMap<String, String>> multiFilter(final String table, final String condition);

    @SelectProvider(type=DynaSqlProvider.class,method="dynaSelectCount")
    public int multiFilterCount(String table, String condition);
}
