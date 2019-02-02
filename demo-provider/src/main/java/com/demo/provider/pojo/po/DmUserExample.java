package com.demo.provider.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class DmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmUserExample() {
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

        public Criteria andDmUserIdIsNull() {
            addCriterion("dm_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDmUserIdIsNotNull() {
            addCriterion("dm_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDmUserIdEqualTo(Integer value) {
            addCriterion("dm_user_id =", value, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdNotEqualTo(Integer value) {
            addCriterion("dm_user_id <>", value, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdGreaterThan(Integer value) {
            addCriterion("dm_user_id >", value, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dm_user_id >=", value, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdLessThan(Integer value) {
            addCriterion("dm_user_id <", value, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("dm_user_id <=", value, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdIn(List<Integer> values) {
            addCriterion("dm_user_id in", values, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdNotIn(List<Integer> values) {
            addCriterion("dm_user_id not in", values, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdBetween(Integer value1, Integer value2) {
            addCriterion("dm_user_id between", value1, value2, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dm_user_id not between", value1, value2, "dmUserId");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordIsNull() {
            addCriterion("dm_user_password is null");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordIsNotNull() {
            addCriterion("dm_user_password is not null");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordEqualTo(String value) {
            addCriterion("dm_user_password =", value, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordNotEqualTo(String value) {
            addCriterion("dm_user_password <>", value, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordGreaterThan(String value) {
            addCriterion("dm_user_password >", value, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("dm_user_password >=", value, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordLessThan(String value) {
            addCriterion("dm_user_password <", value, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("dm_user_password <=", value, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordLike(String value) {
            addCriterion("dm_user_password like", value, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordNotLike(String value) {
            addCriterion("dm_user_password not like", value, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordIn(List<String> values) {
            addCriterion("dm_user_password in", values, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordNotIn(List<String> values) {
            addCriterion("dm_user_password not in", values, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordBetween(String value1, String value2) {
            addCriterion("dm_user_password between", value1, value2, "dmUserPassword");
            return (Criteria) this;
        }

        public Criteria andDmUserPasswordNotBetween(String value1, String value2) {
            addCriterion("dm_user_password not between", value1, value2, "dmUserPassword");
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