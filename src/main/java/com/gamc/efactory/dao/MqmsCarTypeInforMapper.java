package com.gamc.efactory.dao;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsCarTypeInfor;
import com.gamc.efactory.dao.base.MqmsCarTypeInforBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsCarTypeInforMapper extends MqmsCarTypeInforBaseMapper{
    List<MqmsCarTypeInfor>  searchCarTypeInfor(MqmsCarTypeInfor object);
    List<MqmsCarTypeInfor>  searchCarDetailInfor(@Param("carType") String carType);
    String[] searchNextDate(@Param("carType") String carType);
}