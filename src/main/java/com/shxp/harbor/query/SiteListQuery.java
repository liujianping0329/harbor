package com.shxp.harbor.query;

import com.shxp.harbor.bo.CommonPageBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class SiteListQuery extends CommonPageBO {
    @ApiModelProperty("站点编号s")
    private List<String> siteIds;
}
