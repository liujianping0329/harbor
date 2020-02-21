package com.shxp.harbor.service;

import com.github.pagehelper.PageInfo;
import com.shxp.harbor.query.ApplyDocListQuery;
import com.shxp.harbor.vo.ApplyDocListVO;

public interface ApplyDocService {
    PageInfo<ApplyDocListVO> listApplyDoc(ApplyDocListQuery applyDocListQuery);
}
