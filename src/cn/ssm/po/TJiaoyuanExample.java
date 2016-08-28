package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class TJiaoyuanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TJiaoyuanExample() {
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

        public Criteria andJiaojuanIdIsNull() {
            addCriterion("jiaojuan_id is null");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdIsNotNull() {
            addCriterion("jiaojuan_id is not null");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdEqualTo(Integer value) {
            addCriterion("jiaojuan_id =", value, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdNotEqualTo(Integer value) {
            addCriterion("jiaojuan_id <>", value, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdGreaterThan(Integer value) {
            addCriterion("jiaojuan_id >", value, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiaojuan_id >=", value, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdLessThan(Integer value) {
            addCriterion("jiaojuan_id <", value, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdLessThanOrEqualTo(Integer value) {
            addCriterion("jiaojuan_id <=", value, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdIn(List<Integer> values) {
            addCriterion("jiaojuan_id in", values, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdNotIn(List<Integer> values) {
            addCriterion("jiaojuan_id not in", values, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdBetween(Integer value1, Integer value2) {
            addCriterion("jiaojuan_id between", value1, value2, "jiaojuanId");
            return (Criteria) this;
        }

        public Criteria andJiaojuanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jiaojuan_id not between", value1, value2, "jiaojuanId");
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

        public Criteria andTimuIdIsNull() {
            addCriterion("timu_id is null");
            return (Criteria) this;
        }

        public Criteria andTimuIdIsNotNull() {
            addCriterion("timu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimuIdEqualTo(Integer value) {
            addCriterion("timu_id =", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotEqualTo(Integer value) {
            addCriterion("timu_id <>", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdGreaterThan(Integer value) {
            addCriterion("timu_id >", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("timu_id >=", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdLessThan(Integer value) {
            addCriterion("timu_id <", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdLessThanOrEqualTo(Integer value) {
            addCriterion("timu_id <=", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdIn(List<Integer> values) {
            addCriterion("timu_id in", values, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotIn(List<Integer> values) {
            addCriterion("timu_id not in", values, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdBetween(Integer value1, Integer value2) {
            addCriterion("timu_id between", value1, value2, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("timu_id not between", value1, value2, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuDaanIsNull() {
            addCriterion("timu_daan is null");
            return (Criteria) this;
        }

        public Criteria andTimuDaanIsNotNull() {
            addCriterion("timu_daan is not null");
            return (Criteria) this;
        }

        public Criteria andTimuDaanEqualTo(String value) {
            addCriterion("timu_daan =", value, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanNotEqualTo(String value) {
            addCriterion("timu_daan <>", value, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanGreaterThan(String value) {
            addCriterion("timu_daan >", value, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanGreaterThanOrEqualTo(String value) {
            addCriterion("timu_daan >=", value, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanLessThan(String value) {
            addCriterion("timu_daan <", value, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanLessThanOrEqualTo(String value) {
            addCriterion("timu_daan <=", value, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanLike(String value) {
            addCriterion("timu_daan like", value, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanNotLike(String value) {
            addCriterion("timu_daan not like", value, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanIn(List<String> values) {
            addCriterion("timu_daan in", values, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanNotIn(List<String> values) {
            addCriterion("timu_daan not in", values, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanBetween(String value1, String value2) {
            addCriterion("timu_daan between", value1, value2, "timuDaan");
            return (Criteria) this;
        }

        public Criteria andTimuDaanNotBetween(String value1, String value2) {
            addCriterion("timu_daan not between", value1, value2, "timuDaan");
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