package com.qf.service;

/**
 * @autor hhh
 * @create 2019/7/16
 */
public interface UserService {
    String getPassword(String uname);
    int getUid(String uname);
    int getStatus(String uname);
}
