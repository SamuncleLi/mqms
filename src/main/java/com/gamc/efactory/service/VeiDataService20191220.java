package com.gamc.efactory.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

/**
 * Created by Zeho Lee on 2020/1/3.
 */
public interface VeiDataService20191220 {
    boolean batchImport(String fileName, MultipartFile file, HttpSession session);
}
