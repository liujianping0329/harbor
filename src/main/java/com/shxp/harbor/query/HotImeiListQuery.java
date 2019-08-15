package com.shxp.harbor.query;

import com.shxp.harbor.bo.CommonPageBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class HotImeiListQuery extends CommonPageBO {
    @ApiModelProperty("站点编号site_id")
    private String wsiteid;
    @ApiModelProperty("采集时间左边界")
    private Date starttimeBegin;
    @ApiModelProperty("采集时间右边界")
    private Date starttimeEnd;
    @ApiModelProperty("IMEI")
    private String imei;
    @ApiModelProperty("IMSI")
    private String imsi;
}
