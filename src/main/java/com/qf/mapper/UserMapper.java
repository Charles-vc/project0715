package com.qf.mapper;

/**
 * @autor hhh
 * @create 2019/7/16
 */
public interface UserMapper {
    int getUid(String uname);
    String getPassword(String uname);
    int getStatus(String uname);
}
