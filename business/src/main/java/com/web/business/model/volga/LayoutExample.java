package com.web.business.model.volga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LayoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public LayoutExample() {
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

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Integer value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Integer value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Integer value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Integer value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Integer value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Integer> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Integer> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Integer value1, Integer value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByIsNull() {
            addCriterion("deleted_by is null");
            return (Criteria) this;
        }

        public Criteria andDeletedByIsNotNull() {
            addCriterion("deleted_by is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedByEqualTo(Integer value) {
            addCriterion("deleted_by =", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByNotEqualTo(Integer value) {
            addCriterion("deleted_by <>", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByGreaterThan(Integer value) {
            addCriterion("deleted_by >", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted_by >=", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByLessThan(Integer value) {
            addCriterion("deleted_by <", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByLessThanOrEqualTo(Integer value) {
            addCriterion("deleted_by <=", value, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByIn(List<Integer> values) {
            addCriterion("deleted_by in", values, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByNotIn(List<Integer> values) {
            addCriterion("deleted_by not in", values, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByBetween(Integer value1, Integer value2) {
            addCriterion("deleted_by between", value1, value2, "deletedBy");
            return (Criteria) this;
        }

        public Criteria andDeletedByNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted_by not between", value1, value2, "deletedBy");
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

        public Criteria andApartmentIdIsNull() {
            addCriterion("apartment_id is null");
            return (Criteria) this;
        }

        public Criteria andApartmentIdIsNotNull() {
            addCriterion("apartment_id is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentIdEqualTo(Integer value) {
            addCriterion("apartment_id =", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdNotEqualTo(Integer value) {
            addCriterion("apartment_id <>", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdGreaterThan(Integer value) {
            addCriterion("apartment_id >", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apartment_id >=", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdLessThan(Integer value) {
            addCriterion("apartment_id <", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("apartment_id <=", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdIn(List<Integer> values) {
            addCriterion("apartment_id in", values, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdNotIn(List<Integer> values) {
            addCriterion("apartment_id not in", values, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("apartment_id between", value1, value2, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apartment_id not between", value1, value2, "apartmentId");
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

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andMonthrentIsNull() {
            addCriterion("monthRent is null");
            return (Criteria) this;
        }

        public Criteria andMonthrentIsNotNull() {
            addCriterion("monthRent is not null");
            return (Criteria) this;
        }

        public Criteria andMonthrentEqualTo(Integer value) {
            addCriterion("monthRent =", value, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentNotEqualTo(Integer value) {
            addCriterion("monthRent <>", value, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentGreaterThan(Integer value) {
            addCriterion("monthRent >", value, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthRent >=", value, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentLessThan(Integer value) {
            addCriterion("monthRent <", value, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentLessThanOrEqualTo(Integer value) {
            addCriterion("monthRent <=", value, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentIn(List<Integer> values) {
            addCriterion("monthRent in", values, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentNotIn(List<Integer> values) {
            addCriterion("monthRent not in", values, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentBetween(Integer value1, Integer value2) {
            addCriterion("monthRent between", value1, value2, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMonthrentNotBetween(Integer value1, Integer value2) {
            addCriterion("monthRent not between", value1, value2, "monthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentIsNull() {
            addCriterion("maxMonthRent is null");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentIsNotNull() {
            addCriterion("maxMonthRent is not null");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentEqualTo(Integer value) {
            addCriterion("maxMonthRent =", value, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentNotEqualTo(Integer value) {
            addCriterion("maxMonthRent <>", value, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentGreaterThan(Integer value) {
            addCriterion("maxMonthRent >", value, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxMonthRent >=", value, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentLessThan(Integer value) {
            addCriterion("maxMonthRent <", value, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentLessThanOrEqualTo(Integer value) {
            addCriterion("maxMonthRent <=", value, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentIn(List<Integer> values) {
            addCriterion("maxMonthRent in", values, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentNotIn(List<Integer> values) {
            addCriterion("maxMonthRent not in", values, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentBetween(Integer value1, Integer value2) {
            addCriterion("maxMonthRent between", value1, value2, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andMaxmonthrentNotBetween(Integer value1, Integer value2) {
            addCriterion("maxMonthRent not between", value1, value2, "maxmonthrent");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeIsNull() {
            addCriterion("rentPayType is null");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeIsNotNull() {
            addCriterion("rentPayType is not null");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeEqualTo(String value) {
            addCriterion("rentPayType =", value, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeNotEqualTo(String value) {
            addCriterion("rentPayType <>", value, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeGreaterThan(String value) {
            addCriterion("rentPayType >", value, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("rentPayType >=", value, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeLessThan(String value) {
            addCriterion("rentPayType <", value, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeLessThanOrEqualTo(String value) {
            addCriterion("rentPayType <=", value, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeLike(String value) {
            addCriterion("rentPayType like", value, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeNotLike(String value) {
            addCriterion("rentPayType not like", value, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeIn(List<String> values) {
            addCriterion("rentPayType in", values, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeNotIn(List<String> values) {
            addCriterion("rentPayType not in", values, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeBetween(String value1, String value2) {
            addCriterion("rentPayType between", value1, value2, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andRentpaytypeNotBetween(String value1, String value2) {
            addCriterion("rentPayType not between", value1, value2, "rentpaytype");
            return (Criteria) this;
        }

        public Criteria andBedroomnumIsNull() {
            addCriterion("bedRoomNum is null");
            return (Criteria) this;
        }

        public Criteria andBedroomnumIsNotNull() {
            addCriterion("bedRoomNum is not null");
            return (Criteria) this;
        }

        public Criteria andBedroomnumEqualTo(Integer value) {
            addCriterion("bedRoomNum =", value, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumNotEqualTo(Integer value) {
            addCriterion("bedRoomNum <>", value, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumGreaterThan(Integer value) {
            addCriterion("bedRoomNum >", value, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedRoomNum >=", value, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumLessThan(Integer value) {
            addCriterion("bedRoomNum <", value, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumLessThanOrEqualTo(Integer value) {
            addCriterion("bedRoomNum <=", value, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumIn(List<Integer> values) {
            addCriterion("bedRoomNum in", values, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumNotIn(List<Integer> values) {
            addCriterion("bedRoomNum not in", values, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumBetween(Integer value1, Integer value2) {
            addCriterion("bedRoomNum between", value1, value2, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andBedroomnumNotBetween(Integer value1, Integer value2) {
            addCriterion("bedRoomNum not between", value1, value2, "bedroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumIsNull() {
            addCriterion("livingRoomNum is null");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumIsNotNull() {
            addCriterion("livingRoomNum is not null");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumEqualTo(Integer value) {
            addCriterion("livingRoomNum =", value, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumNotEqualTo(Integer value) {
            addCriterion("livingRoomNum <>", value, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumGreaterThan(Integer value) {
            addCriterion("livingRoomNum >", value, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("livingRoomNum >=", value, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumLessThan(Integer value) {
            addCriterion("livingRoomNum <", value, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumLessThanOrEqualTo(Integer value) {
            addCriterion("livingRoomNum <=", value, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumIn(List<Integer> values) {
            addCriterion("livingRoomNum in", values, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumNotIn(List<Integer> values) {
            addCriterion("livingRoomNum not in", values, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumBetween(Integer value1, Integer value2) {
            addCriterion("livingRoomNum between", value1, value2, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andLivingroomnumNotBetween(Integer value1, Integer value2) {
            addCriterion("livingRoomNum not between", value1, value2, "livingroomnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumIsNull() {
            addCriterion("toiletNum is null");
            return (Criteria) this;
        }

        public Criteria andToiletnumIsNotNull() {
            addCriterion("toiletNum is not null");
            return (Criteria) this;
        }

        public Criteria andToiletnumEqualTo(Integer value) {
            addCriterion("toiletNum =", value, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumNotEqualTo(Integer value) {
            addCriterion("toiletNum <>", value, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumGreaterThan(Integer value) {
            addCriterion("toiletNum >", value, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("toiletNum >=", value, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumLessThan(Integer value) {
            addCriterion("toiletNum <", value, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumLessThanOrEqualTo(Integer value) {
            addCriterion("toiletNum <=", value, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumIn(List<Integer> values) {
            addCriterion("toiletNum in", values, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumNotIn(List<Integer> values) {
            addCriterion("toiletNum not in", values, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumBetween(Integer value1, Integer value2) {
            addCriterion("toiletNum between", value1, value2, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andToiletnumNotBetween(Integer value1, Integer value2) {
            addCriterion("toiletNum not between", value1, value2, "toiletnum");
            return (Criteria) this;
        }

        public Criteria andFacetotypeIsNull() {
            addCriterion("faceToType is null");
            return (Criteria) this;
        }

        public Criteria andFacetotypeIsNotNull() {
            addCriterion("faceToType is not null");
            return (Criteria) this;
        }

        public Criteria andFacetotypeEqualTo(String value) {
            addCriterion("faceToType =", value, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeNotEqualTo(String value) {
            addCriterion("faceToType <>", value, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeGreaterThan(String value) {
            addCriterion("faceToType >", value, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeGreaterThanOrEqualTo(String value) {
            addCriterion("faceToType >=", value, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeLessThan(String value) {
            addCriterion("faceToType <", value, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeLessThanOrEqualTo(String value) {
            addCriterion("faceToType <=", value, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeLike(String value) {
            addCriterion("faceToType like", value, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeNotLike(String value) {
            addCriterion("faceToType not like", value, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeIn(List<String> values) {
            addCriterion("faceToType in", values, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeNotIn(List<String> values) {
            addCriterion("faceToType not in", values, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeBetween(String value1, String value2) {
            addCriterion("faceToType between", value1, value2, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFacetotypeNotBetween(String value1, String value2) {
            addCriterion("faceToType not between", value1, value2, "facetotype");
            return (Criteria) this;
        }

        public Criteria andFeaturetagIsNull() {
            addCriterion("featureTag is null");
            return (Criteria) this;
        }

        public Criteria andFeaturetagIsNotNull() {
            addCriterion("featureTag is not null");
            return (Criteria) this;
        }

        public Criteria andFeaturetagEqualTo(String value) {
            addCriterion("featureTag =", value, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagNotEqualTo(String value) {
            addCriterion("featureTag <>", value, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagGreaterThan(String value) {
            addCriterion("featureTag >", value, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagGreaterThanOrEqualTo(String value) {
            addCriterion("featureTag >=", value, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagLessThan(String value) {
            addCriterion("featureTag <", value, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagLessThanOrEqualTo(String value) {
            addCriterion("featureTag <=", value, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagLike(String value) {
            addCriterion("featureTag like", value, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagNotLike(String value) {
            addCriterion("featureTag not like", value, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagIn(List<String> values) {
            addCriterion("featureTag in", values, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagNotIn(List<String> values) {
            addCriterion("featureTag not in", values, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagBetween(String value1, String value2) {
            addCriterion("featureTag between", value1, value2, "featuretag");
            return (Criteria) this;
        }

        public Criteria andFeaturetagNotBetween(String value1, String value2) {
            addCriterion("featureTag not between", value1, value2, "featuretag");
            return (Criteria) this;
        }

        public Criteria andDetailpointIsNull() {
            addCriterion("detailPoint is null");
            return (Criteria) this;
        }

        public Criteria andDetailpointIsNotNull() {
            addCriterion("detailPoint is not null");
            return (Criteria) this;
        }

        public Criteria andDetailpointEqualTo(String value) {
            addCriterion("detailPoint =", value, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointNotEqualTo(String value) {
            addCriterion("detailPoint <>", value, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointGreaterThan(String value) {
            addCriterion("detailPoint >", value, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointGreaterThanOrEqualTo(String value) {
            addCriterion("detailPoint >=", value, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointLessThan(String value) {
            addCriterion("detailPoint <", value, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointLessThanOrEqualTo(String value) {
            addCriterion("detailPoint <=", value, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointLike(String value) {
            addCriterion("detailPoint like", value, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointNotLike(String value) {
            addCriterion("detailPoint not like", value, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointIn(List<String> values) {
            addCriterion("detailPoint in", values, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointNotIn(List<String> values) {
            addCriterion("detailPoint not in", values, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointBetween(String value1, String value2) {
            addCriterion("detailPoint between", value1, value2, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andDetailpointNotBetween(String value1, String value2) {
            addCriterion("detailPoint not between", value1, value2, "detailpoint");
            return (Criteria) this;
        }

        public Criteria andAgentphoneIsNull() {
            addCriterion("agentPhone is null");
            return (Criteria) this;
        }

        public Criteria andAgentphoneIsNotNull() {
            addCriterion("agentPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAgentphoneEqualTo(String value) {
            addCriterion("agentPhone =", value, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneNotEqualTo(String value) {
            addCriterion("agentPhone <>", value, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneGreaterThan(String value) {
            addCriterion("agentPhone >", value, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneGreaterThanOrEqualTo(String value) {
            addCriterion("agentPhone >=", value, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneLessThan(String value) {
            addCriterion("agentPhone <", value, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneLessThanOrEqualTo(String value) {
            addCriterion("agentPhone <=", value, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneLike(String value) {
            addCriterion("agentPhone like", value, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneNotLike(String value) {
            addCriterion("agentPhone not like", value, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneIn(List<String> values) {
            addCriterion("agentPhone in", values, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneNotIn(List<String> values) {
            addCriterion("agentPhone not in", values, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneBetween(String value1, String value2) {
            addCriterion("agentPhone between", value1, value2, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentphoneNotBetween(String value1, String value2) {
            addCriterion("agentPhone not between", value1, value2, "agentphone");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNull() {
            addCriterion("agentName is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNotNull() {
            addCriterion("agentName is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameEqualTo(String value) {
            addCriterion("agentName =", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotEqualTo(String value) {
            addCriterion("agentName <>", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThan(String value) {
            addCriterion("agentName >", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThanOrEqualTo(String value) {
            addCriterion("agentName >=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThan(String value) {
            addCriterion("agentName <", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThanOrEqualTo(String value) {
            addCriterion("agentName <=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLike(String value) {
            addCriterion("agentName like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotLike(String value) {
            addCriterion("agentName not like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameIn(List<String> values) {
            addCriterion("agentName in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotIn(List<String> values) {
            addCriterion("agentName not in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameBetween(String value1, String value2) {
            addCriterion("agentName between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotBetween(String value1, String value2) {
            addCriterion("agentName not between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIsNull() {
            addCriterion("room_area is null");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIsNotNull() {
            addCriterion("room_area is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAreaEqualTo(Integer value) {
            addCriterion("room_area =", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotEqualTo(Integer value) {
            addCriterion("room_area <>", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaGreaterThan(Integer value) {
            addCriterion("room_area >", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_area >=", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaLessThan(Integer value) {
            addCriterion("room_area <", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaLessThanOrEqualTo(Integer value) {
            addCriterion("room_area <=", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIn(List<Integer> values) {
            addCriterion("room_area in", values, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotIn(List<Integer> values) {
            addCriterion("room_area not in", values, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaBetween(Integer value1, Integer value2) {
            addCriterion("room_area between", value1, value2, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("room_area not between", value1, value2, "roomArea");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
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