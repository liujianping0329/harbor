package com.shxp.harbor.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SiteListVO {
    @ApiModelProperty("站点编号")
    private String siteId;

    @ApiModelProperty("站点名称")
    private String siteName;

    @ApiModelProperty("站点X坐标")
    private String siteX;

    @ApiModelProperty("站点Y坐标")
    private String siteY;

    @ApiModelProperty("父节点编号")
    private String parentid;

    @ApiModelProperty("站点类型0：表示省份，1：表示区域，2：表示站点，3：表示站点详情点位")
    private String siteType;

    @ApiModelProperty("ip地址")
    private String ip;

    @ApiModelProperty("端口")
    private String port;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("今天采集数量")
    private Long numToday;

    @ApiModelProperty("全部采集数量")
    private Long numTotal;

    private String lac;

    private String agentid;
}
