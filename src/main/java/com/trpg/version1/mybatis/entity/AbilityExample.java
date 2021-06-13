package com.trpg.version1.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class AbilityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public AbilityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
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
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
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

        public Criteria andSkillidIsNull() {
            addCriterion("skillId is null");
            return (Criteria) this;
        }

        public Criteria andSkillidIsNotNull() {
            addCriterion("skillId is not null");
            return (Criteria) this;
        }

        public Criteria andSkillidEqualTo(Integer value) {
            addCriterion("skillId =", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotEqualTo(Integer value) {
            addCriterion("skillId <>", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidGreaterThan(Integer value) {
            addCriterion("skillId >", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("skillId >=", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLessThan(Integer value) {
            addCriterion("skillId <", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLessThanOrEqualTo(Integer value) {
            addCriterion("skillId <=", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidIn(List<Integer> values) {
            addCriterion("skillId in", values, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotIn(List<Integer> values) {
            addCriterion("skillId not in", values, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidBetween(Integer value1, Integer value2) {
            addCriterion("skillId between", value1, value2, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotBetween(Integer value1, Integer value2) {
            addCriterion("skillId not between", value1, value2, "skillid");
            return (Criteria) this;
        }

        public Criteria andNumproIsNull() {
            addCriterion("numPro is null");
            return (Criteria) this;
        }

        public Criteria andNumproIsNotNull() {
            addCriterion("numPro is not null");
            return (Criteria) this;
        }

        public Criteria andNumproEqualTo(Integer value) {
            addCriterion("numPro =", value, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproNotEqualTo(Integer value) {
            addCriterion("numPro <>", value, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproGreaterThan(Integer value) {
            addCriterion("numPro >", value, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproGreaterThanOrEqualTo(Integer value) {
            addCriterion("numPro >=", value, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproLessThan(Integer value) {
            addCriterion("numPro <", value, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproLessThanOrEqualTo(Integer value) {
            addCriterion("numPro <=", value, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproIn(List<Integer> values) {
            addCriterion("numPro in", values, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproNotIn(List<Integer> values) {
            addCriterion("numPro not in", values, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproBetween(Integer value1, Integer value2) {
            addCriterion("numPro between", value1, value2, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumproNotBetween(Integer value1, Integer value2) {
            addCriterion("numPro not between", value1, value2, "numpro");
            return (Criteria) this;
        }

        public Criteria andNumhobbyIsNull() {
            addCriterion("numHobby is null");
            return (Criteria) this;
        }

        public Criteria andNumhobbyIsNotNull() {
            addCriterion("numHobby is not null");
            return (Criteria) this;
        }

        public Criteria andNumhobbyEqualTo(Integer value) {
            addCriterion("numHobby =", value, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyNotEqualTo(Integer value) {
            addCriterion("numHobby <>", value, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyGreaterThan(Integer value) {
            addCriterion("numHobby >", value, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("numHobby >=", value, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyLessThan(Integer value) {
            addCriterion("numHobby <", value, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyLessThanOrEqualTo(Integer value) {
            addCriterion("numHobby <=", value, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyIn(List<Integer> values) {
            addCriterion("numHobby in", values, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyNotIn(List<Integer> values) {
            addCriterion("numHobby not in", values, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyBetween(Integer value1, Integer value2) {
            addCriterion("numHobby between", value1, value2, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumhobbyNotBetween(Integer value1, Integer value2) {
            addCriterion("numHobby not between", value1, value2, "numhobby");
            return (Criteria) this;
        }

        public Criteria andNumlearnIsNull() {
            addCriterion("numLearn is null");
            return (Criteria) this;
        }

        public Criteria andNumlearnIsNotNull() {
            addCriterion("numLearn is not null");
            return (Criteria) this;
        }

        public Criteria andNumlearnEqualTo(Integer value) {
            addCriterion("numLearn =", value, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnNotEqualTo(Integer value) {
            addCriterion("numLearn <>", value, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnGreaterThan(Integer value) {
            addCriterion("numLearn >", value, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnGreaterThanOrEqualTo(Integer value) {
            addCriterion("numLearn >=", value, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnLessThan(Integer value) {
            addCriterion("numLearn <", value, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnLessThanOrEqualTo(Integer value) {
            addCriterion("numLearn <=", value, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnIn(List<Integer> values) {
            addCriterion("numLearn in", values, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnNotIn(List<Integer> values) {
            addCriterion("numLearn not in", values, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnBetween(Integer value1, Integer value2) {
            addCriterion("numLearn between", value1, value2, "numlearn");
            return (Criteria) this;
        }

        public Criteria andNumlearnNotBetween(Integer value1, Integer value2) {
            addCriterion("numLearn not between", value1, value2, "numlearn");
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
     * This class corresponds to the database table ability
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 13 16:30:33 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 16:30:33 CST 2021
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