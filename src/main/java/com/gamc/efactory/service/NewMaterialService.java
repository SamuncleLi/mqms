package com.gamc.efactory.service;

import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.model.dataObject.NewMaterial;
import org.springframework.stereotype.Service;

/**
 * Created by Zeho Lee on 2019/10/7.
 */
@Service
public interface NewMaterialService {
    JSONObject checkNewMaterial(NewMaterial newMaterial);
}
