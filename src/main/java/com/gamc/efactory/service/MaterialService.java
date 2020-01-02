package com.gamc.efactory.service;

import org.springframework.stereotype.Service;

/**
 * Created by Zeho Lee on 2019/8/21.
 */
@Service
public interface MaterialService {
    String getNewMaterialCode(String newMaterialType);
    String divideContractType(String materialCode);
    String divideOrderManagementType(String materialCode);
}
