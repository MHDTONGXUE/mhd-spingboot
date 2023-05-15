package com.mhd.wiki.controller;

import com.mhd.wiki.Service.EbookService;
import com.mhd.wiki.req.EbookReq;
import com.mhd.wiki.resp.CommonResp;
import com.mhd.wiki.resp.EbookResp;
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
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;
    @GetMapping("/list")
    public CommonResp list(EbookReq ebookReq){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list=ebookService.list(ebookReq);
        resp.setContent(list);
        return  resp;
    }
}
