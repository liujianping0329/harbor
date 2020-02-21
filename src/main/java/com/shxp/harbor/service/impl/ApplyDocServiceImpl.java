package com.shxp.harbor.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shxp.harbor.dao.ApplyDocDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shxp.harbor.vo.ApplyDocListVO;
import com.shxp.harbor.query.ApplyDocListQuery;
import com.shxp.harbor.po.ApplyDocExample;
import com.shxp.harbor.po.ApplyDoc;
import com.shxp.harbor.service.util.DataUtils;
import com.shxp.harbor.service.ApplyDocService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplyDocServiceImpl implements ApplyDocService {

    @Autowired
    private ApplyDocDAO applyDocDAO;

    @Override
    public PageInfo<ApplyDocListVO> listApplyDoc(ApplyDocListQuery applyDocListQuery) {
        ApplyDocExample applyDocExample = new ApplyDocExample();
        ApplyDocExample.Criteria criteria = applyDocExample.createCriteria();
        PageHelper.startPage(applyDocListQuery.getPageIndex(), applyDocListQuery.getPageSize());
        List<ApplyDoc> applyDocs = this.applyDocDAO.selectByExample(applyDocExample);
        PageInfo pageInfo = new PageInfo(applyDocs);
        if (!DataUtils.isListAvali(applyDocs)) return pageInfo;
        pageInfo.setList(applyDocs.stream().map(applyDoc -> {
            ApplyDocListVO applyDocListVO = new ApplyDocListVO();
            BeanUtils.copyProperties(applyDoc, applyDocListVO);
            return applyDocListVO;
        }).collect(Collectors.toList()));
        return pageInfo;
    }

//    @Override
//    public Integer upsertApplyDoc(ApplyDocQuery applyDocQuery) {
//        ApplyDoc applyDoc = new ApplyDoc();
//        BeanUtils.copyProperties(applyDocQuery, applyDoc);
//        if (applyDoc.getId() != null) {
//            this.applyDocMapper.updateByPrimaryKeySelective(applyDoc);
//        } else {
//            this.applyDocMapper.insertSelective(applyDoc);
//        }
//        // TODO: 2018/11/29 关联表增改别忘了先判断xxxIds是否为空
//        return applyDoc.getId();
//    }
//
//    @Override
//    public ApplyDocDTO getApplyDocInfo(Integer applyDocId) {
//        ApplyDocDTO applyDocDTO = new ApplyDocDTO();
//        ApplyDocListQuery applyDocListQuery = new ApplyDocListQuery();
//        applyDocListQuery.setIds(new ArrayList<Integer>() {{
//            this.add(applyDocId);
//        }});
//        BeanUtils.copyProperties(this.listApplyDoc(applyDocListQuery).getList().get(0), applyDocDTO);
//        // TODO: 2018/11/29 关联查一些别的
//        return applyDocDTO;
//    }
}
