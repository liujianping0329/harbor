package com.shxp.harbor.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class InsertUserListQuery {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("帳號")
    private String acount;
    @ApiModelProperty("密碼")
    private String password;
    @ApiModelProperty("type")
    private Integer userType;
}
