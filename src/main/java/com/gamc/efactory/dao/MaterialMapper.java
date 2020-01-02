package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.Material;
import com.gamc.efactory.dao.base.MaterialBaseMapper;
import org.springframework.stereotype.Repository;

/**
*  @author lizh
*/
@Repository
public interface MaterialMapper extends MaterialBaseMapper{
    int countMaterial(Material material);
    String queryMaxMaterialCode(String materialCodeHead);
}