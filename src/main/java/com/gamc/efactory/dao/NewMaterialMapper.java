package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.NewMaterial;
import com.gamc.efactory.dao.base.NewMaterialBaseMapper;
/**
*  @author author
*/
public interface NewMaterialMapper extends NewMaterialBaseMapper{
    String queryMaxMaterialCode(String materialCodeHead);
    int countNewMaterial(NewMaterial newMaterial);
}