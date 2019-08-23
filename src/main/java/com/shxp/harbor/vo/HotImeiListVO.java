package com.shxp.harbor.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class HotImeiListVO {
    private Integer id;

    @ApiModelProperty("IMEI")
    private String imei;

    @ApiModelProperty("IMSI")
    private String imsi;

    @ApiModelProperty("站点编号")
    private String wsiteid;

    @ApiModelProperty("站点名称")
    private String wsiteName;

    @ApiModelProperty("代理编号")
    private String wagentid;

    @ApiModelProperty("采集时间")
    private Date starttime;

    @ApiModelProperty("归属地")
    private String location;

    @ApiModelProperty("手机型号")
    private String model;

    @ApiModelProperty("采集文件名称")
    private String filename;

    @ApiModelProperty("导入时间")
    private Date importtime;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("采集派出所编号")
    private String policeStationid;

    @ApiModelProperty("采集区域编号（金山、闵行等）")
    private String policeAreaid;

    @ApiModelProperty("采集省份编号")
    private String policeProvinceid;

    @ApiModelProperty("是否统计0：为统计，1：统计")
    private String isstatic;

    private Integer istrans;
}
