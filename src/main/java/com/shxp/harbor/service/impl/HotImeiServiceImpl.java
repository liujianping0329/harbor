package com.shxp.harbor.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shxp.harbor.service.HotImeiService;
import com.shxp.harbor.service.SiteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shxp.harbor.dao.shzy.SocialHotImeilogDAO;
import com.shxp.harbor.vo.HotImeiListVO;
import com.shxp.harbor.query.HotImeiListQuery;
import com.shxp.harbor.po.SocialHotImeilogExample;
import com.shxp.harbor.po.SocialHotImeilog;
import com.shxp.harbor.service.util.DataUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotImeiServiceImpl implements HotImeiService {

    @Autowired
    private SocialHotImeilogDAO SocialHotImeilogDAO;

    @Override
    public PageInfo<HotImeiListVO> listHotImei(HotImeiListQuery hotImeiListQuery) {
        SocialHotImeilogExample socialHotImeilogExample = new SocialHotImeilogExample();
        socialHotImeilogExample.setOrderByClause(" starttime desc ");
        SocialHotImeilogExample.Criteria criteria = socialHotImeilogExample.createCriteria();
        if(hotImeiListQuery.getWsiteid()!=null){
            criteria.andWsiteidEqualTo(hotImeiListQuery.getWsiteid());
        }
        if(hotImeiListQuery.getStarttimeBegin()!=null){
            criteria.andStarttimeGreaterThanOrEqualTo(hotImeiListQuery.getStarttimeBegin());
        }
        if(hotImeiListQuery.getStarttimeEnd()!=null){
            criteria.andStarttimeLessThanOrEqualTo(hotImeiListQuery.getStarttimeEnd());
        }
        if(hotImeiListQuery.getImei()!=null){
            criteria.andImeiEqualTo(hotImeiListQuery.getImei());
        }
        if(hotImeiListQuery.getImsi()!=null){
            criteria.andImsiEqualTo(hotImeiListQuery.getImsi());
        }
        // TODO 加条件筛选
        PageHelper.startPage(hotImeiListQuery.getPageIndex(), hotImeiListQuery.getPageSize());
        List<SocialHotImeilog> socialHotImeilogs = this.SocialHotImeilogDAO.selectByExample(socialHotImeilogExample);
        PageInfo pageInfo = new PageInfo(socialHotImeilogs);
        if (!DataUtils.isListAvali(socialHotImeilogs)) return pageInfo;
        // TODO 要不要查点别的?
        pageInfo.setList(socialHotImeilogs.stream().map(socialHotImeilog -> {
            HotImeiListVO hotImeiListVO = new HotImeiListVO();
            BeanUtils.copyProperties(socialHotImeilog, hotImeiListVO);
            return hotImeiListVO;
        }).collect(Collectors.toList()));
        return pageInfo;
    }

//    @Override
//    public Integer upsertHotImei(HotImeiQuery hotImeiQuery) {
//        HotImei hotImei = new HotImei();
//        BeanUtils.copyProperties(hotImeiQuery, hotImei);
//        if (hotImei.getId() != null) {
//            this.hotImeiMapper.updateByPrimaryKeySelective(hotImei);
//        } else {
//            this.hotImeiMapper.insertSelective(hotImei);
//        }
//        // TODO: 2018/11/29 关联表增改别忘了先判断xxxIds是否为空
//        return hotImei.getId();
//    }
//
//    @Override
//    public HotImeiDTO getHotImeiInfo(Integer hotImeiId) {
//        HotImeiDTO hotImeiDTO = new HotImeiDTO();
//        HotImeiListQuery hotImeiListQuery = new HotImeiListQuery();
//        hotImeiListQuery.setIds(new ArrayList<Integer>() {{
//            this.add(hotImeiId);
//        }});
//        BeanUtils.copyProperties(this.listHotImei(hotImeiListQuery).getList().get(0), hotImeiDTO);
//        // TODO: 2018/11/29 关联查一些别的
//        return hotImeiDTO;
//    }
}
