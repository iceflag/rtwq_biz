package com.zyd.sop.biz.sz.apiservice.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
/**
 * 自动站水质数据
 */
public class Awqmd {
    /** 测站代码 */
    @ApiModelProperty(value = "测站代码", example = "1")
    private String sTCD;
    /** 测站名称 */
    @ApiModelProperty(value = "测站名称", example = "XX测站")
    private String sTNM;
    /** 采样时间 */
    private String sPT;
    /** 水温 */
    private String wT;
    /** pH值 */
    private String pH;
    /** 电导率(μS/cm) */
    private String cOND;
    /** 浊度 */
    private String tURB;
    /** 溶解氧(mg/L) */
    private String dOX;
    /** 高锰酸盐指数(mg/L) */
    private String cODMN;
    /** 化学需氧量(mg/L) */
    private String cODCR;
    /** 总氮(mg/L) */
    private String tN;
    /** 氨氮(mg/L) */
    private String nH3N;
    /** 亚硝酸盐氮(mg/L) */
    private String nO2;
    /** 硝酸盐氮(mg/L) */
    private String nO3;
    /** 总磷(mg/L) */
    private String tP;
    /** 总有机碳mg/L */
    private String tOC;
    /** 叶绿素a(mg/L) */
    private String cHLA;
    /** 氧化还原电位mv */
    private String rEDOX;
    /** 六价铬(mg/L) */
    private String cR6;
    /** 铅(mg/L) */
    private String pB;
    /** 铁(mg/L) */
    private String fE;
    /** 锰(mg/L) */
    private String mN;
    /** 氰化物(mg/L) */
    private String cN;
}
