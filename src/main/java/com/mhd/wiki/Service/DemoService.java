package com.mhd.wiki.Service;

import com.mhd.wiki.domain.Demo;
import com.mhd.wiki.mapper.DemoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 莫寒鼎
 * @version 1.0
 * @date 2023/5/14 07:25
 */
@Service
public class DemoService {
    @Resource
    private DemoMapper DemoMapper;
    public List<Demo> list(){
        return DemoMapper.selectByExample(null);
    }
}
