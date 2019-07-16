package com.qf.service.impl;

import com.qf.mapper.UserMapper;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @autor hhh
 * @create 2019/7/16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String getPassword(String uname) {
        return  userMapper.getPassword(uname);
    }

    @Override
    public int getUid(String uname) {
        return userMapper.getUid(uname);
    }

    @Override
    public int getStatus(String uname) {
        return userMapper.getStatus(uname);
    }
}
