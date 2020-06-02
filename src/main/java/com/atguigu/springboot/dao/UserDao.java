package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper//标记该类是一个mybatis的mapper接口，可以被spring boot自动扫描到spring上下文中   由他来实现实例
@Repository//IOC容器中
public interface UserDao {
    List<User> findAll();
}
