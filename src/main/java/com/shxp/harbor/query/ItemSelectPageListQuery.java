package com.shxp.harbor.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ItemSelectPageListQuery {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("商品組名")
    private Integer itemGroupId;
    @ApiModelProperty("商品名")
    private String name;
    @ApiModelProperty("數量")
    private String number;
    @ApiModelProperty("產地")
    private String sannti;
    @ApiModelProperty("商品編號")
    private String itemcol;

}
