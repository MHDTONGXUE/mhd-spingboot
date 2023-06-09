package com.mhd.wiki.controller;

import com.mhd.wiki.Service.TestService;
import com.mhd.wiki.domain.Test;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 莫寒鼎
 * @version 1.0
 * @date 2023/5/13 22:47
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;
    //自定义配置项
    @Value("${test.hello:这是默认配置项}")
    private String testHello;
    /*
    get,post,put,delete
     */
    @RequestMapping("/hello")
    public String hello(){
        return "hello"+testHello;
    }
    @PostMapping("/hello1")
    public String hello(String name){
        return "hello"+name;
    }
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
