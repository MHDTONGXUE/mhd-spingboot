package com.mhd.wiki.Service;
import com.mhd.wiki.domain.Ebook;
import com.mhd.wiki.domain.EbookExample;
import com.mhd.wiki.mapper.EbookMapper;
import com.mhd.wiki.req.EbookReq;
import com.mhd.wiki.resp.EbookResp;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
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
    public List<EbookResp> list(EbookReq ebookReq){
        //command+option+v 生成对象
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        List<Ebook> ebookList = EbookMapper.selectByExample(ebookExample);

        List<EbookResp> respList=new ArrayList<>();
        for (Ebook ebook:ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }
}
