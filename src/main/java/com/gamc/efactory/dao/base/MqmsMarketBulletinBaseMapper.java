package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsMarketBulletin;
/**
*  @author wangjian
*/
public interface MqmsMarketBulletinBaseMapper {

    int insertMqmsMarketBulletin(MqmsMarketBulletin object);

    int updateMqmsMarketBulletin(MqmsMarketBulletin object);

    int update(MqmsMarketBulletin.UpdateBuilder object);

    List<MqmsMarketBulletin> queryMqmsMarketBulletin(MqmsMarketBulletin object);

    MqmsMarketBulletin queryMqmsMarketBulletinLimit1(MqmsMarketBulletin object);

}