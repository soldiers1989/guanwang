package com.web.business.model.volga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApartmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ApartmentInfoExample() {
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

        public Criteria andHasLiftIsNull() {
            addCriterion("has_lift is null");
            return (Criteria) this;
        }

        public Criteria andHasLiftIsNotNull() {
            addCriterion("has_lift is not null");
            return (Criteria) this;
        }

        public Criteria andHasLiftEqualTo(Boolean value) {
            addCriterion("has_lift =", value, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftNotEqualTo(Boolean value) {
            addCriterion("has_lift <>", value, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftGreaterThan(Boolean value) {
            addCriterion("has_lift >", value, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_lift >=", value, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftLessThan(Boolean value) {
            addCriterion("has_lift <", value, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftLessThanOrEqualTo(Boolean value) {
            addCriterion("has_lift <=", value, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftIn(List<Boolean> values) {
            addCriterion("has_lift in", values, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftNotIn(List<Boolean> values) {
            addCriterion("has_lift not in", values, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftBetween(Boolean value1, Boolean value2) {
            addCriterion("has_lift between", value1, value2, "hasLift");
            return (Criteria) this;
        }

        public Criteria andHasLiftNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_lift not between", value1, value2, "hasLift");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNull() {
            addCriterion("store_phone is null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNotNull() {
            addCriterion("store_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneEqualTo(String value) {
            addCriterion("store_phone =", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotEqualTo(String value) {
            addCriterion("store_phone <>", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThan(String value) {
            addCriterion("store_phone >", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("store_phone >=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThan(String value) {
            addCriterion("store_phone <", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThanOrEqualTo(String value) {
            addCriterion("store_phone <=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLike(String value) {
            addCriterion("store_phone like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotLike(String value) {
            addCriterion("store_phone not like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIn(List<String> values) {
            addCriterion("store_phone in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotIn(List<String> values) {
            addCriterion("store_phone not in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneBetween(String value1, String value2) {
            addCriterion("store_phone between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotBetween(String value1, String value2) {
            addCriterion("store_phone not between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andRentRequireIsNull() {
            addCriterion("rent_require is null");
            return (Criteria) this;
        }

        public Criteria andRentRequireIsNotNull() {
            addCriterion("rent_require is not null");
            return (Criteria) this;
        }

        public Criteria andRentRequireEqualTo(String value) {
            addCriterion("rent_require =", value, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireNotEqualTo(String value) {
            addCriterion("rent_require <>", value, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireGreaterThan(String value) {
            addCriterion("rent_require >", value, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireGreaterThanOrEqualTo(String value) {
            addCriterion("rent_require >=", value, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireLessThan(String value) {
            addCriterion("rent_require <", value, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireLessThanOrEqualTo(String value) {
            addCriterion("rent_require <=", value, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireLike(String value) {
            addCriterion("rent_require like", value, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireNotLike(String value) {
            addCriterion("rent_require not like", value, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireIn(List<String> values) {
            addCriterion("rent_require in", values, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireNotIn(List<String> values) {
            addCriterion("rent_require not in", values, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireBetween(String value1, String value2) {
            addCriterion("rent_require between", value1, value2, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRentRequireNotBetween(String value1, String value2) {
            addCriterion("rent_require not between", value1, value2, "rentRequire");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsIsNull() {
            addCriterion("room_assets is null");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsIsNotNull() {
            addCriterion("room_assets is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsEqualTo(String value) {
            addCriterion("room_assets =", value, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsNotEqualTo(String value) {
            addCriterion("room_assets <>", value, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsGreaterThan(String value) {
            addCriterion("room_assets >", value, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsGreaterThanOrEqualTo(String value) {
            addCriterion("room_assets >=", value, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsLessThan(String value) {
            addCriterion("room_assets <", value, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsLessThanOrEqualTo(String value) {
            addCriterion("room_assets <=", value, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsLike(String value) {
            addCriterion("room_assets like", value, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsNotLike(String value) {
            addCriterion("room_assets not like", value, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsIn(List<String> values) {
            addCriterion("room_assets in", values, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsNotIn(List<String> values) {
            addCriterion("room_assets not in", values, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsBetween(String value1, String value2) {
            addCriterion("room_assets between", value1, value2, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andRoomAssetsNotBetween(String value1, String value2) {
            addCriterion("room_assets not between", value1, value2, "roomAssets");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesIsNull() {
            addCriterion("apartment_pictures is null");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesIsNotNull() {
            addCriterion("apartment_pictures is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesEqualTo(String value) {
            addCriterion("apartment_pictures =", value, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesNotEqualTo(String value) {
            addCriterion("apartment_pictures <>", value, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesGreaterThan(String value) {
            addCriterion("apartment_pictures >", value, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesGreaterThanOrEqualTo(String value) {
            addCriterion("apartment_pictures >=", value, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesLessThan(String value) {
            addCriterion("apartment_pictures <", value, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesLessThanOrEqualTo(String value) {
            addCriterion("apartment_pictures <=", value, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesLike(String value) {
            addCriterion("apartment_pictures like", value, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesNotLike(String value) {
            addCriterion("apartment_pictures not like", value, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesIn(List<String> values) {
            addCriterion("apartment_pictures in", values, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesNotIn(List<String> values) {
            addCriterion("apartment_pictures not in", values, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesBetween(String value1, String value2) {
            addCriterion("apartment_pictures between", value1, value2, "apartmentPictures");
            return (Criteria) this;
        }

        public Criteria andApartmentPicturesNotBetween(String value1, String value2) {
            addCriterion("apartment_pictures not between", value1, value2, "apartmentPictures");
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