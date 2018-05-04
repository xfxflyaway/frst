package com.simpleway.frst.domain.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmAuthExample() {
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

        public Criteria andAuthIdIsNull() {
            addCriterion("auth_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNotNull() {
            addCriterion("auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthIdEqualTo(Long value) {
            addCriterion("auth_id =", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotEqualTo(Long value) {
            addCriterion("auth_id <>", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThan(Long value) {
            addCriterion("auth_id >", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThanOrEqualTo(Long value) {
            addCriterion("auth_id >=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThan(Long value) {
            addCriterion("auth_id <", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThanOrEqualTo(Long value) {
            addCriterion("auth_id <=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIn(List<Long> values) {
            addCriterion("auth_id in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotIn(List<Long> values) {
            addCriterion("auth_id not in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdBetween(Long value1, Long value2) {
            addCriterion("auth_id between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotBetween(Long value1, Long value2) {
            addCriterion("auth_id not between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeIsNull() {
            addCriterion("auth_inner_code is null");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeIsNotNull() {
            addCriterion("auth_inner_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeEqualTo(String value) {
            addCriterion("auth_inner_code =", value, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeNotEqualTo(String value) {
            addCriterion("auth_inner_code <>", value, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeGreaterThan(String value) {
            addCriterion("auth_inner_code >", value, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("auth_inner_code >=", value, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeLessThan(String value) {
            addCriterion("auth_inner_code <", value, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeLessThanOrEqualTo(String value) {
            addCriterion("auth_inner_code <=", value, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeLike(String value) {
            addCriterion("auth_inner_code like", value, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeNotLike(String value) {
            addCriterion("auth_inner_code not like", value, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeIn(List<String> values) {
            addCriterion("auth_inner_code in", values, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeNotIn(List<String> values) {
            addCriterion("auth_inner_code not in", values, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeBetween(String value1, String value2) {
            addCriterion("auth_inner_code between", value1, value2, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthInnerCodeNotBetween(String value1, String value2) {
            addCriterion("auth_inner_code not between", value1, value2, "authInnerCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeIsNull() {
            addCriterion("auth_out_code is null");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeIsNotNull() {
            addCriterion("auth_out_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeEqualTo(String value) {
            addCriterion("auth_out_code =", value, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeNotEqualTo(String value) {
            addCriterion("auth_out_code <>", value, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeGreaterThan(String value) {
            addCriterion("auth_out_code >", value, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeGreaterThanOrEqualTo(String value) {
            addCriterion("auth_out_code >=", value, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeLessThan(String value) {
            addCriterion("auth_out_code <", value, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeLessThanOrEqualTo(String value) {
            addCriterion("auth_out_code <=", value, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeLike(String value) {
            addCriterion("auth_out_code like", value, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeNotLike(String value) {
            addCriterion("auth_out_code not like", value, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeIn(List<String> values) {
            addCriterion("auth_out_code in", values, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeNotIn(List<String> values) {
            addCriterion("auth_out_code not in", values, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeBetween(String value1, String value2) {
            addCriterion("auth_out_code between", value1, value2, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthOutCodeNotBetween(String value1, String value2) {
            addCriterion("auth_out_code not between", value1, value2, "authOutCode");
            return (Criteria) this;
        }

        public Criteria andAuthNameIsNull() {
            addCriterion("auth_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthNameIsNotNull() {
            addCriterion("auth_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthNameEqualTo(String value) {
            addCriterion("auth_name =", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameNotEqualTo(String value) {
            addCriterion("auth_name <>", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameGreaterThan(String value) {
            addCriterion("auth_name >", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameGreaterThanOrEqualTo(String value) {
            addCriterion("auth_name >=", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameLessThan(String value) {
            addCriterion("auth_name <", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameLessThanOrEqualTo(String value) {
            addCriterion("auth_name <=", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameLike(String value) {
            addCriterion("auth_name like", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameNotLike(String value) {
            addCriterion("auth_name not like", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameIn(List<String> values) {
            addCriterion("auth_name in", values, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameNotIn(List<String> values) {
            addCriterion("auth_name not in", values, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameBetween(String value1, String value2) {
            addCriterion("auth_name between", value1, value2, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameNotBetween(String value1, String value2) {
            addCriterion("auth_name not between", value1, value2, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthUrlIsNull() {
            addCriterion("auth_url is null");
            return (Criteria) this;
        }

        public Criteria andAuthUrlIsNotNull() {
            addCriterion("auth_url is not null");
            return (Criteria) this;
        }

        public Criteria andAuthUrlEqualTo(String value) {
            addCriterion("auth_url =", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlNotEqualTo(String value) {
            addCriterion("auth_url <>", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlGreaterThan(String value) {
            addCriterion("auth_url >", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlGreaterThanOrEqualTo(String value) {
            addCriterion("auth_url >=", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlLessThan(String value) {
            addCriterion("auth_url <", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlLessThanOrEqualTo(String value) {
            addCriterion("auth_url <=", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlLike(String value) {
            addCriterion("auth_url like", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlNotLike(String value) {
            addCriterion("auth_url not like", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlIn(List<String> values) {
            addCriterion("auth_url in", values, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlNotIn(List<String> values) {
            addCriterion("auth_url not in", values, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlBetween(String value1, String value2) {
            addCriterion("auth_url between", value1, value2, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlNotBetween(String value1, String value2) {
            addCriterion("auth_url not between", value1, value2, "authUrl");
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

        public Criteria andUpperAuthIdIsNull() {
            addCriterion("upper_auth_id is null");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdIsNotNull() {
            addCriterion("upper_auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdEqualTo(Long value) {
            addCriterion("upper_auth_id =", value, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdNotEqualTo(Long value) {
            addCriterion("upper_auth_id <>", value, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdGreaterThan(Long value) {
            addCriterion("upper_auth_id >", value, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdGreaterThanOrEqualTo(Long value) {
            addCriterion("upper_auth_id >=", value, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdLessThan(Long value) {
            addCriterion("upper_auth_id <", value, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdLessThanOrEqualTo(Long value) {
            addCriterion("upper_auth_id <=", value, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdIn(List<Long> values) {
            addCriterion("upper_auth_id in", values, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdNotIn(List<Long> values) {
            addCriterion("upper_auth_id not in", values, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdBetween(Long value1, Long value2) {
            addCriterion("upper_auth_id between", value1, value2, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andUpperAuthIdNotBetween(Long value1, Long value2) {
            addCriterion("upper_auth_id not between", value1, value2, "upperAuthId");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(Integer value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(Integer value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(Integer value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(Integer value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(Integer value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<Integer> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<Integer> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(Integer value1, Integer value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
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

        public Criteria andAuthDescIsNull() {
            addCriterion("auth_desc is null");
            return (Criteria) this;
        }

        public Criteria andAuthDescIsNotNull() {
            addCriterion("auth_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAuthDescEqualTo(String value) {
            addCriterion("auth_desc =", value, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescNotEqualTo(String value) {
            addCriterion("auth_desc <>", value, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescGreaterThan(String value) {
            addCriterion("auth_desc >", value, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescGreaterThanOrEqualTo(String value) {
            addCriterion("auth_desc >=", value, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescLessThan(String value) {
            addCriterion("auth_desc <", value, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescLessThanOrEqualTo(String value) {
            addCriterion("auth_desc <=", value, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescLike(String value) {
            addCriterion("auth_desc like", value, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescNotLike(String value) {
            addCriterion("auth_desc not like", value, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescIn(List<String> values) {
            addCriterion("auth_desc in", values, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescNotIn(List<String> values) {
            addCriterion("auth_desc not in", values, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescBetween(String value1, String value2) {
            addCriterion("auth_desc between", value1, value2, "authDesc");
            return (Criteria) this;
        }

        public Criteria andAuthDescNotBetween(String value1, String value2) {
            addCriterion("auth_desc not between", value1, value2, "authDesc");
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