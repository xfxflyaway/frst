package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarnInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarnInfoExample() {
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

        public Criteria andWarnIdIsNull() {
            addCriterion("warn_id is null");
            return (Criteria) this;
        }

        public Criteria andWarnIdIsNotNull() {
            addCriterion("warn_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarnIdEqualTo(Long value) {
            addCriterion("warn_id =", value, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdNotEqualTo(Long value) {
            addCriterion("warn_id <>", value, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdGreaterThan(Long value) {
            addCriterion("warn_id >", value, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("warn_id >=", value, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdLessThan(Long value) {
            addCriterion("warn_id <", value, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdLessThanOrEqualTo(Long value) {
            addCriterion("warn_id <=", value, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdIn(List<Long> values) {
            addCriterion("warn_id in", values, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdNotIn(List<Long> values) {
            addCriterion("warn_id not in", values, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdBetween(Long value1, Long value2) {
            addCriterion("warn_id between", value1, value2, "warnId");
            return (Criteria) this;
        }

        public Criteria andWarnIdNotBetween(Long value1, Long value2) {
            addCriterion("warn_id not between", value1, value2, "warnId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIsNull() {
            addCriterion("warn_type is null");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIsNotNull() {
            addCriterion("warn_type is not null");
            return (Criteria) this;
        }

        public Criteria andWarnTypeEqualTo(Integer value) {
            addCriterion("warn_type =", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotEqualTo(Integer value) {
            addCriterion("warn_type <>", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeGreaterThan(Integer value) {
            addCriterion("warn_type >", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_type >=", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeLessThan(Integer value) {
            addCriterion("warn_type <", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeLessThanOrEqualTo(Integer value) {
            addCriterion("warn_type <=", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIn(List<Integer> values) {
            addCriterion("warn_type in", values, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotIn(List<Integer> values) {
            addCriterion("warn_type not in", values, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeBetween(Integer value1, Integer value2) {
            addCriterion("warn_type between", value1, value2, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_type not between", value1, value2, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnAmountIsNull() {
            addCriterion("warn_amount is null");
            return (Criteria) this;
        }

        public Criteria andWarnAmountIsNotNull() {
            addCriterion("warn_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWarnAmountEqualTo(BigDecimal value) {
            addCriterion("warn_amount =", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountNotEqualTo(BigDecimal value) {
            addCriterion("warn_amount <>", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountGreaterThan(BigDecimal value) {
            addCriterion("warn_amount >", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("warn_amount >=", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountLessThan(BigDecimal value) {
            addCriterion("warn_amount <", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("warn_amount <=", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountIn(List<BigDecimal> values) {
            addCriterion("warn_amount in", values, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountNotIn(List<BigDecimal> values) {
            addCriterion("warn_amount not in", values, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warn_amount between", value1, value2, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warn_amount not between", value1, value2, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdIsNull() {
            addCriterion("warn_busi_id is null");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdIsNotNull() {
            addCriterion("warn_busi_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdEqualTo(Long value) {
            addCriterion("warn_busi_id =", value, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdNotEqualTo(Long value) {
            addCriterion("warn_busi_id <>", value, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdGreaterThan(Long value) {
            addCriterion("warn_busi_id >", value, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("warn_busi_id >=", value, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdLessThan(Long value) {
            addCriterion("warn_busi_id <", value, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdLessThanOrEqualTo(Long value) {
            addCriterion("warn_busi_id <=", value, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdIn(List<Long> values) {
            addCriterion("warn_busi_id in", values, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdNotIn(List<Long> values) {
            addCriterion("warn_busi_id not in", values, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdBetween(Long value1, Long value2) {
            addCriterion("warn_busi_id between", value1, value2, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnBusiIdNotBetween(Long value1, Long value2) {
            addCriterion("warn_busi_id not between", value1, value2, "warnBusiId");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIsNull() {
            addCriterion("warn_time is null");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIsNotNull() {
            addCriterion("warn_time is not null");
            return (Criteria) this;
        }

        public Criteria andWarnTimeEqualTo(Date value) {
            addCriterion("warn_time =", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotEqualTo(Date value) {
            addCriterion("warn_time <>", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeGreaterThan(Date value) {
            addCriterion("warn_time >", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("warn_time >=", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeLessThan(Date value) {
            addCriterion("warn_time <", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeLessThanOrEqualTo(Date value) {
            addCriterion("warn_time <=", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIn(List<Date> values) {
            addCriterion("warn_time in", values, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotIn(List<Date> values) {
            addCriterion("warn_time not in", values, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeBetween(Date value1, Date value2) {
            addCriterion("warn_time between", value1, value2, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotBetween(Date value1, Date value2) {
            addCriterion("warn_time not between", value1, value2, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnDescIsNull() {
            addCriterion("warn_desc is null");
            return (Criteria) this;
        }

        public Criteria andWarnDescIsNotNull() {
            addCriterion("warn_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWarnDescEqualTo(String value) {
            addCriterion("warn_desc =", value, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescNotEqualTo(String value) {
            addCriterion("warn_desc <>", value, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescGreaterThan(String value) {
            addCriterion("warn_desc >", value, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescGreaterThanOrEqualTo(String value) {
            addCriterion("warn_desc >=", value, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescLessThan(String value) {
            addCriterion("warn_desc <", value, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescLessThanOrEqualTo(String value) {
            addCriterion("warn_desc <=", value, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescLike(String value) {
            addCriterion("warn_desc like", value, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescNotLike(String value) {
            addCriterion("warn_desc not like", value, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescIn(List<String> values) {
            addCriterion("warn_desc in", values, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescNotIn(List<String> values) {
            addCriterion("warn_desc not in", values, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescBetween(String value1, String value2) {
            addCriterion("warn_desc between", value1, value2, "warnDesc");
            return (Criteria) this;
        }

        public Criteria andWarnDescNotBetween(String value1, String value2) {
            addCriterion("warn_desc not between", value1, value2, "warnDesc");
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