package com.gamc.efactory.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Zeho Lee on 2020/1/3.
 */
public interface VeiDataService {
    boolean batchImport(String fileName, MultipartFile file);
}
