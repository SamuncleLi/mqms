package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.StorageTarget;
/**
*  @author author
*/
public interface StorageTargetBaseMapper {

    int insertStorageTarget(StorageTarget object);

    int updateStorageTarget(StorageTarget object);

    int update(StorageTarget.UpdateBuilder object);

    List<StorageTarget> queryStorageTarget(StorageTarget object);

    StorageTarget queryStorageTargetLimit1(StorageTarget object);

}