package com.web.business.model.volga;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public RoomContractExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIsNull() {
            addCriterion("actual_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIsNotNull() {
            addCriterion("actual_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("actual_end_time =", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("actual_end_time <>", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("actual_end_time >", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actual_end_time >=", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("actual_end_time <", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actual_end_time <=", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("actual_end_time in", values, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("actual_end_time not in", values, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actual_end_time between", value1, value2, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actual_end_time not between", value1, value2, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Double value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Double value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Double value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Double value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Double value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Double> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Double> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Double value1, Double value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Double value1, Double value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("pay_method like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("pay_method not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodFIsNull() {
            addCriterion("pay_method_f is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodFIsNotNull() {
            addCriterion("pay_method_f is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodFEqualTo(Integer value) {
            addCriterion("pay_method_f =", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFNotEqualTo(Integer value) {
            addCriterion("pay_method_f <>", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFGreaterThan(Integer value) {
            addCriterion("pay_method_f >", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method_f >=", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFLessThan(Integer value) {
            addCriterion("pay_method_f <", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method_f <=", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFIn(List<Integer> values) {
            addCriterion("pay_method_f in", values, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFNotIn(List<Integer> values) {
            addCriterion("pay_method_f not in", values, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFBetween(Integer value1, Integer value2) {
            addCriterion("pay_method_f between", value1, value2, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method_f not between", value1, value2, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodYIsNull() {
            addCriterion("pay_method_y is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodYIsNotNull() {
            addCriterion("pay_method_y is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodYEqualTo(Integer value) {
            addCriterion("pay_method_y =", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYNotEqualTo(Integer value) {
            addCriterion("pay_method_y <>", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYGreaterThan(Integer value) {
            addCriterion("pay_method_y >", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method_y >=", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYLessThan(Integer value) {
            addCriterion("pay_method_y <", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method_y <=", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYIn(List<Integer> values) {
            addCriterion("pay_method_y in", values, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYNotIn(List<Integer> values) {
            addCriterion("pay_method_y not in", values, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYBetween(Integer value1, Integer value2) {
            addCriterion("pay_method_y between", value1, value2, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method_y not between", value1, value2, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andFreeDaysIsNull() {
            addCriterion("free_days is null");
            return (Criteria) this;
        }

        public Criteria andFreeDaysIsNotNull() {
            addCriterion("free_days is not null");
            return (Criteria) this;
        }

        public Criteria andFreeDaysEqualTo(Short value) {
            addCriterion("free_days =", value, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysNotEqualTo(Short value) {
            addCriterion("free_days <>", value, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysGreaterThan(Short value) {
            addCriterion("free_days >", value, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("free_days >=", value, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysLessThan(Short value) {
            addCriterion("free_days <", value, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysLessThanOrEqualTo(Short value) {
            addCriterion("free_days <=", value, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysIn(List<Short> values) {
            addCriterion("free_days in", values, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysNotIn(List<Short> values) {
            addCriterion("free_days not in", values, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysBetween(Short value1, Short value2) {
            addCriterion("free_days between", value1, value2, "freeDays");
            return (Criteria) this;
        }

        public Criteria andFreeDaysNotBetween(Short value1, Short value2) {
            addCriterion("free_days not between", value1, value2, "freeDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysIsNull() {
            addCriterion("advanced_days is null");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysIsNotNull() {
            addCriterion("advanced_days is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysEqualTo(Short value) {
            addCriterion("advanced_days =", value, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysNotEqualTo(Short value) {
            addCriterion("advanced_days <>", value, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysGreaterThan(Short value) {
            addCriterion("advanced_days >", value, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("advanced_days >=", value, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysLessThan(Short value) {
            addCriterion("advanced_days <", value, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysLessThanOrEqualTo(Short value) {
            addCriterion("advanced_days <=", value, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysIn(List<Short> values) {
            addCriterion("advanced_days in", values, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysNotIn(List<Short> values) {
            addCriterion("advanced_days not in", values, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysBetween(Short value1, Short value2) {
            addCriterion("advanced_days between", value1, value2, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andAdvancedDaysNotBetween(Short value1, Short value2) {
            addCriterion("advanced_days not between", value1, value2, "advancedDays");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeIsNull() {
            addCriterion("customer_id_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeIsNotNull() {
            addCriterion("customer_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeEqualTo(String value) {
            addCriterion("customer_id_type =", value, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeNotEqualTo(String value) {
            addCriterion("customer_id_type <>", value, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeGreaterThan(String value) {
            addCriterion("customer_id_type >", value, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id_type >=", value, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeLessThan(String value) {
            addCriterion("customer_id_type <", value, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_id_type <=", value, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeLike(String value) {
            addCriterion("customer_id_type like", value, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeNotLike(String value) {
            addCriterion("customer_id_type not like", value, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeIn(List<String> values) {
            addCriterion("customer_id_type in", values, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeNotIn(List<String> values) {
            addCriterion("customer_id_type not in", values, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeBetween(String value1, String value2) {
            addCriterion("customer_id_type between", value1, value2, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdTypeNotBetween(String value1, String value2) {
            addCriterion("customer_id_type not between", value1, value2, "customerIdType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberIsNull() {
            addCriterion("customer_id_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberIsNotNull() {
            addCriterion("customer_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberEqualTo(String value) {
            addCriterion("customer_id_number =", value, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberNotEqualTo(String value) {
            addCriterion("customer_id_number <>", value, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberGreaterThan(String value) {
            addCriterion("customer_id_number >", value, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id_number >=", value, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberLessThan(String value) {
            addCriterion("customer_id_number <", value, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberLessThanOrEqualTo(String value) {
            addCriterion("customer_id_number <=", value, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberLike(String value) {
            addCriterion("customer_id_number like", value, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberNotLike(String value) {
            addCriterion("customer_id_number not like", value, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberIn(List<String> values) {
            addCriterion("customer_id_number in", values, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberNotIn(List<String> values) {
            addCriterion("customer_id_number not in", values, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberBetween(String value1, String value2) {
            addCriterion("customer_id_number between", value1, value2, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNumberNotBetween(String value1, String value2) {
            addCriterion("customer_id_number not between", value1, value2, "customerIdNumber");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRenewTimesIsNull() {
            addCriterion("renew_times is null");
            return (Criteria) this;
        }

        public Criteria andRenewTimesIsNotNull() {
            addCriterion("renew_times is not null");
            return (Criteria) this;
        }

        public Criteria andRenewTimesEqualTo(Short value) {
            addCriterion("renew_times =", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesNotEqualTo(Short value) {
            addCriterion("renew_times <>", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesGreaterThan(Short value) {
            addCriterion("renew_times >", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("renew_times >=", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesLessThan(Short value) {
            addCriterion("renew_times <", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesLessThanOrEqualTo(Short value) {
            addCriterion("renew_times <=", value, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesIn(List<Short> values) {
            addCriterion("renew_times in", values, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesNotIn(List<Short> values) {
            addCriterion("renew_times not in", values, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesBetween(Short value1, Short value2) {
            addCriterion("renew_times between", value1, value2, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andRenewTimesNotBetween(Short value1, Short value2) {
            addCriterion("renew_times not between", value1, value2, "renewTimes");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersIsNull() {
            addCriterion("gened_orders is null");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersIsNotNull() {
            addCriterion("gened_orders is not null");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersEqualTo(Boolean value) {
            addCriterion("gened_orders =", value, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersNotEqualTo(Boolean value) {
            addCriterion("gened_orders <>", value, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersGreaterThan(Boolean value) {
            addCriterion("gened_orders >", value, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gened_orders >=", value, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersLessThan(Boolean value) {
            addCriterion("gened_orders <", value, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersLessThanOrEqualTo(Boolean value) {
            addCriterion("gened_orders <=", value, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersIn(List<Boolean> values) {
            addCriterion("gened_orders in", values, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersNotIn(List<Boolean> values) {
            addCriterion("gened_orders not in", values, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersBetween(Boolean value1, Boolean value2) {
            addCriterion("gened_orders between", value1, value2, "genedOrders");
            return (Criteria) this;
        }

        public Criteria andGenedOrdersNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gened_orders not between", value1, value2, "genedOrders");
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateIsNull() {
            addCriterion("fixed_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateIsNotNull() {
            addCriterion("fixed_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateEqualTo(Short value) {
            addCriterion("fixed_pay_date =", value, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateNotEqualTo(Short value) {
            addCriterion("fixed_pay_date <>", value, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateGreaterThan(Short value) {
            addCriterion("fixed_pay_date >", value, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateGreaterThanOrEqualTo(Short value) {
            addCriterion("fixed_pay_date >=", value, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateLessThan(Short value) {
            addCriterion("fixed_pay_date <", value, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateLessThanOrEqualTo(Short value) {
            addCriterion("fixed_pay_date <=", value, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateIn(List<Short> values) {
            addCriterion("fixed_pay_date in", values, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateNotIn(List<Short> values) {
            addCriterion("fixed_pay_date not in", values, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateBetween(Short value1, Short value2) {
            addCriterion("fixed_pay_date between", value1, value2, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andFixedPayDateNotBetween(Short value1, Short value2) {
            addCriterion("fixed_pay_date not between", value1, value2, "fixedPayDate");
            return (Criteria) this;
        }

        public Criteria andRentPayWayIsNull() {
            addCriterion("rent_pay_way is null");
            return (Criteria) this;
        }

        public Criteria andRentPayWayIsNotNull() {
            addCriterion("rent_pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andRentPayWayEqualTo(String value) {
            addCriterion("rent_pay_way =", value, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayNotEqualTo(String value) {
            addCriterion("rent_pay_way <>", value, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayGreaterThan(String value) {
            addCriterion("rent_pay_way >", value, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("rent_pay_way >=", value, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayLessThan(String value) {
            addCriterion("rent_pay_way <", value, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayLessThanOrEqualTo(String value) {
            addCriterion("rent_pay_way <=", value, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayLike(String value) {
            addCriterion("rent_pay_way like", value, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayNotLike(String value) {
            addCriterion("rent_pay_way not like", value, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayIn(List<String> values) {
            addCriterion("rent_pay_way in", values, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayNotIn(List<String> values) {
            addCriterion("rent_pay_way not in", values, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayBetween(String value1, String value2) {
            addCriterion("rent_pay_way between", value1, value2, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andRentPayWayNotBetween(String value1, String value2) {
            addCriterion("rent_pay_way not between", value1, value2, "rentPayWay");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumIsNull() {
            addCriterion("installment_num is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumIsNotNull() {
            addCriterion("installment_num is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumEqualTo(Short value) {
            addCriterion("installment_num =", value, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumNotEqualTo(Short value) {
            addCriterion("installment_num <>", value, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumGreaterThan(Short value) {
            addCriterion("installment_num >", value, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumGreaterThanOrEqualTo(Short value) {
            addCriterion("installment_num >=", value, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumLessThan(Short value) {
            addCriterion("installment_num <", value, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumLessThanOrEqualTo(Short value) {
            addCriterion("installment_num <=", value, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumIn(List<Short> values) {
            addCriterion("installment_num in", values, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumNotIn(List<Short> values) {
            addCriterion("installment_num not in", values, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumBetween(Short value1, Short value2) {
            addCriterion("installment_num between", value1, value2, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andInstallmentNumNotBetween(Short value1, Short value2) {
            addCriterion("installment_num not between", value1, value2, "installmentNum");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentIsNull() {
            addCriterion("is_installment is null");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentIsNotNull() {
            addCriterion("is_installment is not null");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentEqualTo(Boolean value) {
            addCriterion("is_installment =", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentNotEqualTo(Boolean value) {
            addCriterion("is_installment <>", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentGreaterThan(Boolean value) {
            addCriterion("is_installment >", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_installment >=", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentLessThan(Boolean value) {
            addCriterion("is_installment <", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_installment <=", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentIn(List<Boolean> values) {
            addCriterion("is_installment in", values, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentNotIn(List<Boolean> values) {
            addCriterion("is_installment not in", values, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_installment between", value1, value2, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_installment not between", value1, value2, "isInstallment");
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

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(Double value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(Double value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(Double value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(Double value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(Double value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<Double> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<Double> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(Double value1, Double value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(Double value1, Double value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdIsNull() {
            addCriterion("loan_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdIsNotNull() {
            addCriterion("loan_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdEqualTo(String value) {
            addCriterion("loan_contract_id =", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdNotEqualTo(String value) {
            addCriterion("loan_contract_id <>", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdGreaterThan(String value) {
            addCriterion("loan_contract_id >", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("loan_contract_id >=", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdLessThan(String value) {
            addCriterion("loan_contract_id <", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdLessThanOrEqualTo(String value) {
            addCriterion("loan_contract_id <=", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdLike(String value) {
            addCriterion("loan_contract_id like", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdNotLike(String value) {
            addCriterion("loan_contract_id not like", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdIn(List<String> values) {
            addCriterion("loan_contract_id in", values, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdNotIn(List<String> values) {
            addCriterion("loan_contract_id not in", values, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdBetween(String value1, String value2) {
            addCriterion("loan_contract_id between", value1, value2, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdNotBetween(String value1, String value2) {
            addCriterion("loan_contract_id not between", value1, value2, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdIsNull() {
            addCriterion("scene_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdIsNotNull() {
            addCriterion("scene_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdEqualTo(String value) {
            addCriterion("scene_cust_id =", value, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdNotEqualTo(String value) {
            addCriterion("scene_cust_id <>", value, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdGreaterThan(String value) {
            addCriterion("scene_cust_id >", value, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("scene_cust_id >=", value, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdLessThan(String value) {
            addCriterion("scene_cust_id <", value, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdLessThanOrEqualTo(String value) {
            addCriterion("scene_cust_id <=", value, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdLike(String value) {
            addCriterion("scene_cust_id like", value, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdNotLike(String value) {
            addCriterion("scene_cust_id not like", value, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdIn(List<String> values) {
            addCriterion("scene_cust_id in", values, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdNotIn(List<String> values) {
            addCriterion("scene_cust_id not in", values, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdBetween(String value1, String value2) {
            addCriterion("scene_cust_id between", value1, value2, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andSceneCustIdNotBetween(String value1, String value2) {
            addCriterion("scene_cust_id not between", value1, value2, "sceneCustId");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeIsNull() {
            addCriterion("ignore_time is null");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeIsNotNull() {
            addCriterion("ignore_time is not null");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ignore_time =", value, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ignore_time <>", value, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ignore_time >", value, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ignore_time >=", value, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeLessThan(Date value) {
            addCriterionForJDBCDate("ignore_time <", value, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ignore_time <=", value, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ignore_time in", values, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ignore_time not in", values, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ignore_time between", value1, value2, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andIgnoreTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ignore_time not between", value1, value2, "ignoreTime");
            return (Criteria) this;
        }

        public Criteria andSignedIsNull() {
            addCriterion("signed is null");
            return (Criteria) this;
        }

        public Criteria andSignedIsNotNull() {
            addCriterion("signed is not null");
            return (Criteria) this;
        }

        public Criteria andSignedEqualTo(Short value) {
            addCriterion("signed =", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotEqualTo(Short value) {
            addCriterion("signed <>", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedGreaterThan(Short value) {
            addCriterion("signed >", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedGreaterThanOrEqualTo(Short value) {
            addCriterion("signed >=", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLessThan(Short value) {
            addCriterion("signed <", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLessThanOrEqualTo(Short value) {
            addCriterion("signed <=", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedIn(List<Short> values) {
            addCriterion("signed in", values, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotIn(List<Short> values) {
            addCriterion("signed not in", values, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedBetween(Short value1, Short value2) {
            addCriterion("signed between", value1, value2, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotBetween(Short value1, Short value2) {
            addCriterion("signed not between", value1, value2, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedAtIsNull() {
            addCriterion("signed_at is null");
            return (Criteria) this;
        }

        public Criteria andSignedAtIsNotNull() {
            addCriterion("signed_at is not null");
            return (Criteria) this;
        }

        public Criteria andSignedAtEqualTo(Date value) {
            addCriterionForJDBCDate("signed_at =", value, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("signed_at <>", value, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtGreaterThan(Date value) {
            addCriterionForJDBCDate("signed_at >", value, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("signed_at >=", value, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtLessThan(Date value) {
            addCriterionForJDBCDate("signed_at <", value, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("signed_at <=", value, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtIn(List<Date> values) {
            addCriterionForJDBCDate("signed_at in", values, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("signed_at not in", values, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("signed_at between", value1, value2, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("signed_at not between", value1, value2, "signedAt");
            return (Criteria) this;
        }

        public Criteria andSignedPictureIsNull() {
            addCriterion("signed_picture is null");
            return (Criteria) this;
        }

        public Criteria andSignedPictureIsNotNull() {
            addCriterion("signed_picture is not null");
            return (Criteria) this;
        }

        public Criteria andSignedPictureEqualTo(String value) {
            addCriterion("signed_picture =", value, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureNotEqualTo(String value) {
            addCriterion("signed_picture <>", value, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureGreaterThan(String value) {
            addCriterion("signed_picture >", value, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureGreaterThanOrEqualTo(String value) {
            addCriterion("signed_picture >=", value, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureLessThan(String value) {
            addCriterion("signed_picture <", value, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureLessThanOrEqualTo(String value) {
            addCriterion("signed_picture <=", value, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureLike(String value) {
            addCriterion("signed_picture like", value, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureNotLike(String value) {
            addCriterion("signed_picture not like", value, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureIn(List<String> values) {
            addCriterion("signed_picture in", values, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureNotIn(List<String> values) {
            addCriterion("signed_picture not in", values, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureBetween(String value1, String value2) {
            addCriterion("signed_picture between", value1, value2, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andSignedPictureNotBetween(String value1, String value2) {
            addCriterion("signed_picture not between", value1, value2, "signedPicture");
            return (Criteria) this;
        }

        public Criteria andOfflineNoIsNull() {
            addCriterion("offline_no is null");
            return (Criteria) this;
        }

        public Criteria andOfflineNoIsNotNull() {
            addCriterion("offline_no is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineNoEqualTo(String value) {
            addCriterion("offline_no =", value, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoNotEqualTo(String value) {
            addCriterion("offline_no <>", value, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoGreaterThan(String value) {
            addCriterion("offline_no >", value, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoGreaterThanOrEqualTo(String value) {
            addCriterion("offline_no >=", value, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoLessThan(String value) {
            addCriterion("offline_no <", value, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoLessThanOrEqualTo(String value) {
            addCriterion("offline_no <=", value, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoLike(String value) {
            addCriterion("offline_no like", value, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoNotLike(String value) {
            addCriterion("offline_no not like", value, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoIn(List<String> values) {
            addCriterion("offline_no in", values, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoNotIn(List<String> values) {
            addCriterion("offline_no not in", values, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoBetween(String value1, String value2) {
            addCriterion("offline_no between", value1, value2, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andOfflineNoNotBetween(String value1, String value2) {
            addCriterion("offline_no not between", value1, value2, "offlineNo");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdIsNull() {
            addCriterion("customer_res_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdIsNotNull() {
            addCriterion("customer_res_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdEqualTo(Integer value) {
            addCriterion("customer_res_id =", value, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdNotEqualTo(Integer value) {
            addCriterion("customer_res_id <>", value, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdGreaterThan(Integer value) {
            addCriterion("customer_res_id >", value, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_res_id >=", value, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdLessThan(Integer value) {
            addCriterion("customer_res_id <", value, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_res_id <=", value, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdIn(List<Integer> values) {
            addCriterion("customer_res_id in", values, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdNotIn(List<Integer> values) {
            addCriterion("customer_res_id not in", values, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_res_id between", value1, value2, "customerResId");
            return (Criteria) this;
        }

        public Criteria andCustomerResIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_res_id not between", value1, value2, "customerResId");
            return (Criteria) this;
        }

        public Criteria andContractSortIsNull() {
            addCriterion("contract_sort is null");
            return (Criteria) this;
        }

        public Criteria andContractSortIsNotNull() {
            addCriterion("contract_sort is not null");
            return (Criteria) this;
        }

        public Criteria andContractSortEqualTo(String value) {
            addCriterion("contract_sort =", value, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortNotEqualTo(String value) {
            addCriterion("contract_sort <>", value, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortGreaterThan(String value) {
            addCriterion("contract_sort >", value, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortGreaterThanOrEqualTo(String value) {
            addCriterion("contract_sort >=", value, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortLessThan(String value) {
            addCriterion("contract_sort <", value, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortLessThanOrEqualTo(String value) {
            addCriterion("contract_sort <=", value, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortLike(String value) {
            addCriterion("contract_sort like", value, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortNotLike(String value) {
            addCriterion("contract_sort not like", value, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortIn(List<String> values) {
            addCriterion("contract_sort in", values, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortNotIn(List<String> values) {
            addCriterion("contract_sort not in", values, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortBetween(String value1, String value2) {
            addCriterion("contract_sort between", value1, value2, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractSortNotBetween(String value1, String value2) {
            addCriterion("contract_sort not between", value1, value2, "contractSort");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("contract_type like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("contract_type not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeIsNull() {
            addCriterion("has_rentfree is null");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeIsNotNull() {
            addCriterion("has_rentfree is not null");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeEqualTo(Boolean value) {
            addCriterion("has_rentfree =", value, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeNotEqualTo(Boolean value) {
            addCriterion("has_rentfree <>", value, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeGreaterThan(Boolean value) {
            addCriterion("has_rentfree >", value, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_rentfree >=", value, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeLessThan(Boolean value) {
            addCriterion("has_rentfree <", value, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeLessThanOrEqualTo(Boolean value) {
            addCriterion("has_rentfree <=", value, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeIn(List<Boolean> values) {
            addCriterion("has_rentfree in", values, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeNotIn(List<Boolean> values) {
            addCriterion("has_rentfree not in", values, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeBetween(Boolean value1, Boolean value2) {
            addCriterion("has_rentfree between", value1, value2, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andHasRentfreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_rentfree not between", value1, value2, "hasRentfree");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderIsNull() {
            addCriterion("natural_month_order is null");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderIsNotNull() {
            addCriterion("natural_month_order is not null");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderEqualTo(Boolean value) {
            addCriterion("natural_month_order =", value, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderNotEqualTo(Boolean value) {
            addCriterion("natural_month_order <>", value, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderGreaterThan(Boolean value) {
            addCriterion("natural_month_order >", value, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("natural_month_order >=", value, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderLessThan(Boolean value) {
            addCriterion("natural_month_order <", value, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("natural_month_order <=", value, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderIn(List<Boolean> values) {
            addCriterion("natural_month_order in", values, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderNotIn(List<Boolean> values) {
            addCriterion("natural_month_order not in", values, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("natural_month_order between", value1, value2, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andNaturalMonthOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("natural_month_order not between", value1, value2, "naturalMonthOrder");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysIsNull() {
            addCriterion("rent_pay_days is null");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysIsNotNull() {
            addCriterion("rent_pay_days is not null");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysEqualTo(Short value) {
            addCriterion("rent_pay_days =", value, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysNotEqualTo(Short value) {
            addCriterion("rent_pay_days <>", value, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysGreaterThan(Short value) {
            addCriterion("rent_pay_days >", value, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("rent_pay_days >=", value, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysLessThan(Short value) {
            addCriterion("rent_pay_days <", value, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysLessThanOrEqualTo(Short value) {
            addCriterion("rent_pay_days <=", value, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysIn(List<Short> values) {
            addCriterion("rent_pay_days in", values, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysNotIn(List<Short> values) {
            addCriterion("rent_pay_days not in", values, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysBetween(Short value1, Short value2) {
            addCriterion("rent_pay_days between", value1, value2, "rentPayDays");
            return (Criteria) this;
        }

        public Criteria andRentPayDaysNotBetween(Short value1, Short value2) {
            addCriterion("rent_pay_days not between", value1, value2, "rentPayDays");
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