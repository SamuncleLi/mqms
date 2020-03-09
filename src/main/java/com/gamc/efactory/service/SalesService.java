package com.gamc.efactory.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.concurrent.ExecutionException;

/**
 * Created by Jian Wang on 2020/1/3.
 */
public interface SalesService {
    int addBlackLists(String file , HttpServletRequest request) throws ExecutionException, InterruptedException;
}
