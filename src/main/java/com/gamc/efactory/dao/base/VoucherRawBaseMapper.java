package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.VoucherRaw;
/**
*  @author wangjian
*/
public interface VoucherRawBaseMapper {

    int insertVoucherRaw(VoucherRaw object);

    int updateVoucherRaw(VoucherRaw object);

    int update(VoucherRaw.UpdateBuilder object);

    List<VoucherRaw> queryVoucherRaw(VoucherRaw object);

    VoucherRaw queryVoucherRawLimit1(VoucherRaw object);

}