package com.shxp.harbor.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LogManageListQuery {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("商品名")
    private String itemId;
    @ApiModelProperty("type")
    private Integer type;
    @ApiModelProperty("數量")
    private Integer number;
    @ApiModelProperty("日期")
    private String date;
    @ApiModelProperty("操作者")
    private Integer userId;
}
