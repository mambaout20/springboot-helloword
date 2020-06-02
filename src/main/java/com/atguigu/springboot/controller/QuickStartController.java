package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //等价于@Controller + @ResponseBody
public class QuickStartController {

    @RequestMapping("/hello")
    public String hello(){
        return "okaaaa";
    }
}
