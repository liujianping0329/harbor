package com.shxp.harbor.po;

import java.util.ArrayList;
import java.util.List;

public class SocialSiteInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SocialSiteInfoExample() {
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

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("site_id like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("site_id not like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("site_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("site_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("site_name =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("site_name <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("site_name >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_name >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("site_name <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("site_name <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("site_name like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("site_name not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("site_name in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("site_name not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("site_name between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("site_name not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteXIsNull() {
            addCriterion("site_x is null");
            return (Criteria) this;
        }

        public Criteria andSiteXIsNotNull() {
            addCriterion("site_x is not null");
            return (Criteria) this;
        }

        public Criteria andSiteXEqualTo(String value) {
            addCriterion("site_x =", value, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXNotEqualTo(String value) {
            addCriterion("site_x <>", value, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXGreaterThan(String value) {
            addCriterion("site_x >", value, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXGreaterThanOrEqualTo(String value) {
            addCriterion("site_x >=", value, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXLessThan(String value) {
            addCriterion("site_x <", value, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXLessThanOrEqualTo(String value) {
            addCriterion("site_x <=", value, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXLike(String value) {
            addCriterion("site_x like", value, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXNotLike(String value) {
            addCriterion("site_x not like", value, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXIn(List<String> values) {
            addCriterion("site_x in", values, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXNotIn(List<String> values) {
            addCriterion("site_x not in", values, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXBetween(String value1, String value2) {
            addCriterion("site_x between", value1, value2, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteXNotBetween(String value1, String value2) {
            addCriterion("site_x not between", value1, value2, "siteX");
            return (Criteria) this;
        }

        public Criteria andSiteYIsNull() {
            addCriterion("site_y is null");
            return (Criteria) this;
        }

        public Criteria andSiteYIsNotNull() {
            addCriterion("site_y is not null");
            return (Criteria) this;
        }

        public Criteria andSiteYEqualTo(String value) {
            addCriterion("site_y =", value, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYNotEqualTo(String value) {
            addCriterion("site_y <>", value, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYGreaterThan(String value) {
            addCriterion("site_y >", value, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYGreaterThanOrEqualTo(String value) {
            addCriterion("site_y >=", value, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYLessThan(String value) {
            addCriterion("site_y <", value, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYLessThanOrEqualTo(String value) {
            addCriterion("site_y <=", value, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYLike(String value) {
            addCriterion("site_y like", value, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYNotLike(String value) {
            addCriterion("site_y not like", value, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYIn(List<String> values) {
            addCriterion("site_y in", values, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYNotIn(List<String> values) {
            addCriterion("site_y not in", values, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYBetween(String value1, String value2) {
            addCriterion("site_y between", value1, value2, "siteY");
            return (Criteria) this;
        }

        public Criteria andSiteYNotBetween(String value1, String value2) {
            addCriterion("site_y not between", value1, value2, "siteY");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentid like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentid not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIsNull() {
            addCriterion("site_type is null");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIsNotNull() {
            addCriterion("site_type is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTypeEqualTo(String value) {
            addCriterion("site_type =", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotEqualTo(String value) {
            addCriterion("site_type <>", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeGreaterThan(String value) {
            addCriterion("site_type >", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("site_type >=", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeLessThan(String value) {
            addCriterion("site_type <", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeLessThanOrEqualTo(String value) {
            addCriterion("site_type <=", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeLike(String value) {
            addCriterion("site_type like", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotLike(String value) {
            addCriterion("site_type not like", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIn(List<String> values) {
            addCriterion("site_type in", values, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotIn(List<String> values) {
            addCriterion("site_type not in", values, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeBetween(String value1, String value2) {
            addCriterion("site_type between", value1, value2, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotBetween(String value1, String value2) {
            addCriterion("site_type not between", value1, value2, "siteType");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNumTodayIsNull() {
            addCriterion("num_today is null");
            return (Criteria) this;
        }

        public Criteria andNumTodayIsNotNull() {
            addCriterion("num_today is not null");
            return (Criteria) this;
        }

        public Criteria andNumTodayEqualTo(Long value) {
            addCriterion("num_today =", value, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayNotEqualTo(Long value) {
            addCriterion("num_today <>", value, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayGreaterThan(Long value) {
            addCriterion("num_today >", value, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayGreaterThanOrEqualTo(Long value) {
            addCriterion("num_today >=", value, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayLessThan(Long value) {
            addCriterion("num_today <", value, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayLessThanOrEqualTo(Long value) {
            addCriterion("num_today <=", value, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayIn(List<Long> values) {
            addCriterion("num_today in", values, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayNotIn(List<Long> values) {
            addCriterion("num_today not in", values, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayBetween(Long value1, Long value2) {
            addCriterion("num_today between", value1, value2, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTodayNotBetween(Long value1, Long value2) {
            addCriterion("num_today not between", value1, value2, "numToday");
            return (Criteria) this;
        }

        public Criteria andNumTotalIsNull() {
            addCriterion("num_total is null");
            return (Criteria) this;
        }

        public Criteria andNumTotalIsNotNull() {
            addCriterion("num_total is not null");
            return (Criteria) this;
        }

        public Criteria andNumTotalEqualTo(Long value) {
            addCriterion("num_total =", value, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalNotEqualTo(Long value) {
            addCriterion("num_total <>", value, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalGreaterThan(Long value) {
            addCriterion("num_total >", value, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("num_total >=", value, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalLessThan(Long value) {
            addCriterion("num_total <", value, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalLessThanOrEqualTo(Long value) {
            addCriterion("num_total <=", value, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalIn(List<Long> values) {
            addCriterion("num_total in", values, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalNotIn(List<Long> values) {
            addCriterion("num_total not in", values, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalBetween(Long value1, Long value2) {
            addCriterion("num_total between", value1, value2, "numTotal");
            return (Criteria) this;
        }

        public Criteria andNumTotalNotBetween(Long value1, Long value2) {
            addCriterion("num_total not between", value1, value2, "numTotal");
            return (Criteria) this;
        }

        public Criteria andLacIsNull() {
            addCriterion("lac is null");
            return (Criteria) this;
        }

        public Criteria andLacIsNotNull() {
            addCriterion("lac is not null");
            return (Criteria) this;
        }

        public Criteria andLacEqualTo(String value) {
            addCriterion("lac =", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotEqualTo(String value) {
            addCriterion("lac <>", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacGreaterThan(String value) {
            addCriterion("lac >", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacGreaterThanOrEqualTo(String value) {
            addCriterion("lac >=", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLessThan(String value) {
            addCriterion("lac <", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLessThanOrEqualTo(String value) {
            addCriterion("lac <=", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLike(String value) {
            addCriterion("lac like", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotLike(String value) {
            addCriterion("lac not like", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacIn(List<String> values) {
            addCriterion("lac in", values, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotIn(List<String> values) {
            addCriterion("lac not in", values, "lac");
            return (Criteria) this;
        }

        public Criteria andLacBetween(String value1, String value2) {
            addCriterion("lac between", value1, value2, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotBetween(String value1, String value2) {
            addCriterion("lac not between", value1, value2, "lac");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNull() {
            addCriterion("agentid is null");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNotNull() {
            addCriterion("agentid is not null");
            return (Criteria) this;
        }

        public Criteria andAgentidEqualTo(String value) {
            addCriterion("agentid =", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotEqualTo(String value) {
            addCriterion("agentid <>", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThan(String value) {
            addCriterion("agentid >", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThanOrEqualTo(String value) {
            addCriterion("agentid >=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThan(String value) {
            addCriterion("agentid <", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThanOrEqualTo(String value) {
            addCriterion("agentid <=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLike(String value) {
            addCriterion("agentid like", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotLike(String value) {
            addCriterion("agentid not like", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidIn(List<String> values) {
            addCriterion("agentid in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotIn(List<String> values) {
            addCriterion("agentid not in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidBetween(String value1, String value2) {
            addCriterion("agentid between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotBetween(String value1, String value2) {
            addCriterion("agentid not between", value1, value2, "agentid");
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