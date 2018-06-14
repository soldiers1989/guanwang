package com.web.business.model.caspain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomAssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public RoomAssetsExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
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

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNull() {
            addCriterion("deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNotNull() {
            addCriterion("deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtEqualTo(Date value) {
            addCriterion("deleted_at =", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotEqualTo(Date value) {
            addCriterion("deleted_at <>", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThan(Date value) {
            addCriterion("deleted_at >", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("deleted_at >=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThan(Date value) {
            addCriterion("deleted_at <", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThanOrEqualTo(Date value) {
            addCriterion("deleted_at <=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIn(List<Date> values) {
            addCriterion("deleted_at in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotIn(List<Date> values) {
            addCriterion("deleted_at not in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtBetween(Date value1, Date value2) {
            addCriterion("deleted_at between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotBetween(Date value1, Date value2) {
            addCriterion("deleted_at not between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesIsNull() {
            addCriterion("washing_machines is null");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesIsNotNull() {
            addCriterion("washing_machines is not null");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesEqualTo(Boolean value) {
            addCriterion("washing_machines =", value, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesNotEqualTo(Boolean value) {
            addCriterion("washing_machines <>", value, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesGreaterThan(Boolean value) {
            addCriterion("washing_machines >", value, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("washing_machines >=", value, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesLessThan(Boolean value) {
            addCriterion("washing_machines <", value, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesLessThanOrEqualTo(Boolean value) {
            addCriterion("washing_machines <=", value, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesIn(List<Boolean> values) {
            addCriterion("washing_machines in", values, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesNotIn(List<Boolean> values) {
            addCriterion("washing_machines not in", values, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesBetween(Boolean value1, Boolean value2) {
            addCriterion("washing_machines between", value1, value2, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andWashingMachinesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("washing_machines not between", value1, value2, "washingMachines");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsIsNull() {
            addCriterion("air_conditionings is null");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsIsNotNull() {
            addCriterion("air_conditionings is not null");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsEqualTo(Boolean value) {
            addCriterion("air_conditionings =", value, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsNotEqualTo(Boolean value) {
            addCriterion("air_conditionings <>", value, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsGreaterThan(Boolean value) {
            addCriterion("air_conditionings >", value, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("air_conditionings >=", value, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsLessThan(Boolean value) {
            addCriterion("air_conditionings <", value, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsLessThanOrEqualTo(Boolean value) {
            addCriterion("air_conditionings <=", value, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsIn(List<Boolean> values) {
            addCriterion("air_conditionings in", values, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsNotIn(List<Boolean> values) {
            addCriterion("air_conditionings not in", values, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsBetween(Boolean value1, Boolean value2) {
            addCriterion("air_conditionings between", value1, value2, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andAirConditioningsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("air_conditionings not between", value1, value2, "airConditionings");
            return (Criteria) this;
        }

        public Criteria andTelevisionsIsNull() {
            addCriterion("televisions is null");
            return (Criteria) this;
        }

        public Criteria andTelevisionsIsNotNull() {
            addCriterion("televisions is not null");
            return (Criteria) this;
        }

        public Criteria andTelevisionsEqualTo(Boolean value) {
            addCriterion("televisions =", value, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsNotEqualTo(Boolean value) {
            addCriterion("televisions <>", value, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsGreaterThan(Boolean value) {
            addCriterion("televisions >", value, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("televisions >=", value, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsLessThan(Boolean value) {
            addCriterion("televisions <", value, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsLessThanOrEqualTo(Boolean value) {
            addCriterion("televisions <=", value, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsIn(List<Boolean> values) {
            addCriterion("televisions in", values, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsNotIn(List<Boolean> values) {
            addCriterion("televisions not in", values, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsBetween(Boolean value1, Boolean value2) {
            addCriterion("televisions between", value1, value2, "televisions");
            return (Criteria) this;
        }

        public Criteria andTelevisionsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("televisions not between", value1, value2, "televisions");
            return (Criteria) this;
        }

        public Criteria andFridgeIsNull() {
            addCriterion("fridge is null");
            return (Criteria) this;
        }

        public Criteria andFridgeIsNotNull() {
            addCriterion("fridge is not null");
            return (Criteria) this;
        }

        public Criteria andFridgeEqualTo(Boolean value) {
            addCriterion("fridge =", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeNotEqualTo(Boolean value) {
            addCriterion("fridge <>", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeGreaterThan(Boolean value) {
            addCriterion("fridge >", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fridge >=", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeLessThan(Boolean value) {
            addCriterion("fridge <", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeLessThanOrEqualTo(Boolean value) {
            addCriterion("fridge <=", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeIn(List<Boolean> values) {
            addCriterion("fridge in", values, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeNotIn(List<Boolean> values) {
            addCriterion("fridge not in", values, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeBetween(Boolean value1, Boolean value2) {
            addCriterion("fridge between", value1, value2, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fridge not between", value1, value2, "fridge");
            return (Criteria) this;
        }

        public Criteria andInternetIsNull() {
            addCriterion("internet is null");
            return (Criteria) this;
        }

        public Criteria andInternetIsNotNull() {
            addCriterion("internet is not null");
            return (Criteria) this;
        }

        public Criteria andInternetEqualTo(Boolean value) {
            addCriterion("internet =", value, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetNotEqualTo(Boolean value) {
            addCriterion("internet <>", value, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetGreaterThan(Boolean value) {
            addCriterion("internet >", value, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("internet >=", value, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetLessThan(Boolean value) {
            addCriterion("internet <", value, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetLessThanOrEqualTo(Boolean value) {
            addCriterion("internet <=", value, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetIn(List<Boolean> values) {
            addCriterion("internet in", values, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetNotIn(List<Boolean> values) {
            addCriterion("internet not in", values, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetBetween(Boolean value1, Boolean value2) {
            addCriterion("internet between", value1, value2, "internet");
            return (Criteria) this;
        }

        public Criteria andInternetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("internet not between", value1, value2, "internet");
            return (Criteria) this;
        }

        public Criteria andBalconiesIsNull() {
            addCriterion("balconies is null");
            return (Criteria) this;
        }

        public Criteria andBalconiesIsNotNull() {
            addCriterion("balconies is not null");
            return (Criteria) this;
        }

        public Criteria andBalconiesEqualTo(Boolean value) {
            addCriterion("balconies =", value, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesNotEqualTo(Boolean value) {
            addCriterion("balconies <>", value, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesGreaterThan(Boolean value) {
            addCriterion("balconies >", value, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("balconies >=", value, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesLessThan(Boolean value) {
            addCriterion("balconies <", value, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesLessThanOrEqualTo(Boolean value) {
            addCriterion("balconies <=", value, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesIn(List<Boolean> values) {
            addCriterion("balconies in", values, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesNotIn(List<Boolean> values) {
            addCriterion("balconies not in", values, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesBetween(Boolean value1, Boolean value2) {
            addCriterion("balconies between", value1, value2, "balconies");
            return (Criteria) this;
        }

        public Criteria andBalconiesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("balconies not between", value1, value2, "balconies");
            return (Criteria) this;
        }

        public Criteria andWindowsIsNull() {
            addCriterion("windows is null");
            return (Criteria) this;
        }

        public Criteria andWindowsIsNotNull() {
            addCriterion("windows is not null");
            return (Criteria) this;
        }

        public Criteria andWindowsEqualTo(Boolean value) {
            addCriterion("windows =", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsNotEqualTo(Boolean value) {
            addCriterion("windows <>", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsGreaterThan(Boolean value) {
            addCriterion("windows >", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("windows >=", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsLessThan(Boolean value) {
            addCriterion("windows <", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsLessThanOrEqualTo(Boolean value) {
            addCriterion("windows <=", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsIn(List<Boolean> values) {
            addCriterion("windows in", values, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsNotIn(List<Boolean> values) {
            addCriterion("windows not in", values, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsBetween(Boolean value1, Boolean value2) {
            addCriterion("windows between", value1, value2, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("windows not between", value1, value2, "windows");
            return (Criteria) this;
        }

        public Criteria andKitchensIsNull() {
            addCriterion("kitchens is null");
            return (Criteria) this;
        }

        public Criteria andKitchensIsNotNull() {
            addCriterion("kitchens is not null");
            return (Criteria) this;
        }

        public Criteria andKitchensEqualTo(Boolean value) {
            addCriterion("kitchens =", value, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensNotEqualTo(Boolean value) {
            addCriterion("kitchens <>", value, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensGreaterThan(Boolean value) {
            addCriterion("kitchens >", value, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensGreaterThanOrEqualTo(Boolean value) {
            addCriterion("kitchens >=", value, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensLessThan(Boolean value) {
            addCriterion("kitchens <", value, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensLessThanOrEqualTo(Boolean value) {
            addCriterion("kitchens <=", value, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensIn(List<Boolean> values) {
            addCriterion("kitchens in", values, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensNotIn(List<Boolean> values) {
            addCriterion("kitchens not in", values, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensBetween(Boolean value1, Boolean value2) {
            addCriterion("kitchens between", value1, value2, "kitchens");
            return (Criteria) this;
        }

        public Criteria andKitchensNotBetween(Boolean value1, Boolean value2) {
            addCriterion("kitchens not between", value1, value2, "kitchens");
            return (Criteria) this;
        }

        public Criteria andWashroomsIsNull() {
            addCriterion("washrooms is null");
            return (Criteria) this;
        }

        public Criteria andWashroomsIsNotNull() {
            addCriterion("washrooms is not null");
            return (Criteria) this;
        }

        public Criteria andWashroomsEqualTo(Boolean value) {
            addCriterion("washrooms =", value, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsNotEqualTo(Boolean value) {
            addCriterion("washrooms <>", value, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsGreaterThan(Boolean value) {
            addCriterion("washrooms >", value, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("washrooms >=", value, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsLessThan(Boolean value) {
            addCriterion("washrooms <", value, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsLessThanOrEqualTo(Boolean value) {
            addCriterion("washrooms <=", value, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsIn(List<Boolean> values) {
            addCriterion("washrooms in", values, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsNotIn(List<Boolean> values) {
            addCriterion("washrooms not in", values, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsBetween(Boolean value1, Boolean value2) {
            addCriterion("washrooms between", value1, value2, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWashroomsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("washrooms not between", value1, value2, "washrooms");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersIsNull() {
            addCriterion("water_heaters is null");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersIsNotNull() {
            addCriterion("water_heaters is not null");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersEqualTo(Boolean value) {
            addCriterion("water_heaters =", value, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersNotEqualTo(Boolean value) {
            addCriterion("water_heaters <>", value, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersGreaterThan(Boolean value) {
            addCriterion("water_heaters >", value, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersGreaterThanOrEqualTo(Boolean value) {
            addCriterion("water_heaters >=", value, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersLessThan(Boolean value) {
            addCriterion("water_heaters <", value, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersLessThanOrEqualTo(Boolean value) {
            addCriterion("water_heaters <=", value, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersIn(List<Boolean> values) {
            addCriterion("water_heaters in", values, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersNotIn(List<Boolean> values) {
            addCriterion("water_heaters not in", values, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersBetween(Boolean value1, Boolean value2) {
            addCriterion("water_heaters between", value1, value2, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWaterHeatersNotBetween(Boolean value1, Boolean value2) {
            addCriterion("water_heaters not between", value1, value2, "waterHeaters");
            return (Criteria) this;
        }

        public Criteria andWardrobesIsNull() {
            addCriterion("wardrobes is null");
            return (Criteria) this;
        }

        public Criteria andWardrobesIsNotNull() {
            addCriterion("wardrobes is not null");
            return (Criteria) this;
        }

        public Criteria andWardrobesEqualTo(Boolean value) {
            addCriterion("wardrobes =", value, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesNotEqualTo(Boolean value) {
            addCriterion("wardrobes <>", value, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesGreaterThan(Boolean value) {
            addCriterion("wardrobes >", value, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wardrobes >=", value, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesLessThan(Boolean value) {
            addCriterion("wardrobes <", value, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesLessThanOrEqualTo(Boolean value) {
            addCriterion("wardrobes <=", value, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesIn(List<Boolean> values) {
            addCriterion("wardrobes in", values, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesNotIn(List<Boolean> values) {
            addCriterion("wardrobes not in", values, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesBetween(Boolean value1, Boolean value2) {
            addCriterion("wardrobes between", value1, value2, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andWardrobesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wardrobes not between", value1, value2, "wardrobes");
            return (Criteria) this;
        }

        public Criteria andDesksIsNull() {
            addCriterion("desks is null");
            return (Criteria) this;
        }

        public Criteria andDesksIsNotNull() {
            addCriterion("desks is not null");
            return (Criteria) this;
        }

        public Criteria andDesksEqualTo(Boolean value) {
            addCriterion("desks =", value, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksNotEqualTo(Boolean value) {
            addCriterion("desks <>", value, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksGreaterThan(Boolean value) {
            addCriterion("desks >", value, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksGreaterThanOrEqualTo(Boolean value) {
            addCriterion("desks >=", value, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksLessThan(Boolean value) {
            addCriterion("desks <", value, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksLessThanOrEqualTo(Boolean value) {
            addCriterion("desks <=", value, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksIn(List<Boolean> values) {
            addCriterion("desks in", values, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksNotIn(List<Boolean> values) {
            addCriterion("desks not in", values, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksBetween(Boolean value1, Boolean value2) {
            addCriterion("desks between", value1, value2, "desks");
            return (Criteria) this;
        }

        public Criteria andDesksNotBetween(Boolean value1, Boolean value2) {
            addCriterion("desks not between", value1, value2, "desks");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIsNull() {
            addCriterion("created_by_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIsNotNull() {
            addCriterion("created_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdEqualTo(Integer value) {
            addCriterion("created_by_id =", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotEqualTo(Integer value) {
            addCriterion("created_by_id <>", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdGreaterThan(Integer value) {
            addCriterion("created_by_id >", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by_id >=", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdLessThan(Integer value) {
            addCriterion("created_by_id <", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdLessThanOrEqualTo(Integer value) {
            addCriterion("created_by_id <=", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIn(List<Integer> values) {
            addCriterion("created_by_id in", values, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotIn(List<Integer> values) {
            addCriterion("created_by_id not in", values, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdBetween(Integer value1, Integer value2) {
            addCriterion("created_by_id between", value1, value2, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by_id not between", value1, value2, "createdById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdIsNull() {
            addCriterion("deleted_by_id is null");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdIsNotNull() {
            addCriterion("deleted_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdEqualTo(Integer value) {
            addCriterion("deleted_by_id =", value, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdNotEqualTo(Integer value) {
            addCriterion("deleted_by_id <>", value, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdGreaterThan(Integer value) {
            addCriterion("deleted_by_id >", value, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted_by_id >=", value, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdLessThan(Integer value) {
            addCriterion("deleted_by_id <", value, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdLessThanOrEqualTo(Integer value) {
            addCriterion("deleted_by_id <=", value, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdIn(List<Integer> values) {
            addCriterion("deleted_by_id in", values, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdNotIn(List<Integer> values) {
            addCriterion("deleted_by_id not in", values, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdBetween(Integer value1, Integer value2) {
            addCriterion("deleted_by_id between", value1, value2, "deletedById");
            return (Criteria) this;
        }

        public Criteria andDeletedByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted_by_id not between", value1, value2, "deletedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdIsNull() {
            addCriterion("updated_by_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdIsNotNull() {
            addCriterion("updated_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdEqualTo(Integer value) {
            addCriterion("updated_by_id =", value, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdNotEqualTo(Integer value) {
            addCriterion("updated_by_id <>", value, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdGreaterThan(Integer value) {
            addCriterion("updated_by_id >", value, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_by_id >=", value, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdLessThan(Integer value) {
            addCriterion("updated_by_id <", value, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdLessThanOrEqualTo(Integer value) {
            addCriterion("updated_by_id <=", value, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdIn(List<Integer> values) {
            addCriterion("updated_by_id in", values, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdNotIn(List<Integer> values) {
            addCriterion("updated_by_id not in", values, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdBetween(Integer value1, Integer value2) {
            addCriterion("updated_by_id between", value1, value2, "updatedById");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_by_id not between", value1, value2, "updatedById");
            return (Criteria) this;
        }

        public Criteria andBedIsNull() {
            addCriterion("bed is null");
            return (Criteria) this;
        }

        public Criteria andBedIsNotNull() {
            addCriterion("bed is not null");
            return (Criteria) this;
        }

        public Criteria andBedEqualTo(Boolean value) {
            addCriterion("bed =", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotEqualTo(Boolean value) {
            addCriterion("bed <>", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThan(Boolean value) {
            addCriterion("bed >", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bed >=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThan(Boolean value) {
            addCriterion("bed <", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThanOrEqualTo(Boolean value) {
            addCriterion("bed <=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedIn(List<Boolean> values) {
            addCriterion("bed in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotIn(List<Boolean> values) {
            addCriterion("bed not in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedBetween(Boolean value1, Boolean value2) {
            addCriterion("bed between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bed not between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andGasIsNull() {
            addCriterion("gas is null");
            return (Criteria) this;
        }

        public Criteria andGasIsNotNull() {
            addCriterion("gas is not null");
            return (Criteria) this;
        }

        public Criteria andGasEqualTo(Boolean value) {
            addCriterion("gas =", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasNotEqualTo(Boolean value) {
            addCriterion("gas <>", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasGreaterThan(Boolean value) {
            addCriterion("gas >", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gas >=", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasLessThan(Boolean value) {
            addCriterion("gas <", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasLessThanOrEqualTo(Boolean value) {
            addCriterion("gas <=", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasIn(List<Boolean> values) {
            addCriterion("gas in", values, "gas");
            return (Criteria) this;
        }

        public Criteria andGasNotIn(List<Boolean> values) {
            addCriterion("gas not in", values, "gas");
            return (Criteria) this;
        }

        public Criteria andGasBetween(Boolean value1, Boolean value2) {
            addCriterion("gas between", value1, value2, "gas");
            return (Criteria) this;
        }

        public Criteria andGasNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gas not between", value1, value2, "gas");
            return (Criteria) this;
        }

        public Criteria andHeatIsNull() {
            addCriterion("heat is null");
            return (Criteria) this;
        }

        public Criteria andHeatIsNotNull() {
            addCriterion("heat is not null");
            return (Criteria) this;
        }

        public Criteria andHeatEqualTo(Boolean value) {
            addCriterion("heat =", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotEqualTo(Boolean value) {
            addCriterion("heat <>", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThan(Boolean value) {
            addCriterion("heat >", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("heat >=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThan(Boolean value) {
            addCriterion("heat <", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThanOrEqualTo(Boolean value) {
            addCriterion("heat <=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatIn(List<Boolean> values) {
            addCriterion("heat in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotIn(List<Boolean> values) {
            addCriterion("heat not in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatBetween(Boolean value1, Boolean value2) {
            addCriterion("heat between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("heat not between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andInductionCookerIsNull() {
            addCriterion("induction_cooker is null");
            return (Criteria) this;
        }

        public Criteria andInductionCookerIsNotNull() {
            addCriterion("induction_cooker is not null");
            return (Criteria) this;
        }

        public Criteria andInductionCookerEqualTo(Boolean value) {
            addCriterion("induction_cooker =", value, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerNotEqualTo(Boolean value) {
            addCriterion("induction_cooker <>", value, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerGreaterThan(Boolean value) {
            addCriterion("induction_cooker >", value, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("induction_cooker >=", value, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerLessThan(Boolean value) {
            addCriterion("induction_cooker <", value, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerLessThanOrEqualTo(Boolean value) {
            addCriterion("induction_cooker <=", value, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerIn(List<Boolean> values) {
            addCriterion("induction_cooker in", values, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerNotIn(List<Boolean> values) {
            addCriterion("induction_cooker not in", values, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerBetween(Boolean value1, Boolean value2) {
            addCriterion("induction_cooker between", value1, value2, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andInductionCookerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("induction_cooker not between", value1, value2, "inductionCooker");
            return (Criteria) this;
        }

        public Criteria andMicrowaveIsNull() {
            addCriterion("microwave is null");
            return (Criteria) this;
        }

        public Criteria andMicrowaveIsNotNull() {
            addCriterion("microwave is not null");
            return (Criteria) this;
        }

        public Criteria andMicrowaveEqualTo(Boolean value) {
            addCriterion("microwave =", value, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveNotEqualTo(Boolean value) {
            addCriterion("microwave <>", value, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveGreaterThan(Boolean value) {
            addCriterion("microwave >", value, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("microwave >=", value, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveLessThan(Boolean value) {
            addCriterion("microwave <", value, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveLessThanOrEqualTo(Boolean value) {
            addCriterion("microwave <=", value, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveIn(List<Boolean> values) {
            addCriterion("microwave in", values, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveNotIn(List<Boolean> values) {
            addCriterion("microwave not in", values, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveBetween(Boolean value1, Boolean value2) {
            addCriterion("microwave between", value1, value2, "microwave");
            return (Criteria) this;
        }

        public Criteria andMicrowaveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("microwave not between", value1, value2, "microwave");
            return (Criteria) this;
        }

        public Criteria andOvenIsNull() {
            addCriterion("oven is null");
            return (Criteria) this;
        }

        public Criteria andOvenIsNotNull() {
            addCriterion("oven is not null");
            return (Criteria) this;
        }

        public Criteria andOvenEqualTo(Boolean value) {
            addCriterion("oven =", value, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenNotEqualTo(Boolean value) {
            addCriterion("oven <>", value, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenGreaterThan(Boolean value) {
            addCriterion("oven >", value, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("oven >=", value, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenLessThan(Boolean value) {
            addCriterion("oven <", value, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenLessThanOrEqualTo(Boolean value) {
            addCriterion("oven <=", value, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenIn(List<Boolean> values) {
            addCriterion("oven in", values, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenNotIn(List<Boolean> values) {
            addCriterion("oven not in", values, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenBetween(Boolean value1, Boolean value2) {
            addCriterion("oven between", value1, value2, "oven");
            return (Criteria) this;
        }

        public Criteria andOvenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("oven not between", value1, value2, "oven");
            return (Criteria) this;
        }

        public Criteria andSerAtmIsNull() {
            addCriterion("ser_atm is null");
            return (Criteria) this;
        }

        public Criteria andSerAtmIsNotNull() {
            addCriterion("ser_atm is not null");
            return (Criteria) this;
        }

        public Criteria andSerAtmEqualTo(Boolean value) {
            addCriterion("ser_atm =", value, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmNotEqualTo(Boolean value) {
            addCriterion("ser_atm <>", value, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmGreaterThan(Boolean value) {
            addCriterion("ser_atm >", value, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ser_atm >=", value, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmLessThan(Boolean value) {
            addCriterion("ser_atm <", value, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmLessThanOrEqualTo(Boolean value) {
            addCriterion("ser_atm <=", value, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmIn(List<Boolean> values) {
            addCriterion("ser_atm in", values, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmNotIn(List<Boolean> values) {
            addCriterion("ser_atm not in", values, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_atm between", value1, value2, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerAtmNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_atm not between", value1, value2, "serAtm");
            return (Criteria) this;
        }

        public Criteria andSerExpressIsNull() {
            addCriterion("ser_express is null");
            return (Criteria) this;
        }

        public Criteria andSerExpressIsNotNull() {
            addCriterion("ser_express is not null");
            return (Criteria) this;
        }

        public Criteria andSerExpressEqualTo(Boolean value) {
            addCriterion("ser_express =", value, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressNotEqualTo(Boolean value) {
            addCriterion("ser_express <>", value, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressGreaterThan(Boolean value) {
            addCriterion("ser_express >", value, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ser_express >=", value, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressLessThan(Boolean value) {
            addCriterion("ser_express <", value, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressLessThanOrEqualTo(Boolean value) {
            addCriterion("ser_express <=", value, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressIn(List<Boolean> values) {
            addCriterion("ser_express in", values, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressNotIn(List<Boolean> values) {
            addCriterion("ser_express not in", values, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_express between", value1, value2, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerExpressNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_express not between", value1, value2, "serExpress");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumIsNull() {
            addCriterion("ser_gymnasium is null");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumIsNotNull() {
            addCriterion("ser_gymnasium is not null");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumEqualTo(Boolean value) {
            addCriterion("ser_gymnasium =", value, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumNotEqualTo(Boolean value) {
            addCriterion("ser_gymnasium <>", value, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumGreaterThan(Boolean value) {
            addCriterion("ser_gymnasium >", value, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ser_gymnasium >=", value, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumLessThan(Boolean value) {
            addCriterion("ser_gymnasium <", value, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumLessThanOrEqualTo(Boolean value) {
            addCriterion("ser_gymnasium <=", value, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumIn(List<Boolean> values) {
            addCriterion("ser_gymnasium in", values, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumNotIn(List<Boolean> values) {
            addCriterion("ser_gymnasium not in", values, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_gymnasium between", value1, value2, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerGymnasiumNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_gymnasium not between", value1, value2, "serGymnasium");
            return (Criteria) this;
        }

        public Criteria andSerMarketIsNull() {
            addCriterion("ser_market is null");
            return (Criteria) this;
        }

        public Criteria andSerMarketIsNotNull() {
            addCriterion("ser_market is not null");
            return (Criteria) this;
        }

        public Criteria andSerMarketEqualTo(Boolean value) {
            addCriterion("ser_market =", value, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketNotEqualTo(Boolean value) {
            addCriterion("ser_market <>", value, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketGreaterThan(Boolean value) {
            addCriterion("ser_market >", value, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ser_market >=", value, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketLessThan(Boolean value) {
            addCriterion("ser_market <", value, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketLessThanOrEqualTo(Boolean value) {
            addCriterion("ser_market <=", value, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketIn(List<Boolean> values) {
            addCriterion("ser_market in", values, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketNotIn(List<Boolean> values) {
            addCriterion("ser_market not in", values, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_market between", value1, value2, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerMarketNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_market not between", value1, value2, "serMarket");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningIsNull() {
            addCriterion("ser_room_cleaning is null");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningIsNotNull() {
            addCriterion("ser_room_cleaning is not null");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningEqualTo(Boolean value) {
            addCriterion("ser_room_cleaning =", value, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningNotEqualTo(Boolean value) {
            addCriterion("ser_room_cleaning <>", value, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningGreaterThan(Boolean value) {
            addCriterion("ser_room_cleaning >", value, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ser_room_cleaning >=", value, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningLessThan(Boolean value) {
            addCriterion("ser_room_cleaning <", value, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningLessThanOrEqualTo(Boolean value) {
            addCriterion("ser_room_cleaning <=", value, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningIn(List<Boolean> values) {
            addCriterion("ser_room_cleaning in", values, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningNotIn(List<Boolean> values) {
            addCriterion("ser_room_cleaning not in", values, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_room_cleaning between", value1, value2, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerRoomCleaningNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_room_cleaning not between", value1, value2, "serRoomCleaning");
            return (Criteria) this;
        }

        public Criteria andSerServicesIsNull() {
            addCriterion("ser_services is null");
            return (Criteria) this;
        }

        public Criteria andSerServicesIsNotNull() {
            addCriterion("ser_services is not null");
            return (Criteria) this;
        }

        public Criteria andSerServicesEqualTo(Boolean value) {
            addCriterion("ser_services =", value, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesNotEqualTo(Boolean value) {
            addCriterion("ser_services <>", value, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesGreaterThan(Boolean value) {
            addCriterion("ser_services >", value, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ser_services >=", value, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesLessThan(Boolean value) {
            addCriterion("ser_services <", value, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesLessThanOrEqualTo(Boolean value) {
            addCriterion("ser_services <=", value, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesIn(List<Boolean> values) {
            addCriterion("ser_services in", values, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesNotIn(List<Boolean> values) {
            addCriterion("ser_services not in", values, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_services between", value1, value2, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerServicesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_services not between", value1, value2, "serServices");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockIsNull() {
            addCriterion("ser_smart_lock is null");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockIsNotNull() {
            addCriterion("ser_smart_lock is not null");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockEqualTo(Boolean value) {
            addCriterion("ser_smart_lock =", value, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockNotEqualTo(Boolean value) {
            addCriterion("ser_smart_lock <>", value, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockGreaterThan(Boolean value) {
            addCriterion("ser_smart_lock >", value, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ser_smart_lock >=", value, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockLessThan(Boolean value) {
            addCriterion("ser_smart_lock <", value, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockLessThanOrEqualTo(Boolean value) {
            addCriterion("ser_smart_lock <=", value, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockIn(List<Boolean> values) {
            addCriterion("ser_smart_lock in", values, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockNotIn(List<Boolean> values) {
            addCriterion("ser_smart_lock not in", values, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_smart_lock between", value1, value2, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSerSmartLockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ser_smart_lock not between", value1, value2, "serSmartLock");
            return (Criteria) this;
        }

        public Criteria andSofaIsNull() {
            addCriterion("sofa is null");
            return (Criteria) this;
        }

        public Criteria andSofaIsNotNull() {
            addCriterion("sofa is not null");
            return (Criteria) this;
        }

        public Criteria andSofaEqualTo(Boolean value) {
            addCriterion("sofa =", value, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaNotEqualTo(Boolean value) {
            addCriterion("sofa <>", value, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaGreaterThan(Boolean value) {
            addCriterion("sofa >", value, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sofa >=", value, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaLessThan(Boolean value) {
            addCriterion("sofa <", value, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaLessThanOrEqualTo(Boolean value) {
            addCriterion("sofa <=", value, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaIn(List<Boolean> values) {
            addCriterion("sofa in", values, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaNotIn(List<Boolean> values) {
            addCriterion("sofa not in", values, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaBetween(Boolean value1, Boolean value2) {
            addCriterion("sofa between", value1, value2, "sofa");
            return (Criteria) this;
        }

        public Criteria andSofaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sofa not between", value1, value2, "sofa");
            return (Criteria) this;
        }

        public Criteria andTagBalconyIsNull() {
            addCriterion("tag_balcony is null");
            return (Criteria) this;
        }

        public Criteria andTagBalconyIsNotNull() {
            addCriterion("tag_balcony is not null");
            return (Criteria) this;
        }

        public Criteria andTagBalconyEqualTo(Boolean value) {
            addCriterion("tag_balcony =", value, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyNotEqualTo(Boolean value) {
            addCriterion("tag_balcony <>", value, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyGreaterThan(Boolean value) {
            addCriterion("tag_balcony >", value, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tag_balcony >=", value, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyLessThan(Boolean value) {
            addCriterion("tag_balcony <", value, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyLessThanOrEqualTo(Boolean value) {
            addCriterion("tag_balcony <=", value, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyIn(List<Boolean> values) {
            addCriterion("tag_balcony in", values, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyNotIn(List<Boolean> values) {
            addCriterion("tag_balcony not in", values, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_balcony between", value1, value2, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagBalconyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_balcony not between", value1, value2, "tagBalcony");
            return (Criteria) this;
        }

        public Criteria andTagKitchenIsNull() {
            addCriterion("tag_kitchen is null");
            return (Criteria) this;
        }

        public Criteria andTagKitchenIsNotNull() {
            addCriterion("tag_kitchen is not null");
            return (Criteria) this;
        }

        public Criteria andTagKitchenEqualTo(Boolean value) {
            addCriterion("tag_kitchen =", value, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenNotEqualTo(Boolean value) {
            addCriterion("tag_kitchen <>", value, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenGreaterThan(Boolean value) {
            addCriterion("tag_kitchen >", value, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tag_kitchen >=", value, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenLessThan(Boolean value) {
            addCriterion("tag_kitchen <", value, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenLessThanOrEqualTo(Boolean value) {
            addCriterion("tag_kitchen <=", value, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenIn(List<Boolean> values) {
            addCriterion("tag_kitchen in", values, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenNotIn(List<Boolean> values) {
            addCriterion("tag_kitchen not in", values, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_kitchen between", value1, value2, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagKitchenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_kitchen not between", value1, value2, "tagKitchen");
            return (Criteria) this;
        }

        public Criteria andTagMetroIsNull() {
            addCriterion("tag_metro is null");
            return (Criteria) this;
        }

        public Criteria andTagMetroIsNotNull() {
            addCriterion("tag_metro is not null");
            return (Criteria) this;
        }

        public Criteria andTagMetroEqualTo(Boolean value) {
            addCriterion("tag_metro =", value, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroNotEqualTo(Boolean value) {
            addCriterion("tag_metro <>", value, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroGreaterThan(Boolean value) {
            addCriterion("tag_metro >", value, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tag_metro >=", value, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroLessThan(Boolean value) {
            addCriterion("tag_metro <", value, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroLessThanOrEqualTo(Boolean value) {
            addCriterion("tag_metro <=", value, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroIn(List<Boolean> values) {
            addCriterion("tag_metro in", values, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroNotIn(List<Boolean> values) {
            addCriterion("tag_metro not in", values, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_metro between", value1, value2, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagMetroNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_metro not between", value1, value2, "tagMetro");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyIsNull() {
            addCriterion("tag_pub_balcony is null");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyIsNotNull() {
            addCriterion("tag_pub_balcony is not null");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyEqualTo(Boolean value) {
            addCriterion("tag_pub_balcony =", value, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyNotEqualTo(Boolean value) {
            addCriterion("tag_pub_balcony <>", value, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyGreaterThan(Boolean value) {
            addCriterion("tag_pub_balcony >", value, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tag_pub_balcony >=", value, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyLessThan(Boolean value) {
            addCriterion("tag_pub_balcony <", value, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyLessThanOrEqualTo(Boolean value) {
            addCriterion("tag_pub_balcony <=", value, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyIn(List<Boolean> values) {
            addCriterion("tag_pub_balcony in", values, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyNotIn(List<Boolean> values) {
            addCriterion("tag_pub_balcony not in", values, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_pub_balcony between", value1, value2, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubBalconyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_pub_balcony not between", value1, value2, "tagPubBalcony");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletIsNull() {
            addCriterion("tag_pub_toilet is null");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletIsNotNull() {
            addCriterion("tag_pub_toilet is not null");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletEqualTo(Boolean value) {
            addCriterion("tag_pub_toilet =", value, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletNotEqualTo(Boolean value) {
            addCriterion("tag_pub_toilet <>", value, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletGreaterThan(Boolean value) {
            addCriterion("tag_pub_toilet >", value, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tag_pub_toilet >=", value, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletLessThan(Boolean value) {
            addCriterion("tag_pub_toilet <", value, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletLessThanOrEqualTo(Boolean value) {
            addCriterion("tag_pub_toilet <=", value, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletIn(List<Boolean> values) {
            addCriterion("tag_pub_toilet in", values, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletNotIn(List<Boolean> values) {
            addCriterion("tag_pub_toilet not in", values, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_pub_toilet between", value1, value2, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagPubToiletNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_pub_toilet not between", value1, value2, "tagPubToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletIsNull() {
            addCriterion("tag_toilet is null");
            return (Criteria) this;
        }

        public Criteria andTagToiletIsNotNull() {
            addCriterion("tag_toilet is not null");
            return (Criteria) this;
        }

        public Criteria andTagToiletEqualTo(Boolean value) {
            addCriterion("tag_toilet =", value, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletNotEqualTo(Boolean value) {
            addCriterion("tag_toilet <>", value, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletGreaterThan(Boolean value) {
            addCriterion("tag_toilet >", value, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tag_toilet >=", value, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletLessThan(Boolean value) {
            addCriterion("tag_toilet <", value, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletLessThanOrEqualTo(Boolean value) {
            addCriterion("tag_toilet <=", value, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletIn(List<Boolean> values) {
            addCriterion("tag_toilet in", values, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletNotIn(List<Boolean> values) {
            addCriterion("tag_toilet not in", values, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_toilet between", value1, value2, "tagToilet");
            return (Criteria) this;
        }

        public Criteria andTagToiletNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tag_toilet not between", value1, value2, "tagToilet");
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