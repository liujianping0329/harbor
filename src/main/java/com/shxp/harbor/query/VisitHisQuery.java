package com.shxp.harbor.query;

import com.shxp.harbor.po.VisitHis;
import lombok.Data;

@Data
public class VisitHisQuery {
    private String cip;

    private String cid;

    private String cname;
}
