package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BankFlowDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankFlowDetailExample() {
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

        public Criteria andCoreSerialNoIsNull() {
            addCriterion("core_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoIsNotNull() {
            addCriterion("core_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoEqualTo(String value) {
            addCriterion("core_serial_no =", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoNotEqualTo(String value) {
            addCriterion("core_serial_no <>", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoGreaterThan(String value) {
            addCriterion("core_serial_no >", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("core_serial_no >=", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoLessThan(String value) {
            addCriterion("core_serial_no <", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoLessThanOrEqualTo(String value) {
            addCriterion("core_serial_no <=", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoLike(String value) {
            addCriterion("core_serial_no like", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoNotLike(String value) {
            addCriterion("core_serial_no not like", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoIn(List<String> values) {
            addCriterion("core_serial_no in", values, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoNotIn(List<String> values) {
            addCriterion("core_serial_no not in", values, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoBetween(String value1, String value2) {
            addCriterion("core_serial_no between", value1, value2, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoNotBetween(String value1, String value2) {
            addCriterion("core_serial_no not between", value1, value2, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIsNull() {
            addCriterion("transaction_date is null");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIsNotNull() {
            addCriterion("transaction_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionDateEqualTo(Date value) {
            addCriterionForJDBCDate("transaction_date =", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("transaction_date <>", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("transaction_date >", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("transaction_date >=", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLessThan(Date value) {
            addCriterionForJDBCDate("transaction_date <", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("transaction_date <=", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIn(List<Date> values) {
            addCriterionForJDBCDate("transaction_date in", values, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("transaction_date not in", values, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("transaction_date between", value1, value2, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("transaction_date not between", value1, value2, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIsNull() {
            addCriterion("transaction_time is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIsNotNull() {
            addCriterion("transaction_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeEqualTo(String value) {
            addCriterion("transaction_time =", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotEqualTo(String value) {
            addCriterion("transaction_time <>", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeGreaterThan(String value) {
            addCriterion("transaction_time >", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_time >=", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLessThan(String value) {
            addCriterion("transaction_time <", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLessThanOrEqualTo(String value) {
            addCriterion("transaction_time <=", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLike(String value) {
            addCriterion("transaction_time like", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotLike(String value) {
            addCriterion("transaction_time not like", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIn(List<String> values) {
            addCriterion("transaction_time in", values, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotIn(List<String> values) {
            addCriterion("transaction_time not in", values, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeBetween(String value1, String value2) {
            addCriterion("transaction_time between", value1, value2, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotBetween(String value1, String value2) {
            addCriterion("transaction_time not between", value1, value2, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andOutInIsNull() {
            addCriterion("out_in is null");
            return (Criteria) this;
        }

        public Criteria andOutInIsNotNull() {
            addCriterion("out_in is not null");
            return (Criteria) this;
        }

        public Criteria andOutInEqualTo(String value) {
            addCriterion("out_in =", value, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInNotEqualTo(String value) {
            addCriterion("out_in <>", value, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInGreaterThan(String value) {
            addCriterion("out_in >", value, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInGreaterThanOrEqualTo(String value) {
            addCriterion("out_in >=", value, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInLessThan(String value) {
            addCriterion("out_in <", value, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInLessThanOrEqualTo(String value) {
            addCriterion("out_in <=", value, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInLike(String value) {
            addCriterion("out_in like", value, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInNotLike(String value) {
            addCriterion("out_in not like", value, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInIn(List<String> values) {
            addCriterion("out_in in", values, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInNotIn(List<String> values) {
            addCriterion("out_in not in", values, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInBetween(String value1, String value2) {
            addCriterion("out_in between", value1, value2, "outIn");
            return (Criteria) this;
        }

        public Criteria andOutInNotBetween(String value1, String value2) {
            addCriterion("out_in not between", value1, value2, "outIn");
            return (Criteria) this;
        }

        public Criteria andForwardFlagIsNull() {
            addCriterion("forward_flag is null");
            return (Criteria) this;
        }

        public Criteria andForwardFlagIsNotNull() {
            addCriterion("forward_flag is not null");
            return (Criteria) this;
        }

        public Criteria andForwardFlagEqualTo(String value) {
            addCriterion("forward_flag =", value, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagNotEqualTo(String value) {
            addCriterion("forward_flag <>", value, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagGreaterThan(String value) {
            addCriterion("forward_flag >", value, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagGreaterThanOrEqualTo(String value) {
            addCriterion("forward_flag >=", value, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagLessThan(String value) {
            addCriterion("forward_flag <", value, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagLessThanOrEqualTo(String value) {
            addCriterion("forward_flag <=", value, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagLike(String value) {
            addCriterion("forward_flag like", value, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagNotLike(String value) {
            addCriterion("forward_flag not like", value, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagIn(List<String> values) {
            addCriterion("forward_flag in", values, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagNotIn(List<String> values) {
            addCriterion("forward_flag not in", values, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagBetween(String value1, String value2) {
            addCriterion("forward_flag between", value1, value2, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andForwardFlagNotBetween(String value1, String value2) {
            addCriterion("forward_flag not between", value1, value2, "forwardFlag");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountIsNull() {
            addCriterion("transction_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountIsNotNull() {
            addCriterion("transction_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountEqualTo(BigDecimal value) {
            addCriterion("transction_amount =", value, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountNotEqualTo(BigDecimal value) {
            addCriterion("transction_amount <>", value, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountGreaterThan(BigDecimal value) {
            addCriterion("transction_amount >", value, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transction_amount >=", value, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountLessThan(BigDecimal value) {
            addCriterion("transction_amount <", value, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transction_amount <=", value, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountIn(List<BigDecimal> values) {
            addCriterion("transction_amount in", values, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountNotIn(List<BigDecimal> values) {
            addCriterion("transction_amount not in", values, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transction_amount between", value1, value2, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andTransctionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transction_amount not between", value1, value2, "transctionAmount");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceIsNull() {
            addCriterion("account_balance is null");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceIsNotNull() {
            addCriterion("account_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceEqualTo(BigDecimal value) {
            addCriterion("account_balance =", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotEqualTo(BigDecimal value) {
            addCriterion("account_balance <>", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThan(BigDecimal value) {
            addCriterion("account_balance >", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_balance >=", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceLessThan(BigDecimal value) {
            addCriterion("account_balance <", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_balance <=", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceIn(List<BigDecimal> values) {
            addCriterion("account_balance in", values, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotIn(List<BigDecimal> values) {
            addCriterion("account_balance not in", values, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_balance between", value1, value2, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_balance not between", value1, value2, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andTradeBankIsNull() {
            addCriterion("trade_bank is null");
            return (Criteria) this;
        }

        public Criteria andTradeBankIsNotNull() {
            addCriterion("trade_bank is not null");
            return (Criteria) this;
        }

        public Criteria andTradeBankEqualTo(String value) {
            addCriterion("trade_bank =", value, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankNotEqualTo(String value) {
            addCriterion("trade_bank <>", value, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankGreaterThan(String value) {
            addCriterion("trade_bank >", value, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankGreaterThanOrEqualTo(String value) {
            addCriterion("trade_bank >=", value, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankLessThan(String value) {
            addCriterion("trade_bank <", value, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankLessThanOrEqualTo(String value) {
            addCriterion("trade_bank <=", value, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankLike(String value) {
            addCriterion("trade_bank like", value, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankNotLike(String value) {
            addCriterion("trade_bank not like", value, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankIn(List<String> values) {
            addCriterion("trade_bank in", values, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankNotIn(List<String> values) {
            addCriterion("trade_bank not in", values, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankBetween(String value1, String value2) {
            addCriterion("trade_bank between", value1, value2, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeBankNotBetween(String value1, String value2) {
            addCriterion("trade_bank not between", value1, value2, "tradeBank");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameIsNull() {
            addCriterion("trade_account_name is null");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameIsNotNull() {
            addCriterion("trade_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameEqualTo(String value) {
            addCriterion("trade_account_name =", value, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameNotEqualTo(String value) {
            addCriterion("trade_account_name <>", value, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameGreaterThan(String value) {
            addCriterion("trade_account_name >", value, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("trade_account_name >=", value, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameLessThan(String value) {
            addCriterion("trade_account_name <", value, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameLessThanOrEqualTo(String value) {
            addCriterion("trade_account_name <=", value, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameLike(String value) {
            addCriterion("trade_account_name like", value, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameNotLike(String value) {
            addCriterion("trade_account_name not like", value, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameIn(List<String> values) {
            addCriterion("trade_account_name in", values, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameNotIn(List<String> values) {
            addCriterion("trade_account_name not in", values, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameBetween(String value1, String value2) {
            addCriterion("trade_account_name between", value1, value2, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNameNotBetween(String value1, String value2) {
            addCriterion("trade_account_name not between", value1, value2, "tradeAccountName");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoIsNull() {
            addCriterion("trade_account_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoIsNotNull() {
            addCriterion("trade_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoEqualTo(String value) {
            addCriterion("trade_account_no =", value, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoNotEqualTo(String value) {
            addCriterion("trade_account_no <>", value, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoGreaterThan(String value) {
            addCriterion("trade_account_no >", value, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_account_no >=", value, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoLessThan(String value) {
            addCriterion("trade_account_no <", value, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoLessThanOrEqualTo(String value) {
            addCriterion("trade_account_no <=", value, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoLike(String value) {
            addCriterion("trade_account_no like", value, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoNotLike(String value) {
            addCriterion("trade_account_no not like", value, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoIn(List<String> values) {
            addCriterion("trade_account_no in", values, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoNotIn(List<String> values) {
            addCriterion("trade_account_no not in", values, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoBetween(String value1, String value2) {
            addCriterion("trade_account_no between", value1, value2, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andTradeAccountNoNotBetween(String value1, String value2) {
            addCriterion("trade_account_no not between", value1, value2, "tradeAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterBankIsNull() {
            addCriterion("counter_bank is null");
            return (Criteria) this;
        }

        public Criteria andCounterBankIsNotNull() {
            addCriterion("counter_bank is not null");
            return (Criteria) this;
        }

        public Criteria andCounterBankEqualTo(String value) {
            addCriterion("counter_bank =", value, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankNotEqualTo(String value) {
            addCriterion("counter_bank <>", value, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankGreaterThan(String value) {
            addCriterion("counter_bank >", value, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankGreaterThanOrEqualTo(String value) {
            addCriterion("counter_bank >=", value, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankLessThan(String value) {
            addCriterion("counter_bank <", value, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankLessThanOrEqualTo(String value) {
            addCriterion("counter_bank <=", value, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankLike(String value) {
            addCriterion("counter_bank like", value, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankNotLike(String value) {
            addCriterion("counter_bank not like", value, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankIn(List<String> values) {
            addCriterion("counter_bank in", values, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankNotIn(List<String> values) {
            addCriterion("counter_bank not in", values, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankBetween(String value1, String value2) {
            addCriterion("counter_bank between", value1, value2, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterBankNotBetween(String value1, String value2) {
            addCriterion("counter_bank not between", value1, value2, "counterBank");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameIsNull() {
            addCriterion("counter_account_name is null");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameIsNotNull() {
            addCriterion("counter_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameEqualTo(String value) {
            addCriterion("counter_account_name =", value, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameNotEqualTo(String value) {
            addCriterion("counter_account_name <>", value, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameGreaterThan(String value) {
            addCriterion("counter_account_name >", value, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("counter_account_name >=", value, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameLessThan(String value) {
            addCriterion("counter_account_name <", value, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameLessThanOrEqualTo(String value) {
            addCriterion("counter_account_name <=", value, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameLike(String value) {
            addCriterion("counter_account_name like", value, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameNotLike(String value) {
            addCriterion("counter_account_name not like", value, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameIn(List<String> values) {
            addCriterion("counter_account_name in", values, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameNotIn(List<String> values) {
            addCriterion("counter_account_name not in", values, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameBetween(String value1, String value2) {
            addCriterion("counter_account_name between", value1, value2, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNameNotBetween(String value1, String value2) {
            addCriterion("counter_account_name not between", value1, value2, "counterAccountName");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoIsNull() {
            addCriterion("counter_account_no is null");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoIsNotNull() {
            addCriterion("counter_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoEqualTo(String value) {
            addCriterion("counter_account_no =", value, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoNotEqualTo(String value) {
            addCriterion("counter_account_no <>", value, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoGreaterThan(String value) {
            addCriterion("counter_account_no >", value, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("counter_account_no >=", value, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoLessThan(String value) {
            addCriterion("counter_account_no <", value, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoLessThanOrEqualTo(String value) {
            addCriterion("counter_account_no <=", value, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoLike(String value) {
            addCriterion("counter_account_no like", value, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoNotLike(String value) {
            addCriterion("counter_account_no not like", value, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoIn(List<String> values) {
            addCriterion("counter_account_no in", values, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoNotIn(List<String> values) {
            addCriterion("counter_account_no not in", values, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoBetween(String value1, String value2) {
            addCriterion("counter_account_no between", value1, value2, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andCounterAccountNoNotBetween(String value1, String value2) {
            addCriterion("counter_account_no not between", value1, value2, "counterAccountNo");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNull() {
            addCriterion("postscript is null");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNotNull() {
            addCriterion("postscript is not null");
            return (Criteria) this;
        }

        public Criteria andPostscriptEqualTo(String value) {
            addCriterion("postscript =", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotEqualTo(String value) {
            addCriterion("postscript <>", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThan(String value) {
            addCriterion("postscript >", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThanOrEqualTo(String value) {
            addCriterion("postscript >=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThan(String value) {
            addCriterion("postscript <", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThanOrEqualTo(String value) {
            addCriterion("postscript <=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLike(String value) {
            addCriterion("postscript like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotLike(String value) {
            addCriterion("postscript not like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptIn(List<String> values) {
            addCriterion("postscript in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotIn(List<String> values) {
            addCriterion("postscript not in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptBetween(String value1, String value2) {
            addCriterion("postscript between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotBetween(String value1, String value2) {
            addCriterion("postscript not between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoIsNull() {
            addCriterion("transaction_info is null");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoIsNotNull() {
            addCriterion("transaction_info is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoEqualTo(String value) {
            addCriterion("transaction_info =", value, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoNotEqualTo(String value) {
            addCriterion("transaction_info <>", value, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoGreaterThan(String value) {
            addCriterion("transaction_info >", value, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_info >=", value, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoLessThan(String value) {
            addCriterion("transaction_info <", value, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoLessThanOrEqualTo(String value) {
            addCriterion("transaction_info <=", value, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoLike(String value) {
            addCriterion("transaction_info like", value, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoNotLike(String value) {
            addCriterion("transaction_info not like", value, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoIn(List<String> values) {
            addCriterion("transaction_info in", values, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoNotIn(List<String> values) {
            addCriterion("transaction_info not in", values, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoBetween(String value1, String value2) {
            addCriterion("transaction_info between", value1, value2, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionInfoNotBetween(String value1, String value2) {
            addCriterion("transaction_info not between", value1, value2, "transactionInfo");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIsNull() {
            addCriterion("transaction_desc is null");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIsNotNull() {
            addCriterion("transaction_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionDescEqualTo(String value) {
            addCriterion("transaction_desc =", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotEqualTo(String value) {
            addCriterion("transaction_desc <>", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescGreaterThan(String value) {
            addCriterion("transaction_desc >", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_desc >=", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescLessThan(String value) {
            addCriterion("transaction_desc <", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescLessThanOrEqualTo(String value) {
            addCriterion("transaction_desc <=", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescLike(String value) {
            addCriterion("transaction_desc like", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotLike(String value) {
            addCriterion("transaction_desc not like", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIn(List<String> values) {
            addCriterion("transaction_desc in", values, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotIn(List<String> values) {
            addCriterion("transaction_desc not in", values, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescBetween(String value1, String value2) {
            addCriterion("transaction_desc between", value1, value2, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotBetween(String value1, String value2) {
            addCriterion("transaction_desc not between", value1, value2, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainIsNull() {
            addCriterion("transaction_explain is null");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainIsNotNull() {
            addCriterion("transaction_explain is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainEqualTo(String value) {
            addCriterion("transaction_explain =", value, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainNotEqualTo(String value) {
            addCriterion("transaction_explain <>", value, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainGreaterThan(String value) {
            addCriterion("transaction_explain >", value, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_explain >=", value, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainLessThan(String value) {
            addCriterion("transaction_explain <", value, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainLessThanOrEqualTo(String value) {
            addCriterion("transaction_explain <=", value, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainLike(String value) {
            addCriterion("transaction_explain like", value, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainNotLike(String value) {
            addCriterion("transaction_explain not like", value, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainIn(List<String> values) {
            addCriterion("transaction_explain in", values, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainNotIn(List<String> values) {
            addCriterion("transaction_explain not in", values, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainBetween(String value1, String value2) {
            addCriterion("transaction_explain between", value1, value2, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andTransactionExplainNotBetween(String value1, String value2) {
            addCriterion("transaction_explain not between", value1, value2, "transactionExplain");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryIsNull() {
            addCriterion("business_summary is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryIsNotNull() {
            addCriterion("business_summary is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryEqualTo(String value) {
            addCriterion("business_summary =", value, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryNotEqualTo(String value) {
            addCriterion("business_summary <>", value, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryGreaterThan(String value) {
            addCriterion("business_summary >", value, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("business_summary >=", value, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryLessThan(String value) {
            addCriterion("business_summary <", value, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryLessThanOrEqualTo(String value) {
            addCriterion("business_summary <=", value, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryLike(String value) {
            addCriterion("business_summary like", value, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryNotLike(String value) {
            addCriterion("business_summary not like", value, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryIn(List<String> values) {
            addCriterion("business_summary in", values, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryNotIn(List<String> values) {
            addCriterion("business_summary not in", values, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryBetween(String value1, String value2) {
            addCriterion("business_summary between", value1, value2, "businessSummary");
            return (Criteria) this;
        }

        public Criteria andBusinessSummaryNotBetween(String value1, String value2) {
            addCriterion("business_summary not between", value1, value2, "businessSummary");
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