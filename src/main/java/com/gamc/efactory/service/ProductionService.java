package com.gamc.efactory.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Zeho Lee on 2020/1/3.
 */
public interface ProductionService {
    boolean batchImport(String fileName, MultipartFile file);
}