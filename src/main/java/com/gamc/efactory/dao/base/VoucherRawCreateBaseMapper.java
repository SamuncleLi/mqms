package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.VoucherRawCreate;
/**
*  @author wangjian
*/
public interface VoucherRawCreateBaseMapper {

    int insertVoucherRawCreate(VoucherRawCreate object);

    int updateVoucherRawCreate(VoucherRawCreate object);

    int update(VoucherRawCreate.UpdateBuilder object);

    List<VoucherRawCreate> queryVoucherRawCreate(VoucherRawCreate object);

    VoucherRawCreate queryVoucherRawCreateLimit1(VoucherRawCreate object);

}