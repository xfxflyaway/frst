package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoanCompanyFinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanCompanyFinanceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andPayNameIsNull() {
            addCriterion("pay_name is null");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNotNull() {
            addCriterion("pay_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayNameEqualTo(String value) {
            addCriterion("pay_name =", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotEqualTo(String value) {
            addCriterion("pay_name <>", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThan(String value) {
            addCriterion("pay_name >", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_name >=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThan(String value) {
            addCriterion("pay_name <", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThanOrEqualTo(String value) {
            addCriterion("pay_name <=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLike(String value) {
            addCriterion("pay_name like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotLike(String value) {
            addCriterion("pay_name not like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameIn(List<String> values) {
            addCriterion("pay_name in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotIn(List<String> values) {
            addCriterion("pay_name not in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameBetween(String value1, String value2) {
            addCriterion("pay_name between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotBetween(String value1, String value2) {
            addCriterion("pay_name not between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectIsNull() {
            addCriterion("finance_project is null");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectIsNotNull() {
            addCriterion("finance_project is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectEqualTo(String value) {
            addCriterion("finance_project =", value, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectNotEqualTo(String value) {
            addCriterion("finance_project <>", value, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectGreaterThan(String value) {
            addCriterion("finance_project >", value, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectGreaterThanOrEqualTo(String value) {
            addCriterion("finance_project >=", value, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectLessThan(String value) {
            addCriterion("finance_project <", value, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectLessThanOrEqualTo(String value) {
            addCriterion("finance_project <=", value, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectLike(String value) {
            addCriterion("finance_project like", value, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectNotLike(String value) {
            addCriterion("finance_project not like", value, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectIn(List<String> values) {
            addCriterion("finance_project in", values, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectNotIn(List<String> values) {
            addCriterion("finance_project not in", values, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectBetween(String value1, String value2) {
            addCriterion("finance_project between", value1, value2, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceProjectNotBetween(String value1, String value2) {
            addCriterion("finance_project not between", value1, value2, "financeProject");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountIsNull() {
            addCriterion("finance_account is null");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountIsNotNull() {
            addCriterion("finance_account is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountEqualTo(String value) {
            addCriterion("finance_account =", value, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountNotEqualTo(String value) {
            addCriterion("finance_account <>", value, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountGreaterThan(String value) {
            addCriterion("finance_account >", value, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountGreaterThanOrEqualTo(String value) {
            addCriterion("finance_account >=", value, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountLessThan(String value) {
            addCriterion("finance_account <", value, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountLessThanOrEqualTo(String value) {
            addCriterion("finance_account <=", value, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountLike(String value) {
            addCriterion("finance_account like", value, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountNotLike(String value) {
            addCriterion("finance_account not like", value, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountIn(List<String> values) {
            addCriterion("finance_account in", values, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountNotIn(List<String> values) {
            addCriterion("finance_account not in", values, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountBetween(String value1, String value2) {
            addCriterion("finance_account between", value1, value2, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andFinanceAccountNotBetween(String value1, String value2) {
            addCriterion("finance_account not between", value1, value2, "financeAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNull() {
            addCriterion("partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(String value) {
            addCriterion("partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(String value) {
            addCriterion("partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(String value) {
            addCriterion("partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(String value) {
            addCriterion("partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(String value) {
            addCriterion("partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(String value) {
            addCriterion("partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(String value) {
            addCriterion("partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<String> values) {
            addCriterion("partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<String> values) {
            addCriterion("partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(String value1, String value2) {
            addCriterion("partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(String value1, String value2) {
            addCriterion("partner not between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterionForJDBCDate("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountIsNull() {
            addCriterion("approval_amount is null");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountIsNotNull() {
            addCriterion("approval_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountEqualTo(BigDecimal value) {
            addCriterion("approval_amount =", value, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountNotEqualTo(BigDecimal value) {
            addCriterion("approval_amount <>", value, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountGreaterThan(BigDecimal value) {
            addCriterion("approval_amount >", value, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("approval_amount >=", value, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountLessThan(BigDecimal value) {
            addCriterion("approval_amount <", value, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("approval_amount <=", value, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountIn(List<BigDecimal> values) {
            addCriterion("approval_amount in", values, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountNotIn(List<BigDecimal> values) {
            addCriterion("approval_amount not in", values, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approval_amount between", value1, value2, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andApprovalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approval_amount not between", value1, value2, "approvalAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountIsNull() {
            addCriterion("residual_amount is null");
            return (Criteria) this;
        }

        public Criteria andResidualAmountIsNotNull() {
            addCriterion("residual_amount is not null");
            return (Criteria) this;
        }

        public Criteria andResidualAmountEqualTo(BigDecimal value) {
            addCriterion("residual_amount =", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountNotEqualTo(BigDecimal value) {
            addCriterion("residual_amount <>", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountGreaterThan(BigDecimal value) {
            addCriterion("residual_amount >", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("residual_amount >=", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountLessThan(BigDecimal value) {
            addCriterion("residual_amount <", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("residual_amount <=", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountIn(List<BigDecimal> values) {
            addCriterion("residual_amount in", values, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountNotIn(List<BigDecimal> values) {
            addCriterion("residual_amount not in", values, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("residual_amount between", value1, value2, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("residual_amount not between", value1, value2, "residualAmount");
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

        public Criteria andCompStateIsNull() {
            addCriterion("comp_state is null");
            return (Criteria) this;
        }

        public Criteria andCompStateIsNotNull() {
            addCriterion("comp_state is not null");
            return (Criteria) this;
        }

        public Criteria andCompStateEqualTo(Integer value) {
            addCriterion("comp_state =", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateNotEqualTo(Integer value) {
            addCriterion("comp_state <>", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateGreaterThan(Integer value) {
            addCriterion("comp_state >", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comp_state >=", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateLessThan(Integer value) {
            addCriterion("comp_state <", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateLessThanOrEqualTo(Integer value) {
            addCriterion("comp_state <=", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateIn(List<Integer> values) {
            addCriterion("comp_state in", values, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateNotIn(List<Integer> values) {
            addCriterion("comp_state not in", values, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateBetween(Integer value1, Integer value2) {
            addCriterion("comp_state between", value1, value2, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateNotBetween(Integer value1, Integer value2) {
            addCriterion("comp_state not between", value1, value2, "compState");
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