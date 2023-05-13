package com.mhd.wiki.Service;

import com.mhd.wiki.domain.Test;
import com.mhd.wiki.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 莫寒鼎
 * @version 1.0
 * @date 2023/5/14 07:25
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list();
    }
}
