package com.mhd.wiki.controller;

import com.mhd.wiki.Service.DemoService;
import com.mhd.wiki.domain.Demo;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 莫寒鼎
 * @version 1.0
 * @date 2023/5/13 22:47
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;
    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
