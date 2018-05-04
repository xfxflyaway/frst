package com.simpleway.frst.domain.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceInfoExample() {
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

        public Criteria andFinanceIdIsNull() {
            addCriterion("finance_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceIdIsNotNull() {
            addCriterion("finance_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceIdEqualTo(Long value) {
            addCriterion("finance_id =", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotEqualTo(Long value) {
            addCriterion("finance_id <>", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdGreaterThan(Long value) {
            addCriterion("finance_id >", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("finance_id >=", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLessThan(Long value) {
            addCriterion("finance_id <", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLessThanOrEqualTo(Long value) {
            addCriterion("finance_id <=", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdIn(List<Long> values) {
            addCriterion("finance_id in", values, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotIn(List<Long> values) {
            addCriterion("finance_id not in", values, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdBetween(Long value1, Long value2) {
            addCriterion("finance_id between", value1, value2, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotBetween(Long value1, Long value2) {
            addCriterion("finance_id not between", value1, value2, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceNameIsNull() {
            addCriterion("finance_name is null");
            return (Criteria) this;
        }

        public Criteria andFinanceNameIsNotNull() {
            addCriterion("finance_name is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceNameEqualTo(String value) {
            addCriterion("finance_name =", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameNotEqualTo(String value) {
            addCriterion("finance_name <>", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameGreaterThan(String value) {
            addCriterion("finance_name >", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("finance_name >=", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameLessThan(String value) {
            addCriterion("finance_name <", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameLessThanOrEqualTo(String value) {
            addCriterion("finance_name <=", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameLike(String value) {
            addCriterion("finance_name like", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameNotLike(String value) {
            addCriterion("finance_name not like", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameIn(List<String> values) {
            addCriterion("finance_name in", values, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameNotIn(List<String> values) {
            addCriterion("finance_name not in", values, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameBetween(String value1, String value2) {
            addCriterion("finance_name between", value1, value2, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameNotBetween(String value1, String value2) {
            addCriterion("finance_name not between", value1, value2, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIsNull() {
            addCriterion("finance_type is null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIsNotNull() {
            addCriterion("finance_type is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeEqualTo(Integer value) {
            addCriterion("finance_type =", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotEqualTo(Integer value) {
            addCriterion("finance_type <>", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThan(Integer value) {
            addCriterion("finance_type >", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_type >=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThan(Integer value) {
            addCriterion("finance_type <", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("finance_type <=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIn(List<Integer> values) {
            addCriterion("finance_type in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotIn(List<Integer> values) {
            addCriterion("finance_type not in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeBetween(Integer value1, Integer value2) {
            addCriterion("finance_type between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_type not between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andRelaManIsNull() {
            addCriterion("rela_man is null");
            return (Criteria) this;
        }

        public Criteria andRelaManIsNotNull() {
            addCriterion("rela_man is not null");
            return (Criteria) this;
        }

        public Criteria andRelaManEqualTo(String value) {
            addCriterion("rela_man =", value, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManNotEqualTo(String value) {
            addCriterion("rela_man <>", value, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManGreaterThan(String value) {
            addCriterion("rela_man >", value, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManGreaterThanOrEqualTo(String value) {
            addCriterion("rela_man >=", value, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManLessThan(String value) {
            addCriterion("rela_man <", value, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManLessThanOrEqualTo(String value) {
            addCriterion("rela_man <=", value, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManLike(String value) {
            addCriterion("rela_man like", value, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManNotLike(String value) {
            addCriterion("rela_man not like", value, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManIn(List<String> values) {
            addCriterion("rela_man in", values, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManNotIn(List<String> values) {
            addCriterion("rela_man not in", values, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManBetween(String value1, String value2) {
            addCriterion("rela_man between", value1, value2, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaManNotBetween(String value1, String value2) {
            addCriterion("rela_man not between", value1, value2, "relaMan");
            return (Criteria) this;
        }

        public Criteria andRelaMobileIsNull() {
            addCriterion("rela_mobile is null");
            return (Criteria) this;
        }

        public Criteria andRelaMobileIsNotNull() {
            addCriterion("rela_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andRelaMobileEqualTo(String value) {
            addCriterion("rela_mobile =", value, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileNotEqualTo(String value) {
            addCriterion("rela_mobile <>", value, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileGreaterThan(String value) {
            addCriterion("rela_mobile >", value, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileGreaterThanOrEqualTo(String value) {
            addCriterion("rela_mobile >=", value, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileLessThan(String value) {
            addCriterion("rela_mobile <", value, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileLessThanOrEqualTo(String value) {
            addCriterion("rela_mobile <=", value, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileLike(String value) {
            addCriterion("rela_mobile like", value, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileNotLike(String value) {
            addCriterion("rela_mobile not like", value, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileIn(List<String> values) {
            addCriterion("rela_mobile in", values, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileNotIn(List<String> values) {
            addCriterion("rela_mobile not in", values, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileBetween(String value1, String value2) {
            addCriterion("rela_mobile between", value1, value2, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andRelaMobileNotBetween(String value1, String value2) {
            addCriterion("rela_mobile not between", value1, value2, "relaMobile");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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