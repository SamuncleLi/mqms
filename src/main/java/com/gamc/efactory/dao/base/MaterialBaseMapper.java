package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.Material;
/**
*  @author author
*/
public interface MaterialBaseMapper {

    int insertMaterial(Material object);

    int updateMaterial(Material object);

    int update(Material.UpdateBuilder object);

    List<Material> queryMaterial(Material object);

    Material queryMaterialLimit1(Material object);

}