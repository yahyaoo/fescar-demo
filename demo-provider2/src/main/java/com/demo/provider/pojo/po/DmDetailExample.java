package com.demo.provider.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class DmDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmDetailExample() {
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

        public Criteria andDmDetailIdIsNull() {
            addCriterion("dm_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdIsNotNull() {
            addCriterion("dm_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdEqualTo(Integer value) {
            addCriterion("dm_detail_id =", value, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdNotEqualTo(Integer value) {
            addCriterion("dm_detail_id <>", value, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdGreaterThan(Integer value) {
            addCriterion("dm_detail_id >", value, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dm_detail_id >=", value, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdLessThan(Integer value) {
            addCriterion("dm_detail_id <", value, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("dm_detail_id <=", value, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdIn(List<Integer> values) {
            addCriterion("dm_detail_id in", values, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdNotIn(List<Integer> values) {
            addCriterion("dm_detail_id not in", values, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("dm_detail_id between", value1, value2, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dm_detail_id not between", value1, value2, "dmDetailId");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameIsNull() {
            addCriterion("dm_detail_name is null");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameIsNotNull() {
            addCriterion("dm_detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameEqualTo(String value) {
            addCriterion("dm_detail_name =", value, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameNotEqualTo(String value) {
            addCriterion("dm_detail_name <>", value, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameGreaterThan(String value) {
            addCriterion("dm_detail_name >", value, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("dm_detail_name >=", value, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameLessThan(String value) {
            addCriterion("dm_detail_name <", value, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameLessThanOrEqualTo(String value) {
            addCriterion("dm_detail_name <=", value, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameLike(String value) {
            addCriterion("dm_detail_name like", value, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameNotLike(String value) {
            addCriterion("dm_detail_name not like", value, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameIn(List<String> values) {
            addCriterion("dm_detail_name in", values, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameNotIn(List<String> values) {
            addCriterion("dm_detail_name not in", values, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameBetween(String value1, String value2) {
            addCriterion("dm_detail_name between", value1, value2, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailNameNotBetween(String value1, String value2) {
            addCriterion("dm_detail_name not between", value1, value2, "dmDetailName");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderIsNull() {
            addCriterion("dm_detail_gender is null");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderIsNotNull() {
            addCriterion("dm_detail_gender is not null");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderEqualTo(Boolean value) {
            addCriterion("dm_detail_gender =", value, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderNotEqualTo(Boolean value) {
            addCriterion("dm_detail_gender <>", value, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderGreaterThan(Boolean value) {
            addCriterion("dm_detail_gender >", value, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dm_detail_gender >=", value, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderLessThan(Boolean value) {
            addCriterion("dm_detail_gender <", value, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("dm_detail_gender <=", value, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderIn(List<Boolean> values) {
            addCriterion("dm_detail_gender in", values, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderNotIn(List<Boolean> values) {
            addCriterion("dm_detail_gender not in", values, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("dm_detail_gender between", value1, value2, "dmDetailGender");
            return (Criteria) this;
        }

        public Criteria andDmDetailGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dm_detail_gender not between", value1, value2, "dmDetailGender");
            return (Criteria) this;
        }
    }

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