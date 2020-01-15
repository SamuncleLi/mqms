package com.gamc.efactory.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Jian Wang on 2020/1/3.
 */
public interface SalesPointService {
    boolean batchImport(String fileName, MultipartFile file);
}
