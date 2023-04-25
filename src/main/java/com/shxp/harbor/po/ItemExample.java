package com.shxp.harbor.po;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ItemExample() {
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

        public Criteria andItemGroupIdIsNull() {
            addCriterion("item_group_id is null");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdIsNotNull() {
            addCriterion("item_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdEqualTo(Integer value) {
            addCriterion("item_group_id =", value, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdNotEqualTo(Integer value) {
            addCriterion("item_group_id <>", value, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdGreaterThan(Integer value) {
            addCriterion("item_group_id >", value, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_group_id >=", value, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdLessThan(Integer value) {
            addCriterion("item_group_id <", value, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_group_id <=", value, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdIn(List<Integer> values) {
            addCriterion("item_group_id in", values, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdNotIn(List<Integer> values) {
            addCriterion("item_group_id not in", values, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("item_group_id between", value1, value2, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andItemGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_group_id not between", value1, value2, "itemGroupId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("`number` like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("`number` not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSanntiIsNull() {
            addCriterion("sannti is null");
            return (Criteria) this;
        }

        public Criteria andSanntiIsNotNull() {
            addCriterion("sannti is not null");
            return (Criteria) this;
        }

        public Criteria andSanntiEqualTo(String value) {
            addCriterion("sannti =", value, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiNotEqualTo(String value) {
            addCriterion("sannti <>", value, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiGreaterThan(String value) {
            addCriterion("sannti >", value, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiGreaterThanOrEqualTo(String value) {
            addCriterion("sannti >=", value, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiLessThan(String value) {
            addCriterion("sannti <", value, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiLessThanOrEqualTo(String value) {
            addCriterion("sannti <=", value, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiLike(String value) {
            addCriterion("sannti like", value, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiNotLike(String value) {
            addCriterion("sannti not like", value, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiIn(List<String> values) {
            addCriterion("sannti in", values, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiNotIn(List<String> values) {
            addCriterion("sannti not in", values, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiBetween(String value1, String value2) {
            addCriterion("sannti between", value1, value2, "sannti");
            return (Criteria) this;
        }

        public Criteria andSanntiNotBetween(String value1, String value2) {
            addCriterion("sannti not between", value1, value2, "sannti");
            return (Criteria) this;
        }

        public Criteria andItemcolIsNull() {
            addCriterion("itemcol is null");
            return (Criteria) this;
        }

        public Criteria andItemcolIsNotNull() {
            addCriterion("itemcol is not null");
            return (Criteria) this;
        }

        public Criteria andItemcolEqualTo(String value) {
            addCriterion("itemcol =", value, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolNotEqualTo(String value) {
            addCriterion("itemcol <>", value, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolGreaterThan(String value) {
            addCriterion("itemcol >", value, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolGreaterThanOrEqualTo(String value) {
            addCriterion("itemcol >=", value, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolLessThan(String value) {
            addCriterion("itemcol <", value, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolLessThanOrEqualTo(String value) {
            addCriterion("itemcol <=", value, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolLike(String value) {
            addCriterion("itemcol like", value, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolNotLike(String value) {
            addCriterion("itemcol not like", value, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolIn(List<String> values) {
            addCriterion("itemcol in", values, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolNotIn(List<String> values) {
            addCriterion("itemcol not in", values, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolBetween(String value1, String value2) {
            addCriterion("itemcol between", value1, value2, "itemcol");
            return (Criteria) this;
        }

        public Criteria andItemcolNotBetween(String value1, String value2) {
            addCriterion("itemcol not between", value1, value2, "itemcol");
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