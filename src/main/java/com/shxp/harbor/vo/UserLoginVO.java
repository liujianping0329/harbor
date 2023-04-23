package com.shxp.harbor.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserLoginVO {
    private Integer id;

    private String acount;

    @ApiModelProperty("userType")
    private Integer userType;
}
