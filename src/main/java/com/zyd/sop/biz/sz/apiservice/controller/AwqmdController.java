package com.zyd.sop.biz.sz.apiservice.controller;

import com.zyd.sop.biz.sz.apiservice.model.Awqmd;
import com.zyd.sop.biz.sz.apiservice.service.AwqmdService;
import com.zyd.sop.servercommon.annotation.ApiMapping;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = {"自动站水质数据"}, description = "自动站水质数据")
@RestController
public class AwqmdController {
    @Autowired
    private AwqmdService awqmdService;

    @ApiMapping(value = "rtwq.awqmd.getAllItemData", permission = true)
    @ApiOperation("单站多指标监测数据（最大时间跨度31day）")

    public List<Awqmd> findAllItemByStcd(String stcd, String beginTime, String endTime){
        List<Awqmd> result;
        result= awqmdService.findAllItemByStcd(stcd,beginTime, endTime);
        return result;
    }

    @ApiMapping(value = "rtwq.awqmd.getItemData")
    @ApiOperation("单站单指标监测数据（最大时间跨度365day）")
    public List<Awqmd> findItemByStcd(@ApiParam(name="stcd",type="String",value="测站代码",required=true)String stcd, @ApiParam(name="beginTime",type="String",value="开始时间(yyyy-MM-dd)",required=true)String beginTime, @ApiParam(name="endTime",type="String",value="结束时间(yyyy-MM-dd)",required=true)String endTime){
        List<Awqmd> result= new ArrayList<Awqmd>();
        return result;
    }

    @ApiMapping(value = "rtwq.awqmd.getNearestData")
    @ApiOperation("站点水质最新监测数据（最大10个站）")
    public List<Awqmd> findNearesByStcd(String stcds){
        List<Awqmd> result= new ArrayList<Awqmd>();
        return result;
    }
}
