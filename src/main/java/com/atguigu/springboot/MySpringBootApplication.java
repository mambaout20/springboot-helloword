package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @MapperScan(basePackages = "com.atguigu.dao")
 * 扫描指定包下的所有Mapper接口，将动态代理的实现类对象注入Spring容器中
 * basePackages属性：指定扫描的包路径地址
 * 作用相当于：
 * <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
 *     <property name="basePackage" value="com.atguigu.dao"/>
 * </bean>
 */
@MapperScan("com.atguigu.springboot.dao")
@SpringBootApplication// 声明该类是一个SpringBoot引导类
public class MySpringBootApplication {

    public static void main(String[] args) {
        // run方法 表示运行SpringBoot的引导类 run参数就是SpringBoot引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}
