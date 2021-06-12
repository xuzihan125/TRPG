package com.trpg.version1.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class CharactExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public CharactExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
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

        public Criteria andCharacteridIsNull() {
            addCriterion("characterId is null");
            return (Criteria) this;
        }

        public Criteria andCharacteridIsNotNull() {
            addCriterion("characterId is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteridEqualTo(Integer value) {
            addCriterion("characterId =", value, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridNotEqualTo(Integer value) {
            addCriterion("characterId <>", value, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridGreaterThan(Integer value) {
            addCriterion("characterId >", value, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("characterId >=", value, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridLessThan(Integer value) {
            addCriterion("characterId <", value, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridLessThanOrEqualTo(Integer value) {
            addCriterion("characterId <=", value, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridIn(List<Integer> values) {
            addCriterion("characterId in", values, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridNotIn(List<Integer> values) {
            addCriterion("characterId not in", values, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridBetween(Integer value1, Integer value2) {
            addCriterion("characterId between", value1, value2, "characterid");
            return (Criteria) this;
        }

        public Criteria andCharacteridNotBetween(Integer value1, Integer value2) {
            addCriterion("characterId not between", value1, value2, "characterid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollIsNull() {
            addCriterion("isElligibleToEnroll is null");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollIsNotNull() {
            addCriterion("isElligibleToEnroll is not null");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollEqualTo(String value) {
            addCriterion("isElligibleToEnroll =", value, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollNotEqualTo(String value) {
            addCriterion("isElligibleToEnroll <>", value, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollGreaterThan(String value) {
            addCriterion("isElligibleToEnroll >", value, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollGreaterThanOrEqualTo(String value) {
            addCriterion("isElligibleToEnroll >=", value, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollLessThan(String value) {
            addCriterion("isElligibleToEnroll <", value, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollLessThanOrEqualTo(String value) {
            addCriterion("isElligibleToEnroll <=", value, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollLike(String value) {
            addCriterion("isElligibleToEnroll like", value, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollNotLike(String value) {
            addCriterion("isElligibleToEnroll not like", value, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollIn(List<String> values) {
            addCriterion("isElligibleToEnroll in", values, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollNotIn(List<String> values) {
            addCriterion("isElligibleToEnroll not in", values, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollBetween(String value1, String value2) {
            addCriterion("isElligibleToEnroll between", value1, value2, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andIselligibletoenrollNotBetween(String value1, String value2) {
            addCriterion("isElligibleToEnroll not between", value1, value2, "iselligibletoenroll");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenIsNull() {
            addCriterion("getSeminarsTaken is null");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenIsNotNull() {
            addCriterion("getSeminarsTaken is not null");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenEqualTo(String value) {
            addCriterion("getSeminarsTaken =", value, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenNotEqualTo(String value) {
            addCriterion("getSeminarsTaken <>", value, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenGreaterThan(String value) {
            addCriterion("getSeminarsTaken >", value, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenGreaterThanOrEqualTo(String value) {
            addCriterion("getSeminarsTaken >=", value, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenLessThan(String value) {
            addCriterion("getSeminarsTaken <", value, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenLessThanOrEqualTo(String value) {
            addCriterion("getSeminarsTaken <=", value, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenLike(String value) {
            addCriterion("getSeminarsTaken like", value, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenNotLike(String value) {
            addCriterion("getSeminarsTaken not like", value, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenIn(List<String> values) {
            addCriterion("getSeminarsTaken in", values, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenNotIn(List<String> values) {
            addCriterion("getSeminarsTaken not in", values, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenBetween(String value1, String value2) {
            addCriterion("getSeminarsTaken between", value1, value2, "getseminarstaken");
            return (Criteria) this;
        }

        public Criteria andGetseminarstakenNotBetween(String value1, String value2) {
            addCriterion("getSeminarsTaken not between", value1, value2, "getseminarstaken");
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table charact
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 13 02:53:06 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table charact
     *
     * @mbg.generated Sun Jun 13 02:53:06 CST 2021
     */
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