package com.web.business.model.caspain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public HouseExample() {
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

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andBlockIsNull() {
            addCriterion("block is null");
            return (Criteria) this;
        }

        public Criteria andBlockIsNotNull() {
            addCriterion("block is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEqualTo(String value) {
            addCriterion("block =", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotEqualTo(String value) {
            addCriterion("block <>", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThan(String value) {
            addCriterion("block >", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThanOrEqualTo(String value) {
            addCriterion("block >=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThan(String value) {
            addCriterion("block <", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThanOrEqualTo(String value) {
            addCriterion("block <=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLike(String value) {
            addCriterion("block like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotLike(String value) {
            addCriterion("block not like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockIn(List<String> values) {
            addCriterion("block in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotIn(List<String> values) {
            addCriterion("block not in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockBetween(String value1, String value2) {
            addCriterion("block between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotBetween(String value1, String value2) {
            addCriterion("block not between", value1, value2, "block");
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

        public Criteria andBuildingNumIsNull() {
            addCriterion("building_num is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIsNotNull() {
            addCriterion("building_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumEqualTo(String value) {
            addCriterion("building_num =", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotEqualTo(String value) {
            addCriterion("building_num <>", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumGreaterThan(String value) {
            addCriterion("building_num >", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumGreaterThanOrEqualTo(String value) {
            addCriterion("building_num >=", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLessThan(String value) {
            addCriterion("building_num <", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLessThanOrEqualTo(String value) {
            addCriterion("building_num <=", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLike(String value) {
            addCriterion("building_num like", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotLike(String value) {
            addCriterion("building_num not like", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIn(List<String> values) {
            addCriterion("building_num in", values, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotIn(List<String> values) {
            addCriterion("building_num not in", values, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumBetween(String value1, String value2) {
            addCriterion("building_num between", value1, value2, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotBetween(String value1, String value2) {
            addCriterion("building_num not between", value1, value2, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumIsNull() {
            addCriterion("unit_num is null");
            return (Criteria) this;
        }

        public Criteria andUnitNumIsNotNull() {
            addCriterion("unit_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNumEqualTo(String value) {
            addCriterion("unit_num =", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumNotEqualTo(String value) {
            addCriterion("unit_num <>", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumGreaterThan(String value) {
            addCriterion("unit_num >", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumGreaterThanOrEqualTo(String value) {
            addCriterion("unit_num >=", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumLessThan(String value) {
            addCriterion("unit_num <", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumLessThanOrEqualTo(String value) {
            addCriterion("unit_num <=", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumLike(String value) {
            addCriterion("unit_num like", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumNotLike(String value) {
            addCriterion("unit_num not like", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumIn(List<String> values) {
            addCriterion("unit_num in", values, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumNotIn(List<String> values) {
            addCriterion("unit_num not in", values, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumBetween(String value1, String value2) {
            addCriterion("unit_num between", value1, value2, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumNotBetween(String value1, String value2) {
            addCriterion("unit_num not between", value1, value2, "unitNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNull() {
            addCriterion("floor_num is null");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNotNull() {
            addCriterion("floor_num is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNumEqualTo(String value) {
            addCriterion("floor_num =", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotEqualTo(String value) {
            addCriterion("floor_num <>", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThan(String value) {
            addCriterion("floor_num >", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThanOrEqualTo(String value) {
            addCriterion("floor_num >=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThan(String value) {
            addCriterion("floor_num <", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThanOrEqualTo(String value) {
            addCriterion("floor_num <=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLike(String value) {
            addCriterion("floor_num like", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotLike(String value) {
            addCriterion("floor_num not like", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumIn(List<String> values) {
            addCriterion("floor_num in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotIn(List<String> values) {
            addCriterion("floor_num not in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumBetween(String value1, String value2) {
            addCriterion("floor_num between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotBetween(String value1, String value2) {
            addCriterion("floor_num not between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumIsNull() {
            addCriterion("house_num is null");
            return (Criteria) this;
        }

        public Criteria andHouseNumIsNotNull() {
            addCriterion("house_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNumEqualTo(String value) {
            addCriterion("house_num =", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotEqualTo(String value) {
            addCriterion("house_num <>", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumGreaterThan(String value) {
            addCriterion("house_num >", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumGreaterThanOrEqualTo(String value) {
            addCriterion("house_num >=", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLessThan(String value) {
            addCriterion("house_num <", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLessThanOrEqualTo(String value) {
            addCriterion("house_num <=", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLike(String value) {
            addCriterion("house_num like", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotLike(String value) {
            addCriterion("house_num not like", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumIn(List<String> values) {
            addCriterion("house_num in", values, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotIn(List<String> values) {
            addCriterion("house_num not in", values, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumBetween(String value1, String value2) {
            addCriterion("house_num between", value1, value2, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotBetween(String value1, String value2) {
            addCriterion("house_num not between", value1, value2, "houseNum");
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

        public Criteria andPayMethodFEqualTo(Short value) {
            addCriterion("pay_method_f =", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFNotEqualTo(Short value) {
            addCriterion("pay_method_f <>", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFGreaterThan(Short value) {
            addCriterion("pay_method_f >", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_method_f >=", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFLessThan(Short value) {
            addCriterion("pay_method_f <", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFLessThanOrEqualTo(Short value) {
            addCriterion("pay_method_f <=", value, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFIn(List<Short> values) {
            addCriterion("pay_method_f in", values, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFNotIn(List<Short> values) {
            addCriterion("pay_method_f not in", values, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFBetween(Short value1, Short value2) {
            addCriterion("pay_method_f between", value1, value2, "payMethodF");
            return (Criteria) this;
        }

        public Criteria andPayMethodFNotBetween(Short value1, Short value2) {
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

        public Criteria andPayMethodYEqualTo(Short value) {
            addCriterion("pay_method_y =", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYNotEqualTo(Short value) {
            addCriterion("pay_method_y <>", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYGreaterThan(Short value) {
            addCriterion("pay_method_y >", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_method_y >=", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYLessThan(Short value) {
            addCriterion("pay_method_y <", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYLessThanOrEqualTo(Short value) {
            addCriterion("pay_method_y <=", value, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYIn(List<Short> values) {
            addCriterion("pay_method_y in", values, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYNotIn(List<Short> values) {
            addCriterion("pay_method_y not in", values, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYBetween(Short value1, Short value2) {
            addCriterion("pay_method_y between", value1, value2, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andPayMethodYNotBetween(Short value1, Short value2) {
            addCriterion("pay_method_y not between", value1, value2, "payMethodY");
            return (Criteria) this;
        }

        public Criteria andMonthRentalIsNull() {
            addCriterion("month_rental is null");
            return (Criteria) this;
        }

        public Criteria andMonthRentalIsNotNull() {
            addCriterion("month_rental is not null");
            return (Criteria) this;
        }

        public Criteria andMonthRentalEqualTo(Double value) {
            addCriterion("month_rental =", value, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalNotEqualTo(Double value) {
            addCriterion("month_rental <>", value, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalGreaterThan(Double value) {
            addCriterion("month_rental >", value, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalGreaterThanOrEqualTo(Double value) {
            addCriterion("month_rental >=", value, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalLessThan(Double value) {
            addCriterion("month_rental <", value, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalLessThanOrEqualTo(Double value) {
            addCriterion("month_rental <=", value, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalIn(List<Double> values) {
            addCriterion("month_rental in", values, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalNotIn(List<Double> values) {
            addCriterion("month_rental not in", values, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalBetween(Double value1, Double value2) {
            addCriterion("month_rental between", value1, value2, "monthRental");
            return (Criteria) this;
        }

        public Criteria andMonthRentalNotBetween(Double value1, Double value2) {
            addCriterion("month_rental not between", value1, value2, "monthRental");
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

        public Criteria andIsWholeIsNull() {
            addCriterion("is_whole is null");
            return (Criteria) this;
        }

        public Criteria andIsWholeIsNotNull() {
            addCriterion("is_whole is not null");
            return (Criteria) this;
        }

        public Criteria andIsWholeEqualTo(Boolean value) {
            addCriterion("is_whole =", value, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeNotEqualTo(Boolean value) {
            addCriterion("is_whole <>", value, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeGreaterThan(Boolean value) {
            addCriterion("is_whole >", value, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_whole >=", value, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeLessThan(Boolean value) {
            addCriterion("is_whole <", value, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_whole <=", value, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeIn(List<Boolean> values) {
            addCriterion("is_whole in", values, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeNotIn(List<Boolean> values) {
            addCriterion("is_whole not in", values, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_whole between", value1, value2, "isWhole");
            return (Criteria) this;
        }

        public Criteria andIsWholeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_whole not between", value1, value2, "isWhole");
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

        public Criteria andHouseTypeIdIsNull() {
            addCriterion("house_type_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdIsNotNull() {
            addCriterion("house_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdEqualTo(Integer value) {
            addCriterion("house_type_id =", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdNotEqualTo(Integer value) {
            addCriterion("house_type_id <>", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdGreaterThan(Integer value) {
            addCriterion("house_type_id >", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_type_id >=", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdLessThan(Integer value) {
            addCriterion("house_type_id <", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_type_id <=", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdIn(List<Integer> values) {
            addCriterion("house_type_id in", values, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdNotIn(List<Integer> values) {
            addCriterion("house_type_id not in", values, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("house_type_id between", value1, value2, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_type_id not between", value1, value2, "houseTypeId");
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

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Boolean value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Boolean value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Boolean value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Boolean value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Boolean> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Boolean> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtIsNull() {
            addCriterion("decorating_end_at is null");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtIsNotNull() {
            addCriterion("decorating_end_at is not null");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtEqualTo(Date value) {
            addCriterionForJDBCDate("decorating_end_at =", value, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("decorating_end_at <>", value, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtGreaterThan(Date value) {
            addCriterionForJDBCDate("decorating_end_at >", value, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("decorating_end_at >=", value, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtLessThan(Date value) {
            addCriterionForJDBCDate("decorating_end_at <", value, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("decorating_end_at <=", value, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtIn(List<Date> values) {
            addCriterionForJDBCDate("decorating_end_at in", values, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("decorating_end_at not in", values, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("decorating_end_at between", value1, value2, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingEndAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("decorating_end_at not between", value1, value2, "decoratingEndAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtIsNull() {
            addCriterion("decorating_start_at is null");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtIsNotNull() {
            addCriterion("decorating_start_at is not null");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtEqualTo(Date value) {
            addCriterionForJDBCDate("decorating_start_at =", value, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("decorating_start_at <>", value, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtGreaterThan(Date value) {
            addCriterionForJDBCDate("decorating_start_at >", value, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("decorating_start_at >=", value, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtLessThan(Date value) {
            addCriterionForJDBCDate("decorating_start_at <", value, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("decorating_start_at <=", value, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtIn(List<Date> values) {
            addCriterionForJDBCDate("decorating_start_at in", values, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("decorating_start_at not in", values, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("decorating_start_at between", value1, value2, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andDecoratingStartAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("decorating_start_at not between", value1, value2, "decoratingStartAt");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingIsNull() {
            addCriterion("is_decorating is null");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingIsNotNull() {
            addCriterion("is_decorating is not null");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingEqualTo(Boolean value) {
            addCriterion("is_decorating =", value, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingNotEqualTo(Boolean value) {
            addCriterion("is_decorating <>", value, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingGreaterThan(Boolean value) {
            addCriterion("is_decorating >", value, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_decorating >=", value, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingLessThan(Boolean value) {
            addCriterion("is_decorating <", value, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingLessThanOrEqualTo(Boolean value) {
            addCriterion("is_decorating <=", value, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingIn(List<Boolean> values) {
            addCriterion("is_decorating in", values, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingNotIn(List<Boolean> values) {
            addCriterion("is_decorating not in", values, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingBetween(Boolean value1, Boolean value2) {
            addCriterion("is_decorating between", value1, value2, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsDecoratingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_decorating not between", value1, value2, "isDecorating");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Boolean value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Boolean value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Boolean value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Boolean value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Boolean value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Boolean> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Boolean> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedIsNull() {
            addCriterion("is_concentrated is null");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedIsNotNull() {
            addCriterion("is_concentrated is not null");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedEqualTo(Boolean value) {
            addCriterion("is_concentrated =", value, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedNotEqualTo(Boolean value) {
            addCriterion("is_concentrated <>", value, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedGreaterThan(Boolean value) {
            addCriterion("is_concentrated >", value, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_concentrated >=", value, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedLessThan(Boolean value) {
            addCriterion("is_concentrated <", value, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_concentrated <=", value, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedIn(List<Boolean> values) {
            addCriterion("is_concentrated in", values, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedNotIn(List<Boolean> values) {
            addCriterion("is_concentrated not in", values, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_concentrated between", value1, value2, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andIsConcentratedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_concentrated not between", value1, value2, "isConcentrated");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("room_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("room_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(Short value) {
            addCriterion("room_num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(Short value) {
            addCriterion("room_num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(Short value) {
            addCriterion("room_num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(Short value) {
            addCriterion("room_num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(Short value) {
            addCriterion("room_num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(Short value) {
            addCriterion("room_num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<Short> values) {
            addCriterion("room_num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<Short> values) {
            addCriterion("room_num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(Short value1, Short value2) {
            addCriterion("room_num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(Short value1, Short value2) {
            addCriterion("room_num not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumIsNull() {
            addCriterion("total_floor_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumIsNotNull() {
            addCriterion("total_floor_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumEqualTo(String value) {
            addCriterion("total_floor_num =", value, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumNotEqualTo(String value) {
            addCriterion("total_floor_num <>", value, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumGreaterThan(String value) {
            addCriterion("total_floor_num >", value, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumGreaterThanOrEqualTo(String value) {
            addCriterion("total_floor_num >=", value, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumLessThan(String value) {
            addCriterion("total_floor_num <", value, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumLessThanOrEqualTo(String value) {
            addCriterion("total_floor_num <=", value, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumLike(String value) {
            addCriterion("total_floor_num like", value, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumNotLike(String value) {
            addCriterion("total_floor_num not like", value, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumIn(List<String> values) {
            addCriterion("total_floor_num in", values, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumNotIn(List<String> values) {
            addCriterion("total_floor_num not in", values, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumBetween(String value1, String value2) {
            addCriterion("total_floor_num between", value1, value2, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNumNotBetween(String value1, String value2) {
            addCriterion("total_floor_num not between", value1, value2, "totalFloorNum");
            return (Criteria) this;
        }

        public Criteria andIsStopIsNull() {
            addCriterion("is_stop is null");
            return (Criteria) this;
        }

        public Criteria andIsStopIsNotNull() {
            addCriterion("is_stop is not null");
            return (Criteria) this;
        }

        public Criteria andIsStopEqualTo(Boolean value) {
            addCriterion("is_stop =", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotEqualTo(Boolean value) {
            addCriterion("is_stop <>", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopGreaterThan(Boolean value) {
            addCriterion("is_stop >", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_stop >=", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopLessThan(Boolean value) {
            addCriterion("is_stop <", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopLessThanOrEqualTo(Boolean value) {
            addCriterion("is_stop <=", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopIn(List<Boolean> values) {
            addCriterion("is_stop in", values, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotIn(List<Boolean> values) {
            addCriterion("is_stop not in", values, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopBetween(Boolean value1, Boolean value2) {
            addCriterion("is_stop between", value1, value2, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_stop not between", value1, value2, "isStop");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeIsNull() {
            addCriterion("decorating_fee is null");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeIsNotNull() {
            addCriterion("decorating_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeEqualTo(Double value) {
            addCriterion("decorating_fee =", value, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeNotEqualTo(Double value) {
            addCriterion("decorating_fee <>", value, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeGreaterThan(Double value) {
            addCriterion("decorating_fee >", value, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("decorating_fee >=", value, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeLessThan(Double value) {
            addCriterion("decorating_fee <", value, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeLessThanOrEqualTo(Double value) {
            addCriterion("decorating_fee <=", value, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeIn(List<Double> values) {
            addCriterion("decorating_fee in", values, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeNotIn(List<Double> values) {
            addCriterion("decorating_fee not in", values, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeBetween(Double value1, Double value2) {
            addCriterion("decorating_fee between", value1, value2, "decoratingFee");
            return (Criteria) this;
        }

        public Criteria andDecoratingFeeNotBetween(Double value1, Double value2) {
            addCriterion("decorating_fee not between", value1, value2, "decoratingFee");
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

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Short value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Short value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Short value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Short value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Short value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Short> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Short> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Short value1, Short value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Short value1, Short value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
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