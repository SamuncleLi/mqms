package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.HistoryStorage;
/**
*  @author author
*/
public interface HistoryStorageBaseMapper {

    int insertHistoryStorage(HistoryStorage object);

    int updateHistoryStorage(HistoryStorage object);

    int update(HistoryStorage.UpdateBuilder object);

    List<HistoryStorage> queryHistoryStorage(HistoryStorage object);

    HistoryStorage queryHistoryStorageLimit1(HistoryStorage object);

}