package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsEngAndTrans;
/**
*  @author wangjian
*/
public interface MqmsEngAndTransBaseMapper {

    int insertMqmsEngAndTrans(MqmsEngAndTrans object);

    int updateMqmsEngAndTrans(MqmsEngAndTrans object);

    int update(MqmsEngAndTrans.UpdateBuilder object);

    List<MqmsEngAndTrans> queryMqmsEngAndTrans(MqmsEngAndTrans object);

    MqmsEngAndTrans queryMqmsEngAndTransLimit1(MqmsEngAndTrans object);

}