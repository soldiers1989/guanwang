package com.web.business.model.caspain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public RoomExample() {
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

        public Criteria andSpaceIsNull() {
            addCriterion("space is null");
            return (Criteria) this;
        }

        public Criteria andSpaceIsNotNull() {
            addCriterion("space is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceEqualTo(Double value) {
            addCriterion("space =", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotEqualTo(Double value) {
            addCriterion("space <>", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceGreaterThan(Double value) {
            addCriterion("space >", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceGreaterThanOrEqualTo(Double value) {
            addCriterion("space >=", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceLessThan(Double value) {
            addCriterion("space <", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceLessThanOrEqualTo(Double value) {
            addCriterion("space <=", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceIn(List<Double> values) {
            addCriterion("space in", values, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotIn(List<Double> values) {
            addCriterion("space not in", values, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceBetween(Double value1, Double value2) {
            addCriterion("space between", value1, value2, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotBetween(Double value1, Double value2) {
            addCriterion("space not between", value1, value2, "space");
            return (Criteria) this;
        }

        public Criteria andRentStatusIsNull() {
            addCriterion("rent_status is null");
            return (Criteria) this;
        }

        public Criteria andRentStatusIsNotNull() {
            addCriterion("rent_status is not null");
            return (Criteria) this;
        }

        public Criteria andRentStatusEqualTo(String value) {
            addCriterion("rent_status =", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotEqualTo(String value) {
            addCriterion("rent_status <>", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusGreaterThan(String value) {
            addCriterion("rent_status >", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("rent_status >=", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLessThan(String value) {
            addCriterion("rent_status <", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLessThanOrEqualTo(String value) {
            addCriterion("rent_status <=", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLike(String value) {
            addCriterion("rent_status like", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotLike(String value) {
            addCriterion("rent_status not like", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusIn(List<String> values) {
            addCriterion("rent_status in", values, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotIn(List<String> values) {
            addCriterion("rent_status not in", values, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusBetween(String value1, String value2) {
            addCriterion("rent_status between", value1, value2, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotBetween(String value1, String value2) {
            addCriterion("rent_status not between", value1, value2, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeIsNull() {
            addCriterion("lock_end_time is null");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeIsNotNull() {
            addCriterion("lock_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("lock_end_time =", value, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("lock_end_time <>", value, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("lock_end_time >", value, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lock_end_time >=", value, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("lock_end_time <", value, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lock_end_time <=", value, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("lock_end_time in", values, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("lock_end_time not in", values, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lock_end_time between", value1, value2, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andLockEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lock_end_time not between", value1, value2, "lockEndTime");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNull() {
            addCriterion("identifier is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("identifier is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("identifier =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("identifier <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("identifier >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("identifier >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("identifier <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("identifier <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("identifier like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("identifier not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("identifier in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("identifier not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("identifier between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("identifier not between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andEditedIsNull() {
            addCriterion("edited is null");
            return (Criteria) this;
        }

        public Criteria andEditedIsNotNull() {
            addCriterion("edited is not null");
            return (Criteria) this;
        }

        public Criteria andEditedEqualTo(Boolean value) {
            addCriterion("edited =", value, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedNotEqualTo(Boolean value) {
            addCriterion("edited <>", value, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedGreaterThan(Boolean value) {
            addCriterion("edited >", value, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("edited >=", value, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedLessThan(Boolean value) {
            addCriterion("edited <", value, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedLessThanOrEqualTo(Boolean value) {
            addCriterion("edited <=", value, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedIn(List<Boolean> values) {
            addCriterion("edited in", values, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedNotIn(List<Boolean> values) {
            addCriterion("edited not in", values, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedBetween(Boolean value1, Boolean value2) {
            addCriterion("edited between", value1, value2, "edited");
            return (Criteria) this;
        }

        public Criteria andEditedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("edited not between", value1, value2, "edited");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAssetsIdIsNull() {
            addCriterion("assets_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetsIdIsNotNull() {
            addCriterion("assets_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsIdEqualTo(Integer value) {
            addCriterion("assets_id =", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdNotEqualTo(Integer value) {
            addCriterion("assets_id <>", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdGreaterThan(Integer value) {
            addCriterion("assets_id >", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assets_id >=", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdLessThan(Integer value) {
            addCriterion("assets_id <", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdLessThanOrEqualTo(Integer value) {
            addCriterion("assets_id <=", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdIn(List<Integer> values) {
            addCriterion("assets_id in", values, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdNotIn(List<Integer> values) {
            addCriterion("assets_id not in", values, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdBetween(Integer value1, Integer value2) {
            addCriterion("assets_id between", value1, value2, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assets_id not between", value1, value2, "assetsId");
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

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
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

        public Criteria andTowardIsNull() {
            addCriterion("toward is null");
            return (Criteria) this;
        }

        public Criteria andTowardIsNotNull() {
            addCriterion("toward is not null");
            return (Criteria) this;
        }

        public Criteria andTowardEqualTo(String value) {
            addCriterion("toward =", value, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardNotEqualTo(String value) {
            addCriterion("toward <>", value, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardGreaterThan(String value) {
            addCriterion("toward >", value, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardGreaterThanOrEqualTo(String value) {
            addCriterion("toward >=", value, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardLessThan(String value) {
            addCriterion("toward <", value, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardLessThanOrEqualTo(String value) {
            addCriterion("toward <=", value, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardLike(String value) {
            addCriterion("toward like", value, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardNotLike(String value) {
            addCriterion("toward not like", value, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardIn(List<String> values) {
            addCriterion("toward in", values, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardNotIn(List<String> values) {
            addCriterion("toward not in", values, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardBetween(String value1, String value2) {
            addCriterion("toward between", value1, value2, "toward");
            return (Criteria) this;
        }

        public Criteria andTowardNotBetween(String value1, String value2) {
            addCriterion("toward not between", value1, value2, "toward");
            return (Criteria) this;
        }

        public Criteria andCanRentDateIsNull() {
            addCriterion("can_rent_date is null");
            return (Criteria) this;
        }

        public Criteria andCanRentDateIsNotNull() {
            addCriterion("can_rent_date is not null");
            return (Criteria) this;
        }

        public Criteria andCanRentDateEqualTo(Date value) {
            addCriterionForJDBCDate("can_rent_date =", value, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("can_rent_date <>", value, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("can_rent_date >", value, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("can_rent_date >=", value, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateLessThan(Date value) {
            addCriterionForJDBCDate("can_rent_date <", value, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("can_rent_date <=", value, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateIn(List<Date> values) {
            addCriterionForJDBCDate("can_rent_date in", values, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("can_rent_date not in", values, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("can_rent_date between", value1, value2, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andCanRentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("can_rent_date not between", value1, value2, "canRentDate");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(Short value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(Short value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(Short value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(Short value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(Short value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<Short> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<Short> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(Short value1, Short value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(Short value1, Short value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andChannelStatusIsNull() {
            addCriterion("channel_status is null");
            return (Criteria) this;
        }

        public Criteria andChannelStatusIsNotNull() {
            addCriterion("channel_status is not null");
            return (Criteria) this;
        }

        public Criteria andChannelStatusEqualTo(Short value) {
            addCriterion("channel_status =", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusNotEqualTo(Short value) {
            addCriterion("channel_status <>", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusGreaterThan(Short value) {
            addCriterion("channel_status >", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("channel_status >=", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusLessThan(Short value) {
            addCriterion("channel_status <", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusLessThanOrEqualTo(Short value) {
            addCriterion("channel_status <=", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusIn(List<Short> values) {
            addCriterion("channel_status in", values, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusNotIn(List<Short> values) {
            addCriterion("channel_status not in", values, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusBetween(Short value1, Short value2) {
            addCriterion("channel_status between", value1, value2, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusNotBetween(Short value1, Short value2) {
            addCriterion("channel_status not between", value1, value2, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNull() {
            addCriterion("decoration is null");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNotNull() {
            addCriterion("decoration is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationEqualTo(Short value) {
            addCriterion("decoration =", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotEqualTo(Short value) {
            addCriterion("decoration <>", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThan(Short value) {
            addCriterion("decoration >", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThanOrEqualTo(Short value) {
            addCriterion("decoration >=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThan(Short value) {
            addCriterion("decoration <", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThanOrEqualTo(Short value) {
            addCriterion("decoration <=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationIn(List<Short> values) {
            addCriterion("decoration in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotIn(List<Short> values) {
            addCriterion("decoration not in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationBetween(Short value1, Short value2) {
            addCriterion("decoration between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotBetween(Short value1, Short value2) {
            addCriterion("decoration not between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderIsNull() {
            addCriterion("pictures_order is null");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderIsNotNull() {
            addCriterion("pictures_order is not null");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderEqualTo(String value) {
            addCriterion("pictures_order =", value, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderNotEqualTo(String value) {
            addCriterion("pictures_order <>", value, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderGreaterThan(String value) {
            addCriterion("pictures_order >", value, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderGreaterThanOrEqualTo(String value) {
            addCriterion("pictures_order >=", value, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderLessThan(String value) {
            addCriterion("pictures_order <", value, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderLessThanOrEqualTo(String value) {
            addCriterion("pictures_order <=", value, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderLike(String value) {
            addCriterion("pictures_order like", value, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderNotLike(String value) {
            addCriterion("pictures_order not like", value, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderIn(List<String> values) {
            addCriterion("pictures_order in", values, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderNotIn(List<String> values) {
            addCriterion("pictures_order not in", values, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderBetween(String value1, String value2) {
            addCriterion("pictures_order between", value1, value2, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andPicturesOrderNotBetween(String value1, String value2) {
            addCriterion("pictures_order not between", value1, value2, "picturesOrder");
            return (Criteria) this;
        }

        public Criteria andSynchronousIsNull() {
            addCriterion("synchronous is null");
            return (Criteria) this;
        }

        public Criteria andSynchronousIsNotNull() {
            addCriterion("synchronous is not null");
            return (Criteria) this;
        }

        public Criteria andSynchronousEqualTo(Integer value) {
            addCriterion("synchronous =", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousNotEqualTo(Integer value) {
            addCriterion("synchronous <>", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousGreaterThan(Integer value) {
            addCriterion("synchronous >", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousGreaterThanOrEqualTo(Integer value) {
            addCriterion("synchronous >=", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousLessThan(Integer value) {
            addCriterion("synchronous <", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousLessThanOrEqualTo(Integer value) {
            addCriterion("synchronous <=", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousIn(List<Integer> values) {
            addCriterion("synchronous in", values, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousNotIn(List<Integer> values) {
            addCriterion("synchronous not in", values, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousBetween(Integer value1, Integer value2) {
            addCriterion("synchronous between", value1, value2, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousNotBetween(Integer value1, Integer value2) {
            addCriterion("synchronous not between", value1, value2, "synchronous");
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