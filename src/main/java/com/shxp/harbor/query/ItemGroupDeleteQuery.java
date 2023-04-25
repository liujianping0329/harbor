package com.shxp.harbor.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ItemGroupDeleteQuery {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("商品名")
    private String name;
}
