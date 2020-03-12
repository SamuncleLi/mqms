package com.gamc.efactory.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.concurrent.ExecutionException;

/**
 * Created by UZI on 2020/3/5.
 */
public interface TestService {

     int addBlackLists(String file) throws ExecutionException, InterruptedException;
}
