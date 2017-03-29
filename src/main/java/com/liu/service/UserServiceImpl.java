package com.liu.service;

import com.liu.dao.UserDao;
import com.liu.entitys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @COMPANY:
 * @CLASS:UserServiceImpl
 * @DESCRIPTION:
 * @AUTHOR:LYZH
 * @VERSION:v1.0
 * @DATE:2017/3/29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Integer id) {
        //return new User(1,"lyzh1","123456",27,20);
        return userDao.findById(id);
    }
}
