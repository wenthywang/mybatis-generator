package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class TFenshuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFenshuExample() {
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

        public Criteria andFenshuIdIsNull() {
            addCriterion("fenshu_id is null");
            return (Criteria) this;
        }

        public Criteria andFenshuIdIsNotNull() {
            addCriterion("fenshu_id is not null");
            return (Criteria) this;
        }

        public Criteria andFenshuIdEqualTo(Integer value) {
            addCriterion("fenshu_id =", value, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdNotEqualTo(Integer value) {
            addCriterion("fenshu_id <>", value, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdGreaterThan(Integer value) {
            addCriterion("fenshu_id >", value, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fenshu_id >=", value, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdLessThan(Integer value) {
            addCriterion("fenshu_id <", value, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdLessThanOrEqualTo(Integer value) {
            addCriterion("fenshu_id <=", value, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdIn(List<Integer> values) {
            addCriterion("fenshu_id in", values, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdNotIn(List<Integer> values) {
            addCriterion("fenshu_id not in", values, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_id between", value1, value2, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_id not between", value1, value2, "fenshuId");
            return (Criteria) this;
        }

        public Criteria andShitiIdIsNull() {
            addCriterion("shiti_id is null");
            return (Criteria) this;
        }

        public Criteria andShitiIdIsNotNull() {
            addCriterion("shiti_id is not null");
            return (Criteria) this;
        }

        public Criteria andShitiIdEqualTo(Integer value) {
            addCriterion("shiti_id =", value, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdNotEqualTo(Integer value) {
            addCriterion("shiti_id <>", value, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdGreaterThan(Integer value) {
            addCriterion("shiti_id >", value, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shiti_id >=", value, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdLessThan(Integer value) {
            addCriterion("shiti_id <", value, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdLessThanOrEqualTo(Integer value) {
            addCriterion("shiti_id <=", value, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdIn(List<Integer> values) {
            addCriterion("shiti_id in", values, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdNotIn(List<Integer> values) {
            addCriterion("shiti_id not in", values, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdBetween(Integer value1, Integer value2) {
            addCriterion("shiti_id between", value1, value2, "shitiId");
            return (Criteria) this;
        }

        public Criteria andShitiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shiti_id not between", value1, value2, "shitiId");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andFenshuIsNull() {
            addCriterion("fenshu is null");
            return (Criteria) this;
        }

        public Criteria andFenshuIsNotNull() {
            addCriterion("fenshu is not null");
            return (Criteria) this;
        }

        public Criteria andFenshuEqualTo(Integer value) {
            addCriterion("fenshu =", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuNotEqualTo(Integer value) {
            addCriterion("fenshu <>", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuGreaterThan(Integer value) {
            addCriterion("fenshu >", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("fenshu >=", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuLessThan(Integer value) {
            addCriterion("fenshu <", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuLessThanOrEqualTo(Integer value) {
            addCriterion("fenshu <=", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuIn(List<Integer> values) {
            addCriterion("fenshu in", values, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuNotIn(List<Integer> values) {
            addCriterion("fenshu not in", values, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuBetween(Integer value1, Integer value2) {
            addCriterion("fenshu between", value1, value2, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("fenshu not between", value1, value2, "fenshu");
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