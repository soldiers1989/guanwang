package com.web.business.model.caspain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubwayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public SubwayInfoExample() {
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

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(Integer value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(Integer value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(Integer value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(Integer value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(Integer value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<Integer> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<Integer> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(Integer value1, Integer value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andSubwayLineIsNull() {
            addCriterion("subway_line is null");
            return (Criteria) this;
        }

        public Criteria andSubwayLineIsNotNull() {
            addCriterion("subway_line is not null");
            return (Criteria) this;
        }

        public Criteria andSubwayLineEqualTo(String value) {
            addCriterion("subway_line =", value, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineNotEqualTo(String value) {
            addCriterion("subway_line <>", value, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineGreaterThan(String value) {
            addCriterion("subway_line >", value, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineGreaterThanOrEqualTo(String value) {
            addCriterion("subway_line >=", value, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineLessThan(String value) {
            addCriterion("subway_line <", value, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineLessThanOrEqualTo(String value) {
            addCriterion("subway_line <=", value, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineLike(String value) {
            addCriterion("subway_line like", value, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineNotLike(String value) {
            addCriterion("subway_line not like", value, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineIn(List<String> values) {
            addCriterion("subway_line in", values, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineNotIn(List<String> values) {
            addCriterion("subway_line not in", values, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineBetween(String value1, String value2) {
            addCriterion("subway_line between", value1, value2, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayLineNotBetween(String value1, String value2) {
            addCriterion("subway_line not between", value1, value2, "subwayLine");
            return (Criteria) this;
        }

        public Criteria andSubwayStationIsNull() {
            addCriterion("subway_station is null");
            return (Criteria) this;
        }

        public Criteria andSubwayStationIsNotNull() {
            addCriterion("subway_station is not null");
            return (Criteria) this;
        }

        public Criteria andSubwayStationEqualTo(String value) {
            addCriterion("subway_station =", value, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationNotEqualTo(String value) {
            addCriterion("subway_station <>", value, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationGreaterThan(String value) {
            addCriterion("subway_station >", value, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationGreaterThanOrEqualTo(String value) {
            addCriterion("subway_station >=", value, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationLessThan(String value) {
            addCriterion("subway_station <", value, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationLessThanOrEqualTo(String value) {
            addCriterion("subway_station <=", value, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationLike(String value) {
            addCriterion("subway_station like", value, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationNotLike(String value) {
            addCriterion("subway_station not like", value, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationIn(List<String> values) {
            addCriterion("subway_station in", values, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationNotIn(List<String> values) {
            addCriterion("subway_station not in", values, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationBetween(String value1, String value2) {
            addCriterion("subway_station between", value1, value2, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andSubwayStationNotBetween(String value1, String value2) {
            addCriterion("subway_station not between", value1, value2, "subwayStation");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeIsNull() {
            addCriterion("sta_longitude is null");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeIsNotNull() {
            addCriterion("sta_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeEqualTo(String value) {
            addCriterion("sta_longitude =", value, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeNotEqualTo(String value) {
            addCriterion("sta_longitude <>", value, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeGreaterThan(String value) {
            addCriterion("sta_longitude >", value, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("sta_longitude >=", value, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeLessThan(String value) {
            addCriterion("sta_longitude <", value, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeLessThanOrEqualTo(String value) {
            addCriterion("sta_longitude <=", value, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeLike(String value) {
            addCriterion("sta_longitude like", value, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeNotLike(String value) {
            addCriterion("sta_longitude not like", value, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeIn(List<String> values) {
            addCriterion("sta_longitude in", values, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeNotIn(List<String> values) {
            addCriterion("sta_longitude not in", values, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeBetween(String value1, String value2) {
            addCriterion("sta_longitude between", value1, value2, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLongitudeNotBetween(String value1, String value2) {
            addCriterion("sta_longitude not between", value1, value2, "staLongitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeIsNull() {
            addCriterion("sta_latitude is null");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeIsNotNull() {
            addCriterion("sta_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeEqualTo(String value) {
            addCriterion("sta_latitude =", value, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeNotEqualTo(String value) {
            addCriterion("sta_latitude <>", value, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeGreaterThan(String value) {
            addCriterion("sta_latitude >", value, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("sta_latitude >=", value, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeLessThan(String value) {
            addCriterion("sta_latitude <", value, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeLessThanOrEqualTo(String value) {
            addCriterion("sta_latitude <=", value, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeLike(String value) {
            addCriterion("sta_latitude like", value, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeNotLike(String value) {
            addCriterion("sta_latitude not like", value, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeIn(List<String> values) {
            addCriterion("sta_latitude in", values, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeNotIn(List<String> values) {
            addCriterion("sta_latitude not in", values, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeBetween(String value1, String value2) {
            addCriterion("sta_latitude between", value1, value2, "staLatitude");
            return (Criteria) this;
        }

        public Criteria andStaLatitudeNotBetween(String value1, String value2) {
            addCriterion("sta_latitude not between", value1, value2, "staLatitude");
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