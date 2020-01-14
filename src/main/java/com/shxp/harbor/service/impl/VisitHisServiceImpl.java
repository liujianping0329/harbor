package com.shxp.harbor.service.impl;

import com.shxp.harbor.dao.VisitHisDAO;
import com.shxp.harbor.po.VisitHis;
import com.shxp.harbor.po.VisitHisExample;
import com.shxp.harbor.query.VisitHisQuery;
import com.shxp.harbor.service.VisitHisService;
import com.shxp.harbor.vo.StatisticsVO;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class VisitHisServiceImpl implements VisitHisService {

    @Autowired
    private VisitHisDAO visitHisDAO;

    @Override
    public Integer addHis(VisitHisQuery visitHisQuery) {
        VisitHis visitHis=new VisitHis();
        BeanUtils.copyProperties(visitHisQuery,visitHis);
        VisitHisExample visitHisExample=new VisitHisExample();
        visitHisExample.createCriteria().andCipEqualTo(visitHis.getCip());
        List<VisitHis> visitHisList = visitHisDAO.selectByExample(visitHisExample);
        if(visitHisList.size()!=0){
            VisitHis visitHisUpdate=new VisitHis();
            visitHisUpdate.setId(visitHisList.get(0).getId());
            visitHisUpdate.setMtime(new Date());
            visitHisDAO.updateByPrimaryKeySelective(visitHisUpdate);
        }else{
            visitHisDAO.insertSelective(visitHis);
        }
        return visitHis.getId();
    }

    @Override
    public List<StatisticsVO> getProvinceSta() {
        List<StatisticsVO> statisticsVOS=new ArrayList<>();
        List<VisitHis> visitHises = visitHisDAO.selectByExample(new VisitHisExample());
        if(visitHises.size()==0)return statisticsVOS;
        List<VisitHisHelpBO> visitHisHelpBOS = visitHises.stream().map(visitHis -> {
            VisitHisHelpBO visitHisHelpBO = new VisitHisHelpBO();
            BeanUtils.copyProperties(visitHis, visitHisHelpBO);
            if(StringUtils.isNumeric(visitHis.getCid())){
                visitHisHelpBO.setProvinceCode(Integer.valueOf(visitHis.getCid().substring(0, 2)));
            }else{
                visitHisHelpBO.setProvinceCode(99);
            }
            return visitHisHelpBO;
        }).collect(Collectors.toList());
        Map<String, List<VisitHisHelpBO>> proGroup = visitHisHelpBOS.stream().collect(Collectors.groupingBy(VisitHisHelpBO::getProvinceName));
        for (Map.Entry<String, List<VisitHisHelpBO>> stringListEntry : proGroup.entrySet()) {
            StatisticsVO statisticsVO=new StatisticsVO();
            statisticsVO.setCou(stringListEntry.getValue().size());
            statisticsVO.setProvinceName(stringListEntry.getKey());
            statisticsVOS.add(statisticsVO);
        }
        return statisticsVOS;
    }

    private class VisitHisHelpBO extends VisitHis{
        private Integer provinceCode;
        private String provinceName;
        private Map<Integer,String> proNameRelation=new HashMap<Integer,String>(){{
            put(11,"北京");
            put(12,"天津");
            put(31,"上海");
            put(50,"重庆");
            put(13,"河北");
            put(41,"河南");
            put(53,"云南");
            put(21,"辽宁");
            put(23,"黑龙江");
            put(43,"湖南");
            put(34,"安徽");
            put(37,"山东");
            put(65,"新疆");
            put(32,"江苏");
            put(33,"浙江");
            put(36,"江西");
            put(42,"湖北");
            put(45,"广西");
            put(62,"甘肃");
            put(14,"山西");
            put(15,"内蒙古");
            put(61,"陕西");
            put(22,"吉林");
            put(35,"福建");
            put(52,"贵州");
            put(44,"广东");
            put(63,"青海");
            put(54,"西藏");
            put(51,"四川");
            put(64,"宁夏");
            put(46,"海南");
        }};

        public Integer getProvinceCode() {
            return provinceCode;
        }

        public void setProvinceCode(Integer provinceCode) {
            this.provinceCode = provinceCode;
            this.provinceName=proNameRelation.get(provinceCode);
            if(provinceName==null){
                provinceName="海外";
            }
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }
    }
}
