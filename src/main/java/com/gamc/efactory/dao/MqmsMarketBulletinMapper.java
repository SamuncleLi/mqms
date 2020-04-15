package com.gamc.efactory.dao;

import com.gamc.efactory.dao.base.MqmsMarketBulletinBaseMapper;
import org.apache.ibatis.annotations.Param;

/**
*  @author wangjian
*/
public interface MqmsMarketBulletinMapper extends MqmsMarketBulletinBaseMapper{
int salesEngFailureFDJCount(@Param("failureDate") String failureDate);
int salesEngFailureSTCount(@Param("failureDate") String failureDate,@Param("yesOrNo") String yesOrNo);
}