package com.atguigu.springboot.service.Impl;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.dao.UserDao;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//IOC容器中
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
