package com.simpleway.frst.domain.dto;

import java.util.ArrayList;
import java.util.List;

public class SmConstTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmConstTypeExample() {
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

        public Criteria andConstTypeIdIsNull() {
            addCriterion("const_type_id is null");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdIsNotNull() {
            addCriterion("const_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdEqualTo(Long value) {
            addCriterion("const_type_id =", value, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdNotEqualTo(Long value) {
            addCriterion("const_type_id <>", value, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdGreaterThan(Long value) {
            addCriterion("const_type_id >", value, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("const_type_id >=", value, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdLessThan(Long value) {
            addCriterion("const_type_id <", value, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("const_type_id <=", value, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdIn(List<Long> values) {
            addCriterion("const_type_id in", values, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdNotIn(List<Long> values) {
            addCriterion("const_type_id not in", values, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdBetween(Long value1, Long value2) {
            addCriterion("const_type_id between", value1, value2, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("const_type_id not between", value1, value2, "constTypeId");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeIsNull() {
            addCriterion("const_type_code is null");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeIsNotNull() {
            addCriterion("const_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeEqualTo(String value) {
            addCriterion("const_type_code =", value, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeNotEqualTo(String value) {
            addCriterion("const_type_code <>", value, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeGreaterThan(String value) {
            addCriterion("const_type_code >", value, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("const_type_code >=", value, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeLessThan(String value) {
            addCriterion("const_type_code <", value, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("const_type_code <=", value, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeLike(String value) {
            addCriterion("const_type_code like", value, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeNotLike(String value) {
            addCriterion("const_type_code not like", value, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeIn(List<String> values) {
            addCriterion("const_type_code in", values, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeNotIn(List<String> values) {
            addCriterion("const_type_code not in", values, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeBetween(String value1, String value2) {
            addCriterion("const_type_code between", value1, value2, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeCodeNotBetween(String value1, String value2) {
            addCriterion("const_type_code not between", value1, value2, "constTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescIsNull() {
            addCriterion("const_type_desc is null");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescIsNotNull() {
            addCriterion("const_type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescEqualTo(String value) {
            addCriterion("const_type_desc =", value, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescNotEqualTo(String value) {
            addCriterion("const_type_desc <>", value, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescGreaterThan(String value) {
            addCriterion("const_type_desc >", value, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("const_type_desc >=", value, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescLessThan(String value) {
            addCriterion("const_type_desc <", value, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescLessThanOrEqualTo(String value) {
            addCriterion("const_type_desc <=", value, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescLike(String value) {
            addCriterion("const_type_desc like", value, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescNotLike(String value) {
            addCriterion("const_type_desc not like", value, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescIn(List<String> values) {
            addCriterion("const_type_desc in", values, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescNotIn(List<String> values) {
            addCriterion("const_type_desc not in", values, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescBetween(String value1, String value2) {
            addCriterion("const_type_desc between", value1, value2, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andConstTypeDescNotBetween(String value1, String value2) {
            addCriterion("const_type_desc not between", value1, value2, "constTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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