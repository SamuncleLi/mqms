package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTranYearDecode;
import com.gamc.efactory.dao.base.MqmsTranYearDecodeBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsTranYearDecodeMapper extends MqmsTranYearDecodeBaseMapper{

    String selectTranProYear(@Param("tran_pro_year_code") String tranProYearCode);
}