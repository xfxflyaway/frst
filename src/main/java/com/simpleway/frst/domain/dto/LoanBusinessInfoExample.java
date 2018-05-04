package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanBusinessInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanBusinessInfoExample() {
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

        public Criteria andLoanNameIsNull() {
            addCriterion("loan_name is null");
            return (Criteria) this;
        }

        public Criteria andLoanNameIsNotNull() {
            addCriterion("loan_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoanNameEqualTo(String value) {
            addCriterion("loan_name =", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotEqualTo(String value) {
            addCriterion("loan_name <>", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameGreaterThan(String value) {
            addCriterion("loan_name >", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameGreaterThanOrEqualTo(String value) {
            addCriterion("loan_name >=", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLessThan(String value) {
            addCriterion("loan_name <", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLessThanOrEqualTo(String value) {
            addCriterion("loan_name <=", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLike(String value) {
            addCriterion("loan_name like", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotLike(String value) {
            addCriterion("loan_name not like", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameIn(List<String> values) {
            addCriterion("loan_name in", values, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotIn(List<String> values) {
            addCriterion("loan_name not in", values, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameBetween(String value1, String value2) {
            addCriterion("loan_name between", value1, value2, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotBetween(String value1, String value2) {
            addCriterion("loan_name not between", value1, value2, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoIsNull() {
            addCriterion("loan_account_no is null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoIsNotNull() {
            addCriterion("loan_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoEqualTo(String value) {
            addCriterion("loan_account_no =", value, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoNotEqualTo(String value) {
            addCriterion("loan_account_no <>", value, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoGreaterThan(String value) {
            addCriterion("loan_account_no >", value, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("loan_account_no >=", value, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoLessThan(String value) {
            addCriterion("loan_account_no <", value, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoLessThanOrEqualTo(String value) {
            addCriterion("loan_account_no <=", value, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoLike(String value) {
            addCriterion("loan_account_no like", value, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoNotLike(String value) {
            addCriterion("loan_account_no not like", value, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoIn(List<String> values) {
            addCriterion("loan_account_no in", values, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoNotIn(List<String> values) {
            addCriterion("loan_account_no not in", values, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoBetween(String value1, String value2) {
            addCriterion("loan_account_no between", value1, value2, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNoNotBetween(String value1, String value2) {
            addCriterion("loan_account_no not between", value1, value2, "loanAccountNo");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyIsNull() {
            addCriterion("loan_identify is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyIsNotNull() {
            addCriterion("loan_identify is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyEqualTo(String value) {
            addCriterion("loan_identify =", value, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyNotEqualTo(String value) {
            addCriterion("loan_identify <>", value, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyGreaterThan(String value) {
            addCriterion("loan_identify >", value, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("loan_identify >=", value, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyLessThan(String value) {
            addCriterion("loan_identify <", value, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyLessThanOrEqualTo(String value) {
            addCriterion("loan_identify <=", value, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyLike(String value) {
            addCriterion("loan_identify like", value, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyNotLike(String value) {
            addCriterion("loan_identify not like", value, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyIn(List<String> values) {
            addCriterion("loan_identify in", values, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyNotIn(List<String> values) {
            addCriterion("loan_identify not in", values, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyBetween(String value1, String value2) {
            addCriterion("loan_identify between", value1, value2, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanIdentifyNotBetween(String value1, String value2) {
            addCriterion("loan_identify not between", value1, value2, "loanIdentify");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
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

        public Criteria andReturnMonthIsNull() {
            addCriterion("return_month is null");
            return (Criteria) this;
        }

        public Criteria andReturnMonthIsNotNull() {
            addCriterion("return_month is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMonthEqualTo(Integer value) {
            addCriterion("return_month =", value, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthNotEqualTo(Integer value) {
            addCriterion("return_month <>", value, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthGreaterThan(Integer value) {
            addCriterion("return_month >", value, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_month >=", value, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthLessThan(Integer value) {
            addCriterion("return_month <", value, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthLessThanOrEqualTo(Integer value) {
            addCriterion("return_month <=", value, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthIn(List<Integer> values) {
            addCriterion("return_month in", values, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthNotIn(List<Integer> values) {
            addCriterion("return_month not in", values, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthBetween(Integer value1, Integer value2) {
            addCriterion("return_month between", value1, value2, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("return_month not between", value1, value2, "returnMonth");
            return (Criteria) this;
        }

        public Criteria andReturnDayIsNull() {
            addCriterion("return_day is null");
            return (Criteria) this;
        }

        public Criteria andReturnDayIsNotNull() {
            addCriterion("return_day is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDayEqualTo(Integer value) {
            addCriterion("return_day =", value, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayNotEqualTo(Integer value) {
            addCriterion("return_day <>", value, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayGreaterThan(Integer value) {
            addCriterion("return_day >", value, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_day >=", value, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayLessThan(Integer value) {
            addCriterion("return_day <", value, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayLessThanOrEqualTo(Integer value) {
            addCriterion("return_day <=", value, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayIn(List<Integer> values) {
            addCriterion("return_day in", values, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayNotIn(List<Integer> values) {
            addCriterion("return_day not in", values, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayBetween(Integer value1, Integer value2) {
            addCriterion("return_day between", value1, value2, "returnDay");
            return (Criteria) this;
        }

        public Criteria andReturnDayNotBetween(Integer value1, Integer value2) {
            addCriterion("return_day not between", value1, value2, "returnDay");
            return (Criteria) this;
        }

        public Criteria andOneAmountIsNull() {
            addCriterion("one_amount is null");
            return (Criteria) this;
        }

        public Criteria andOneAmountIsNotNull() {
            addCriterion("one_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOneAmountEqualTo(BigDecimal value) {
            addCriterion("one_amount =", value, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountNotEqualTo(BigDecimal value) {
            addCriterion("one_amount <>", value, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountGreaterThan(BigDecimal value) {
            addCriterion("one_amount >", value, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("one_amount >=", value, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountLessThan(BigDecimal value) {
            addCriterion("one_amount <", value, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("one_amount <=", value, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountIn(List<BigDecimal> values) {
            addCriterion("one_amount in", values, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountNotIn(List<BigDecimal> values) {
            addCriterion("one_amount not in", values, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_amount between", value1, value2, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andOneAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_amount not between", value1, value2, "oneAmount");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("begin_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("begin_date =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("begin_date <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("begin_date >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_date >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("begin_date <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("begin_date <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("begin_date in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("begin_date not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("begin_date between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("begin_date not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
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