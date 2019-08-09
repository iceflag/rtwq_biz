package com.zyd.sop.biz.sz.apiservice.service;

import com.zyd.sop.biz.sz.apiservice.mapper.AwqmdMapper;
import com.zyd.sop.biz.sz.apiservice.model.Awqmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AwqmdService {

    @Autowired
    private AwqmdMapper awqmdMapper;

    public List<Awqmd> findAllItemByStcd(String stcd, String beginTime, String endTime){
        List<Awqmd> result= awqmdMapper.findAllItemByStcd(stcd,beginTime, endTime);

        return result;
    }
}
