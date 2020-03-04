package com.gamc.efactory.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

/**
 * Created by Jian Wang on 2020/1/3.
 */
public interface SalesService {
    boolean batchImport(String fileName, MultipartFile file, HttpSession session);
}
