package com.shxp.harbor.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ItemGroupListQuery {
    @ApiModelProperty("id")
    private String id;
    @ApiModelProperty("商品名")
    private String name;
}
