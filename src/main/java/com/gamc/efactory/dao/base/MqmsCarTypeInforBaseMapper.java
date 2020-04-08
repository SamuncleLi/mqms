package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsCarTypeInfor;
/**
*  @author wangjian
*/
public interface MqmsCarTypeInforBaseMapper {

    int insertMqmsCarTypeInfor(MqmsCarTypeInfor object);

    int updateMqmsCarTypeInfor(MqmsCarTypeInfor object);

    int update(MqmsCarTypeInfor.UpdateBuilder object);

    List<MqmsCarTypeInfor> queryMqmsCarTypeInfor(MqmsCarTypeInfor object);

    MqmsCarTypeInfor queryMqmsCarTypeInforLimit1(MqmsCarTypeInfor object);

}