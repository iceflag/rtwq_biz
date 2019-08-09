package com.zyd.sop.biz.sz.apiservice.mapper;

import com.zyd.sop.biz.sz.apiservice.model.Awqmd;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AwqmdMapper {

    public List<Awqmd> findAllItemByStcd(@Param("stcd")String stcd, @Param("beginTime")String beginTime, @Param("endTime")String endTime);
}
