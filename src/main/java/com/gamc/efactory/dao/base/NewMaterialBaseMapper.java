package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.NewMaterial;
/**
*  @author author
*/
public interface NewMaterialBaseMapper {

    int insertNewMaterial(NewMaterial object);

    int updateNewMaterial(NewMaterial object);

    int update(NewMaterial.UpdateBuilder object);

    List<NewMaterial> queryNewMaterial(NewMaterial object);

    NewMaterial queryNewMaterialLimit1(NewMaterial object);

}