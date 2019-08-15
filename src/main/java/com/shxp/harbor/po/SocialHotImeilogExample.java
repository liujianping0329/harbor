package com.shxp.harbor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SocialHotImeilogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SocialHotImeilogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("imsi is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("imsi is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("imsi =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("imsi <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("imsi >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("imsi >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("imsi <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("imsi <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("imsi like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("imsi not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("imsi in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("imsi not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("imsi between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("imsi not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andWsiteidIsNull() {
            addCriterion("wsiteid is null");
            return (Criteria) this;
        }

        public Criteria andWsiteidIsNotNull() {
            addCriterion("wsiteid is not null");
            return (Criteria) this;
        }

        public Criteria andWsiteidEqualTo(String value) {
            addCriterion("wsiteid =", value, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidNotEqualTo(String value) {
            addCriterion("wsiteid <>", value, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidGreaterThan(String value) {
            addCriterion("wsiteid >", value, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidGreaterThanOrEqualTo(String value) {
            addCriterion("wsiteid >=", value, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidLessThan(String value) {
            addCriterion("wsiteid <", value, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidLessThanOrEqualTo(String value) {
            addCriterion("wsiteid <=", value, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidLike(String value) {
            addCriterion("wsiteid like", value, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidNotLike(String value) {
            addCriterion("wsiteid not like", value, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidIn(List<String> values) {
            addCriterion("wsiteid in", values, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidNotIn(List<String> values) {
            addCriterion("wsiteid not in", values, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidBetween(String value1, String value2) {
            addCriterion("wsiteid between", value1, value2, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWsiteidNotBetween(String value1, String value2) {
            addCriterion("wsiteid not between", value1, value2, "wsiteid");
            return (Criteria) this;
        }

        public Criteria andWagentidIsNull() {
            addCriterion("wagentid is null");
            return (Criteria) this;
        }

        public Criteria andWagentidIsNotNull() {
            addCriterion("wagentid is not null");
            return (Criteria) this;
        }

        public Criteria andWagentidEqualTo(String value) {
            addCriterion("wagentid =", value, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidNotEqualTo(String value) {
            addCriterion("wagentid <>", value, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidGreaterThan(String value) {
            addCriterion("wagentid >", value, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidGreaterThanOrEqualTo(String value) {
            addCriterion("wagentid >=", value, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidLessThan(String value) {
            addCriterion("wagentid <", value, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidLessThanOrEqualTo(String value) {
            addCriterion("wagentid <=", value, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidLike(String value) {
            addCriterion("wagentid like", value, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidNotLike(String value) {
            addCriterion("wagentid not like", value, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidIn(List<String> values) {
            addCriterion("wagentid in", values, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidNotIn(List<String> values) {
            addCriterion("wagentid not in", values, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidBetween(String value1, String value2) {
            addCriterion("wagentid between", value1, value2, "wagentid");
            return (Criteria) this;
        }

        public Criteria andWagentidNotBetween(String value1, String value2) {
            addCriterion("wagentid not between", value1, value2, "wagentid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("`location` is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("`location` is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("`location` =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("`location` <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("`location` >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("`location` >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("`location` <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("`location` <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("`location` like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("`location` not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("`location` in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("`location` not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("`location` between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("`location` not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andImporttimeIsNull() {
            addCriterion("importtime is null");
            return (Criteria) this;
        }

        public Criteria andImporttimeIsNotNull() {
            addCriterion("importtime is not null");
            return (Criteria) this;
        }

        public Criteria andImporttimeEqualTo(Date value) {
            addCriterion("importtime =", value, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeNotEqualTo(Date value) {
            addCriterion("importtime <>", value, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeGreaterThan(Date value) {
            addCriterion("importtime >", value, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("importtime >=", value, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeLessThan(Date value) {
            addCriterion("importtime <", value, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeLessThanOrEqualTo(Date value) {
            addCriterion("importtime <=", value, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeIn(List<Date> values) {
            addCriterion("importtime in", values, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeNotIn(List<Date> values) {
            addCriterion("importtime not in", values, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeBetween(Date value1, Date value2) {
            addCriterion("importtime between", value1, value2, "importtime");
            return (Criteria) this;
        }

        public Criteria andImporttimeNotBetween(Date value1, Date value2) {
            addCriterion("importtime not between", value1, value2, "importtime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidIsNull() {
            addCriterion("police_stationid is null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidIsNotNull() {
            addCriterion("police_stationid is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidEqualTo(String value) {
            addCriterion("police_stationid =", value, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidNotEqualTo(String value) {
            addCriterion("police_stationid <>", value, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidGreaterThan(String value) {
            addCriterion("police_stationid >", value, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidGreaterThanOrEqualTo(String value) {
            addCriterion("police_stationid >=", value, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidLessThan(String value) {
            addCriterion("police_stationid <", value, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidLessThanOrEqualTo(String value) {
            addCriterion("police_stationid <=", value, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidLike(String value) {
            addCriterion("police_stationid like", value, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidNotLike(String value) {
            addCriterion("police_stationid not like", value, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidIn(List<String> values) {
            addCriterion("police_stationid in", values, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidNotIn(List<String> values) {
            addCriterion("police_stationid not in", values, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidBetween(String value1, String value2) {
            addCriterion("police_stationid between", value1, value2, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceStationidNotBetween(String value1, String value2) {
            addCriterion("police_stationid not between", value1, value2, "policeStationid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidIsNull() {
            addCriterion("police_areaid is null");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidIsNotNull() {
            addCriterion("police_areaid is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidEqualTo(String value) {
            addCriterion("police_areaid =", value, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidNotEqualTo(String value) {
            addCriterion("police_areaid <>", value, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidGreaterThan(String value) {
            addCriterion("police_areaid >", value, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("police_areaid >=", value, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidLessThan(String value) {
            addCriterion("police_areaid <", value, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidLessThanOrEqualTo(String value) {
            addCriterion("police_areaid <=", value, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidLike(String value) {
            addCriterion("police_areaid like", value, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidNotLike(String value) {
            addCriterion("police_areaid not like", value, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidIn(List<String> values) {
            addCriterion("police_areaid in", values, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidNotIn(List<String> values) {
            addCriterion("police_areaid not in", values, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidBetween(String value1, String value2) {
            addCriterion("police_areaid between", value1, value2, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaidNotBetween(String value1, String value2) {
            addCriterion("police_areaid not between", value1, value2, "policeAreaid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidIsNull() {
            addCriterion("police_provinceid is null");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidIsNotNull() {
            addCriterion("police_provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidEqualTo(String value) {
            addCriterion("police_provinceid =", value, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidNotEqualTo(String value) {
            addCriterion("police_provinceid <>", value, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidGreaterThan(String value) {
            addCriterion("police_provinceid >", value, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidGreaterThanOrEqualTo(String value) {
            addCriterion("police_provinceid >=", value, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidLessThan(String value) {
            addCriterion("police_provinceid <", value, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidLessThanOrEqualTo(String value) {
            addCriterion("police_provinceid <=", value, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidLike(String value) {
            addCriterion("police_provinceid like", value, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidNotLike(String value) {
            addCriterion("police_provinceid not like", value, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidIn(List<String> values) {
            addCriterion("police_provinceid in", values, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidNotIn(List<String> values) {
            addCriterion("police_provinceid not in", values, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidBetween(String value1, String value2) {
            addCriterion("police_provinceid between", value1, value2, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andPoliceProvinceidNotBetween(String value1, String value2) {
            addCriterion("police_provinceid not between", value1, value2, "policeProvinceid");
            return (Criteria) this;
        }

        public Criteria andIsstaticIsNull() {
            addCriterion("isStatic is null");
            return (Criteria) this;
        }

        public Criteria andIsstaticIsNotNull() {
            addCriterion("isStatic is not null");
            return (Criteria) this;
        }

        public Criteria andIsstaticEqualTo(String value) {
            addCriterion("isStatic =", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticNotEqualTo(String value) {
            addCriterion("isStatic <>", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticGreaterThan(String value) {
            addCriterion("isStatic >", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticGreaterThanOrEqualTo(String value) {
            addCriterion("isStatic >=", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticLessThan(String value) {
            addCriterion("isStatic <", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticLessThanOrEqualTo(String value) {
            addCriterion("isStatic <=", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticLike(String value) {
            addCriterion("isStatic like", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticNotLike(String value) {
            addCriterion("isStatic not like", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticIn(List<String> values) {
            addCriterion("isStatic in", values, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticNotIn(List<String> values) {
            addCriterion("isStatic not in", values, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticBetween(String value1, String value2) {
            addCriterion("isStatic between", value1, value2, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticNotBetween(String value1, String value2) {
            addCriterion("isStatic not between", value1, value2, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIstransIsNull() {
            addCriterion("isTrans is null");
            return (Criteria) this;
        }

        public Criteria andIstransIsNotNull() {
            addCriterion("isTrans is not null");
            return (Criteria) this;
        }

        public Criteria andIstransEqualTo(Integer value) {
            addCriterion("isTrans =", value, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransNotEqualTo(Integer value) {
            addCriterion("isTrans <>", value, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransGreaterThan(Integer value) {
            addCriterion("isTrans >", value, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransGreaterThanOrEqualTo(Integer value) {
            addCriterion("isTrans >=", value, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransLessThan(Integer value) {
            addCriterion("isTrans <", value, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransLessThanOrEqualTo(Integer value) {
            addCriterion("isTrans <=", value, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransIn(List<Integer> values) {
            addCriterion("isTrans in", values, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransNotIn(List<Integer> values) {
            addCriterion("isTrans not in", values, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransBetween(Integer value1, Integer value2) {
            addCriterion("isTrans between", value1, value2, "istrans");
            return (Criteria) this;
        }

        public Criteria andIstransNotBetween(Integer value1, Integer value2) {
            addCriterion("isTrans not between", value1, value2, "istrans");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}