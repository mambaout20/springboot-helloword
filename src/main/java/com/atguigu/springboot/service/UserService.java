package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.User;

import java.util.List;

public interface UserService {
        List<User> findAll();
}
