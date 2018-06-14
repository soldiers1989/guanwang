package com.web.business.model.caspain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserProfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public UserProfileExample() {
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

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeIsNull() {
            addCriterion("is_franchisee is null");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeIsNotNull() {
            addCriterion("is_franchisee is not null");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeEqualTo(Boolean value) {
            addCriterion("is_franchisee =", value, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeNotEqualTo(Boolean value) {
            addCriterion("is_franchisee <>", value, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeGreaterThan(Boolean value) {
            addCriterion("is_franchisee >", value, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_franchisee >=", value, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeLessThan(Boolean value) {
            addCriterion("is_franchisee <", value, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_franchisee <=", value, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeIn(List<Boolean> values) {
            addCriterion("is_franchisee in", values, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeNotIn(List<Boolean> values) {
            addCriterion("is_franchisee not in", values, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_franchisee between", value1, value2, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFranchiseeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_franchisee not between", value1, value2, "isFranchisee");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNull() {
            addCriterion("is_first_login is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNotNull() {
            addCriterion("is_first_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginEqualTo(Boolean value) {
            addCriterion("is_first_login =", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotEqualTo(Boolean value) {
            addCriterion("is_first_login <>", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThan(Boolean value) {
            addCriterion("is_first_login >", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_first_login >=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThan(Boolean value) {
            addCriterion("is_first_login <", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThanOrEqualTo(Boolean value) {
            addCriterion("is_first_login <=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIn(List<Boolean> values) {
            addCriterion("is_first_login in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotIn(List<Boolean> values) {
            addCriterion("is_first_login not in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginBetween(Boolean value1, Boolean value2) {
            addCriterion("is_first_login between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_first_login not between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingIsNull() {
            addCriterion("credit_ceiling is null");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingIsNotNull() {
            addCriterion("credit_ceiling is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingEqualTo(Double value) {
            addCriterion("credit_ceiling =", value, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingNotEqualTo(Double value) {
            addCriterion("credit_ceiling <>", value, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingGreaterThan(Double value) {
            addCriterion("credit_ceiling >", value, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingGreaterThanOrEqualTo(Double value) {
            addCriterion("credit_ceiling >=", value, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingLessThan(Double value) {
            addCriterion("credit_ceiling <", value, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingLessThanOrEqualTo(Double value) {
            addCriterion("credit_ceiling <=", value, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingIn(List<Double> values) {
            addCriterion("credit_ceiling in", values, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingNotIn(List<Double> values) {
            addCriterion("credit_ceiling not in", values, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingBetween(Double value1, Double value2) {
            addCriterion("credit_ceiling between", value1, value2, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditCeilingNotBetween(Double value1, Double value2) {
            addCriterion("credit_ceiling not between", value1, value2, "creditCeiling");
            return (Criteria) this;
        }

        public Criteria andCreditUsedIsNull() {
            addCriterion("credit_used is null");
            return (Criteria) this;
        }

        public Criteria andCreditUsedIsNotNull() {
            addCriterion("credit_used is not null");
            return (Criteria) this;
        }

        public Criteria andCreditUsedEqualTo(Double value) {
            addCriterion("credit_used =", value, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedNotEqualTo(Double value) {
            addCriterion("credit_used <>", value, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedGreaterThan(Double value) {
            addCriterion("credit_used >", value, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedGreaterThanOrEqualTo(Double value) {
            addCriterion("credit_used >=", value, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedLessThan(Double value) {
            addCriterion("credit_used <", value, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedLessThanOrEqualTo(Double value) {
            addCriterion("credit_used <=", value, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedIn(List<Double> values) {
            addCriterion("credit_used in", values, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedNotIn(List<Double> values) {
            addCriterion("credit_used not in", values, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedBetween(Double value1, Double value2) {
            addCriterion("credit_used between", value1, value2, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andCreditUsedNotBetween(Double value1, Double value2) {
            addCriterion("credit_used not between", value1, value2, "creditUsed");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNull() {
            addCriterion("is_test is null");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNotNull() {
            addCriterion("is_test is not null");
            return (Criteria) this;
        }

        public Criteria andIsTestEqualTo(Boolean value) {
            addCriterion("is_test =", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotEqualTo(Boolean value) {
            addCriterion("is_test <>", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThan(Boolean value) {
            addCriterion("is_test >", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_test >=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThan(Boolean value) {
            addCriterion("is_test <", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThanOrEqualTo(Boolean value) {
            addCriterion("is_test <=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestIn(List<Boolean> values) {
            addCriterion("is_test in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotIn(List<Boolean> values) {
            addCriterion("is_test not in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestBetween(Boolean value1, Boolean value2) {
            addCriterion("is_test between", value1, value2, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_test not between", value1, value2, "isTest");
            return (Criteria) this;
        }

        public Criteria andTerminalIsNull() {
            addCriterion("terminal is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIsNotNull() {
            addCriterion("terminal is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalEqualTo(String value) {
            addCriterion("terminal =", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotEqualTo(String value) {
            addCriterion("terminal <>", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalGreaterThan(String value) {
            addCriterion("terminal >", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalGreaterThanOrEqualTo(String value) {
            addCriterion("terminal >=", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalLessThan(String value) {
            addCriterion("terminal <", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalLessThanOrEqualTo(String value) {
            addCriterion("terminal <=", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalLike(String value) {
            addCriterion("terminal like", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotLike(String value) {
            addCriterion("terminal not like", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalIn(List<String> values) {
            addCriterion("terminal in", values, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotIn(List<String> values) {
            addCriterion("terminal not in", values, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalBetween(String value1, String value2) {
            addCriterion("terminal between", value1, value2, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotBetween(String value1, String value2) {
            addCriterion("terminal not between", value1, value2, "terminal");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixIsNull() {
            addCriterion("company_postfix is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixIsNotNull() {
            addCriterion("company_postfix is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixEqualTo(String value) {
            addCriterion("company_postfix =", value, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixNotEqualTo(String value) {
            addCriterion("company_postfix <>", value, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixGreaterThan(String value) {
            addCriterion("company_postfix >", value, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixGreaterThanOrEqualTo(String value) {
            addCriterion("company_postfix >=", value, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixLessThan(String value) {
            addCriterion("company_postfix <", value, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixLessThanOrEqualTo(String value) {
            addCriterion("company_postfix <=", value, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixLike(String value) {
            addCriterion("company_postfix like", value, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixNotLike(String value) {
            addCriterion("company_postfix not like", value, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixIn(List<String> values) {
            addCriterion("company_postfix in", values, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixNotIn(List<String> values) {
            addCriterion("company_postfix not in", values, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixBetween(String value1, String value2) {
            addCriterion("company_postfix between", value1, value2, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andCompanyPostfixNotBetween(String value1, String value2) {
            addCriterion("company_postfix not between", value1, value2, "companyPostfix");
            return (Criteria) this;
        }

        public Criteria andUrlFromIsNull() {
            addCriterion("url_from is null");
            return (Criteria) this;
        }

        public Criteria andUrlFromIsNotNull() {
            addCriterion("url_from is not null");
            return (Criteria) this;
        }

        public Criteria andUrlFromEqualTo(String value) {
            addCriterion("url_from =", value, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromNotEqualTo(String value) {
            addCriterion("url_from <>", value, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromGreaterThan(String value) {
            addCriterion("url_from >", value, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromGreaterThanOrEqualTo(String value) {
            addCriterion("url_from >=", value, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromLessThan(String value) {
            addCriterion("url_from <", value, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromLessThanOrEqualTo(String value) {
            addCriterion("url_from <=", value, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromLike(String value) {
            addCriterion("url_from like", value, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromNotLike(String value) {
            addCriterion("url_from not like", value, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromIn(List<String> values) {
            addCriterion("url_from in", values, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromNotIn(List<String> values) {
            addCriterion("url_from not in", values, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromBetween(String value1, String value2) {
            addCriterion("url_from between", value1, value2, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andUrlFromNotBetween(String value1, String value2) {
            addCriterion("url_from not between", value1, value2, "urlFrom");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandIsNull() {
            addCriterion("company_brand is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandIsNotNull() {
            addCriterion("company_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandEqualTo(String value) {
            addCriterion("company_brand =", value, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandNotEqualTo(String value) {
            addCriterion("company_brand <>", value, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandGreaterThan(String value) {
            addCriterion("company_brand >", value, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandGreaterThanOrEqualTo(String value) {
            addCriterion("company_brand >=", value, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandLessThan(String value) {
            addCriterion("company_brand <", value, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandLessThanOrEqualTo(String value) {
            addCriterion("company_brand <=", value, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandLike(String value) {
            addCriterion("company_brand like", value, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandNotLike(String value) {
            addCriterion("company_brand not like", value, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandIn(List<String> values) {
            addCriterion("company_brand in", values, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandNotIn(List<String> values) {
            addCriterion("company_brand not in", values, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandBetween(String value1, String value2) {
            addCriterion("company_brand between", value1, value2, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andCompanyBrandNotBetween(String value1, String value2) {
            addCriterion("company_brand not between", value1, value2, "companyBrand");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andAvatarIdIsNull() {
            addCriterion("avatar_id is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIdIsNotNull() {
            addCriterion("avatar_id is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarIdEqualTo(Integer value) {
            addCriterion("avatar_id =", value, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdNotEqualTo(Integer value) {
            addCriterion("avatar_id <>", value, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdGreaterThan(Integer value) {
            addCriterion("avatar_id >", value, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("avatar_id >=", value, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdLessThan(Integer value) {
            addCriterion("avatar_id <", value, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdLessThanOrEqualTo(Integer value) {
            addCriterion("avatar_id <=", value, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdIn(List<Integer> values) {
            addCriterion("avatar_id in", values, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdNotIn(List<Integer> values) {
            addCriterion("avatar_id not in", values, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdBetween(Integer value1, Integer value2) {
            addCriterion("avatar_id between", value1, value2, "avatarId");
            return (Criteria) this;
        }

        public Criteria andAvatarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("avatar_id not between", value1, value2, "avatarId");
            return (Criteria) this;
        }

        public Criteria andBackupsAtIsNull() {
            addCriterion("backups_at is null");
            return (Criteria) this;
        }

        public Criteria andBackupsAtIsNotNull() {
            addCriterion("backups_at is not null");
            return (Criteria) this;
        }

        public Criteria andBackupsAtEqualTo(Date value) {
            addCriterion("backups_at =", value, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtNotEqualTo(Date value) {
            addCriterion("backups_at <>", value, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtGreaterThan(Date value) {
            addCriterion("backups_at >", value, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtGreaterThanOrEqualTo(Date value) {
            addCriterion("backups_at >=", value, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtLessThan(Date value) {
            addCriterion("backups_at <", value, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtLessThanOrEqualTo(Date value) {
            addCriterion("backups_at <=", value, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtIn(List<Date> values) {
            addCriterion("backups_at in", values, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtNotIn(List<Date> values) {
            addCriterion("backups_at not in", values, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtBetween(Date value1, Date value2) {
            addCriterion("backups_at between", value1, value2, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andBackupsAtNotBetween(Date value1, Date value2) {
            addCriterion("backups_at not between", value1, value2, "backupsAt");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIntervalIsNull() {
            addCriterion("interval is null");
            return (Criteria) this;
        }

        public Criteria andIntervalIsNotNull() {
            addCriterion("interval is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalEqualTo(Integer value) {
            addCriterion("interval =", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotEqualTo(Integer value) {
            addCriterion("interval <>", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalGreaterThan(Integer value) {
            addCriterion("interval >", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("interval >=", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalLessThan(Integer value) {
            addCriterion("interval <", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("interval <=", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalIn(List<Integer> values) {
            addCriterion("interval in", values, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotIn(List<Integer> values) {
            addCriterion("interval not in", values, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalBetween(Integer value1, Integer value2) {
            addCriterion("interval between", value1, value2, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("interval not between", value1, value2, "interval");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIsNull() {
            addCriterion("is_freeze is null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIsNotNull() {
            addCriterion("is_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeEqualTo(Boolean value) {
            addCriterion("is_freeze =", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotEqualTo(Boolean value) {
            addCriterion("is_freeze <>", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeGreaterThan(Boolean value) {
            addCriterion("is_freeze >", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_freeze >=", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeLessThan(Boolean value) {
            addCriterion("is_freeze <", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_freeze <=", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIn(List<Boolean> values) {
            addCriterion("is_freeze in", values, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotIn(List<Boolean> values) {
            addCriterion("is_freeze not in", values, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_freeze between", value1, value2, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_freeze not between", value1, value2, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("is_online is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("is_online is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Boolean value) {
            addCriterion("is_online =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Boolean value) {
            addCriterion("is_online <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Boolean value) {
            addCriterion("is_online >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_online >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Boolean value) {
            addCriterion("is_online <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Boolean value) {
            addCriterion("is_online <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Boolean> values) {
            addCriterion("is_online in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Boolean> values) {
            addCriterion("is_online not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Boolean value1, Boolean value2) {
            addCriterion("is_online between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_online not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Short value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Short value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Short value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Short value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Short value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Short> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Short> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Short value1, Short value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Short value1, Short value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIsChannelIsNull() {
            addCriterion("is_channel is null");
            return (Criteria) this;
        }

        public Criteria andIsChannelIsNotNull() {
            addCriterion("is_channel is not null");
            return (Criteria) this;
        }

        public Criteria andIsChannelEqualTo(Short value) {
            addCriterion("is_channel =", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelNotEqualTo(Short value) {
            addCriterion("is_channel <>", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelGreaterThan(Short value) {
            addCriterion("is_channel >", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelGreaterThanOrEqualTo(Short value) {
            addCriterion("is_channel >=", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelLessThan(Short value) {
            addCriterion("is_channel <", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelLessThanOrEqualTo(Short value) {
            addCriterion("is_channel <=", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelIn(List<Short> values) {
            addCriterion("is_channel in", values, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelNotIn(List<Short> values) {
            addCriterion("is_channel not in", values, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelBetween(Short value1, Short value2) {
            addCriterion("is_channel between", value1, value2, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelNotBetween(Short value1, Short value2) {
            addCriterion("is_channel not between", value1, value2, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsLoanIsNull() {
            addCriterion("is_loan is null");
            return (Criteria) this;
        }

        public Criteria andIsLoanIsNotNull() {
            addCriterion("is_loan is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoanEqualTo(Short value) {
            addCriterion("is_loan =", value, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanNotEqualTo(Short value) {
            addCriterion("is_loan <>", value, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanGreaterThan(Short value) {
            addCriterion("is_loan >", value, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanGreaterThanOrEqualTo(Short value) {
            addCriterion("is_loan >=", value, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanLessThan(Short value) {
            addCriterion("is_loan <", value, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanLessThanOrEqualTo(Short value) {
            addCriterion("is_loan <=", value, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanIn(List<Short> values) {
            addCriterion("is_loan in", values, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanNotIn(List<Short> values) {
            addCriterion("is_loan not in", values, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanBetween(Short value1, Short value2) {
            addCriterion("is_loan between", value1, value2, "isLoan");
            return (Criteria) this;
        }

        public Criteria andIsLoanNotBetween(Short value1, Short value2) {
            addCriterion("is_loan not between", value1, value2, "isLoan");
            return (Criteria) this;
        }

        public Criteria andReferralIsNull() {
            addCriterion("referral is null");
            return (Criteria) this;
        }

        public Criteria andReferralIsNotNull() {
            addCriterion("referral is not null");
            return (Criteria) this;
        }

        public Criteria andReferralEqualTo(String value) {
            addCriterion("referral =", value, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralNotEqualTo(String value) {
            addCriterion("referral <>", value, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralGreaterThan(String value) {
            addCriterion("referral >", value, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralGreaterThanOrEqualTo(String value) {
            addCriterion("referral >=", value, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralLessThan(String value) {
            addCriterion("referral <", value, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralLessThanOrEqualTo(String value) {
            addCriterion("referral <=", value, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralLike(String value) {
            addCriterion("referral like", value, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralNotLike(String value) {
            addCriterion("referral not like", value, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralIn(List<String> values) {
            addCriterion("referral in", values, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralNotIn(List<String> values) {
            addCriterion("referral not in", values, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralBetween(String value1, String value2) {
            addCriterion("referral between", value1, value2, "referral");
            return (Criteria) this;
        }

        public Criteria andReferralNotBetween(String value1, String value2) {
            addCriterion("referral not between", value1, value2, "referral");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVipActionIsNull() {
            addCriterion("vip_action is null");
            return (Criteria) this;
        }

        public Criteria andVipActionIsNotNull() {
            addCriterion("vip_action is not null");
            return (Criteria) this;
        }

        public Criteria andVipActionEqualTo(Integer value) {
            addCriterion("vip_action =", value, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionNotEqualTo(Integer value) {
            addCriterion("vip_action <>", value, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionGreaterThan(Integer value) {
            addCriterion("vip_action >", value, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_action >=", value, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionLessThan(Integer value) {
            addCriterion("vip_action <", value, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionLessThanOrEqualTo(Integer value) {
            addCriterion("vip_action <=", value, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionIn(List<Integer> values) {
            addCriterion("vip_action in", values, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionNotIn(List<Integer> values) {
            addCriterion("vip_action not in", values, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionBetween(Integer value1, Integer value2) {
            addCriterion("vip_action between", value1, value2, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipActionNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_action not between", value1, value2, "vipAction");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtIsNull() {
            addCriterion("vip_expire_at is null");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtIsNotNull() {
            addCriterion("vip_expire_at is not null");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtEqualTo(Date value) {
            addCriterionForJDBCDate("vip_expire_at =", value, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("vip_expire_at <>", value, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtGreaterThan(Date value) {
            addCriterionForJDBCDate("vip_expire_at >", value, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_expire_at >=", value, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtLessThan(Date value) {
            addCriterionForJDBCDate("vip_expire_at <", value, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_expire_at <=", value, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtIn(List<Date> values) {
            addCriterionForJDBCDate("vip_expire_at in", values, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("vip_expire_at not in", values, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_expire_at between", value1, value2, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipExpireAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_expire_at not between", value1, value2, "vipExpireAt");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("vip_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(Short value) {
            addCriterion("vip_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(Short value) {
            addCriterion("vip_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(Short value) {
            addCriterion("vip_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("vip_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(Short value) {
            addCriterion("vip_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(Short value) {
            addCriterion("vip_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<Short> values) {
            addCriterion("vip_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<Short> values) {
            addCriterion("vip_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(Short value1, Short value2) {
            addCriterion("vip_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(Short value1, Short value2) {
            addCriterion("vip_level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipStatusIsNull() {
            addCriterion("vip_status is null");
            return (Criteria) this;
        }

        public Criteria andVipStatusIsNotNull() {
            addCriterion("vip_status is not null");
            return (Criteria) this;
        }

        public Criteria andVipStatusEqualTo(Integer value) {
            addCriterion("vip_status =", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotEqualTo(Integer value) {
            addCriterion("vip_status <>", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusGreaterThan(Integer value) {
            addCriterion("vip_status >", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_status >=", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusLessThan(Integer value) {
            addCriterion("vip_status <", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusLessThanOrEqualTo(Integer value) {
            addCriterion("vip_status <=", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusIn(List<Integer> values) {
            addCriterion("vip_status in", values, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotIn(List<Integer> values) {
            addCriterion("vip_status not in", values, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusBetween(Integer value1, Integer value2) {
            addCriterion("vip_status between", value1, value2, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_status not between", value1, value2, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andOperateCityIsNull() {
            addCriterion("operate_city is null");
            return (Criteria) this;
        }

        public Criteria andOperateCityIsNotNull() {
            addCriterion("operate_city is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCityEqualTo(String value) {
            addCriterion("operate_city =", value, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityNotEqualTo(String value) {
            addCriterion("operate_city <>", value, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityGreaterThan(String value) {
            addCriterion("operate_city >", value, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityGreaterThanOrEqualTo(String value) {
            addCriterion("operate_city >=", value, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityLessThan(String value) {
            addCriterion("operate_city <", value, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityLessThanOrEqualTo(String value) {
            addCriterion("operate_city <=", value, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityLike(String value) {
            addCriterion("operate_city like", value, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityNotLike(String value) {
            addCriterion("operate_city not like", value, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityIn(List<String> values) {
            addCriterion("operate_city in", values, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityNotIn(List<String> values) {
            addCriterion("operate_city not in", values, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityBetween(String value1, String value2) {
            addCriterion("operate_city between", value1, value2, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateCityNotBetween(String value1, String value2) {
            addCriterion("operate_city not between", value1, value2, "operateCity");
            return (Criteria) this;
        }

        public Criteria andOperateModeIsNull() {
            addCriterion("operate_mode is null");
            return (Criteria) this;
        }

        public Criteria andOperateModeIsNotNull() {
            addCriterion("operate_mode is not null");
            return (Criteria) this;
        }

        public Criteria andOperateModeEqualTo(Short value) {
            addCriterion("operate_mode =", value, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeNotEqualTo(Short value) {
            addCriterion("operate_mode <>", value, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeGreaterThan(Short value) {
            addCriterion("operate_mode >", value, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeGreaterThanOrEqualTo(Short value) {
            addCriterion("operate_mode >=", value, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeLessThan(Short value) {
            addCriterion("operate_mode <", value, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeLessThanOrEqualTo(Short value) {
            addCriterion("operate_mode <=", value, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeIn(List<Short> values) {
            addCriterion("operate_mode in", values, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeNotIn(List<Short> values) {
            addCriterion("operate_mode not in", values, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeBetween(Short value1, Short value2) {
            addCriterion("operate_mode between", value1, value2, "operateMode");
            return (Criteria) this;
        }

        public Criteria andOperateModeNotBetween(Short value1, Short value2) {
            addCriterion("operate_mode not between", value1, value2, "operateMode");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeIsNull() {
            addCriterion("idauth_type is null");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeIsNotNull() {
            addCriterion("idauth_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeEqualTo(Short value) {
            addCriterion("idauth_type =", value, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeNotEqualTo(Short value) {
            addCriterion("idauth_type <>", value, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeGreaterThan(Short value) {
            addCriterion("idauth_type >", value, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("idauth_type >=", value, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeLessThan(Short value) {
            addCriterion("idauth_type <", value, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeLessThanOrEqualTo(Short value) {
            addCriterion("idauth_type <=", value, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeIn(List<Short> values) {
            addCriterion("idauth_type in", values, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeNotIn(List<Short> values) {
            addCriterion("idauth_type not in", values, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeBetween(Short value1, Short value2) {
            addCriterion("idauth_type between", value1, value2, "idauthType");
            return (Criteria) this;
        }

        public Criteria andIdauthTypeNotBetween(Short value1, Short value2) {
            addCriterion("idauth_type not between", value1, value2, "idauthType");
            return (Criteria) this;
        }

        public Criteria andShuidiVipIsNull() {
            addCriterion("shuidi_vip is null");
            return (Criteria) this;
        }

        public Criteria andShuidiVipIsNotNull() {
            addCriterion("shuidi_vip is not null");
            return (Criteria) this;
        }

        public Criteria andShuidiVipEqualTo(Short value) {
            addCriterion("shuidi_vip =", value, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipNotEqualTo(Short value) {
            addCriterion("shuidi_vip <>", value, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipGreaterThan(Short value) {
            addCriterion("shuidi_vip >", value, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipGreaterThanOrEqualTo(Short value) {
            addCriterion("shuidi_vip >=", value, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipLessThan(Short value) {
            addCriterion("shuidi_vip <", value, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipLessThanOrEqualTo(Short value) {
            addCriterion("shuidi_vip <=", value, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipIn(List<Short> values) {
            addCriterion("shuidi_vip in", values, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipNotIn(List<Short> values) {
            addCriterion("shuidi_vip not in", values, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipBetween(Short value1, Short value2) {
            addCriterion("shuidi_vip between", value1, value2, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andShuidiVipNotBetween(Short value1, Short value2) {
            addCriterion("shuidi_vip not between", value1, value2, "shuidiVip");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("is_effective is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("is_effective is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(String value) {
            addCriterion("is_effective =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(String value) {
            addCriterion("is_effective <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(String value) {
            addCriterion("is_effective >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("is_effective >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(String value) {
            addCriterion("is_effective <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(String value) {
            addCriterion("is_effective <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLike(String value) {
            addCriterion("is_effective like", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotLike(String value) {
            addCriterion("is_effective not like", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<String> values) {
            addCriterion("is_effective in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<String> values) {
            addCriterion("is_effective not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(String value1, String value2) {
            addCriterion("is_effective between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(String value1, String value2) {
            addCriterion("is_effective not between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
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