package com.mhd.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 莫寒鼎
 * @version 1.0
 * @date 2023/5/13 22:47
 */
@RestController
public class TestController {
    /*
    get,post,put,delete
     */
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
