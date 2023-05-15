package com.mhd.wiki.Service;

import com.mhd.wiki.domain.Ebook;
import com.mhd.wiki.mapper.EbookMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 莫寒鼎
 * @version 1.0
 * @date 2023/5/14 07:25
 */
@Service
public class EbookService {
    @Resource
    private EbookMapper EbookMapper;
    public List<Ebook> list(){
        return EbookMapper.selectByExample(null);
    }
}
