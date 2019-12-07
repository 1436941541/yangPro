package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Test1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Test1Example() {
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

        public Criteria andTest1IsNull() {
            addCriterion("test1 is null");
            return (Criteria) this;
        }

        public Criteria andTest1IsNotNull() {
            addCriterion("test1 is not null");
            return (Criteria) this;
        }

        public Criteria andTest1EqualTo(String value) {
            addCriterion("test1 =", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotEqualTo(String value) {
            addCriterion("test1 <>", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1GreaterThan(String value) {
            addCriterion("test1 >", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1GreaterThanOrEqualTo(String value) {
            addCriterion("test1 >=", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1LessThan(String value) {
            addCriterion("test1 <", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1LessThanOrEqualTo(String value) {
            addCriterion("test1 <=", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1Like(String value) {
            addCriterion("test1 like", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotLike(String value) {
            addCriterion("test1 not like", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1In(List<String> values) {
            addCriterion("test1 in", values, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotIn(List<String> values) {
            addCriterion("test1 not in", values, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1Between(String value1, String value2) {
            addCriterion("test1 between", value1, value2, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotBetween(String value1, String value2) {
            addCriterion("test1 not between", value1, value2, "test1");
            return (Criteria) this;
        }

        public Criteria andTest2IsNull() {
            addCriterion("test2 is null");
            return (Criteria) this;
        }

        public Criteria andTest2IsNotNull() {
            addCriterion("test2 is not null");
            return (Criteria) this;
        }

        public Criteria andTest2EqualTo(String value) {
            addCriterion("test2 =", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotEqualTo(String value) {
            addCriterion("test2 <>", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2GreaterThan(String value) {
            addCriterion("test2 >", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2GreaterThanOrEqualTo(String value) {
            addCriterion("test2 >=", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2LessThan(String value) {
            addCriterion("test2 <", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2LessThanOrEqualTo(String value) {
            addCriterion("test2 <=", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2Like(String value) {
            addCriterion("test2 like", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotLike(String value) {
            addCriterion("test2 not like", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2In(List<String> values) {
            addCriterion("test2 in", values, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotIn(List<String> values) {
            addCriterion("test2 not in", values, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2Between(String value1, String value2) {
            addCriterion("test2 between", value1, value2, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotBetween(String value1, String value2) {
            addCriterion("test2 not between", value1, value2, "test2");
            return (Criteria) this;
        }

        public Criteria andTest3IsNull() {
            addCriterion("test3 is null");
            return (Criteria) this;
        }

        public Criteria andTest3IsNotNull() {
            addCriterion("test3 is not null");
            return (Criteria) this;
        }

        public Criteria andTest3EqualTo(String value) {
            addCriterion("test3 =", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotEqualTo(String value) {
            addCriterion("test3 <>", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3GreaterThan(String value) {
            addCriterion("test3 >", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3GreaterThanOrEqualTo(String value) {
            addCriterion("test3 >=", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3LessThan(String value) {
            addCriterion("test3 <", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3LessThanOrEqualTo(String value) {
            addCriterion("test3 <=", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3Like(String value) {
            addCriterion("test3 like", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotLike(String value) {
            addCriterion("test3 not like", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3In(List<String> values) {
            addCriterion("test3 in", values, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotIn(List<String> values) {
            addCriterion("test3 not in", values, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3Between(String value1, String value2) {
            addCriterion("test3 between", value1, value2, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotBetween(String value1, String value2) {
            addCriterion("test3 not between", value1, value2, "test3");
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