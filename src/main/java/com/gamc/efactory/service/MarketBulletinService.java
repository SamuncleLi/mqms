package com.gamc.efactory.service;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutionException;

/**
 * Created by Zeho Lee on 2020/1/3.
 */
public interface MarketBulletinService {
    int addLists(String file, HttpServletRequest request) throws ExecutionException, InterruptedException;
}
