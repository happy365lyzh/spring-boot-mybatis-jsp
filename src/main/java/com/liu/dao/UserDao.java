package com.liu.dao;

import com.liu.entitys.User;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @COMPANY:
 * @CLASS:UserDao
 * @DESCRIPTION:
 * @AUTHOR:LYZH
 * @VERSION:v1.0
 * @DATE:2017/3/29
 */
public interface UserDao {
    public User findById(Integer id);
}
