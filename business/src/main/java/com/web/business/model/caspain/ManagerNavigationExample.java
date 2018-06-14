package com.web.business.model.caspain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerNavigationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ManagerNavigationExample() {
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

        public Criteria andMagagerWebIdIsNull() {
            addCriterion("magager_web_id is null");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdIsNotNull() {
            addCriterion("magager_web_id is not null");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdEqualTo(Integer value) {
            addCriterion("magager_web_id =", value, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdNotEqualTo(Integer value) {
            addCriterion("magager_web_id <>", value, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdGreaterThan(Integer value) {
            addCriterion("magager_web_id >", value, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("magager_web_id >=", value, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdLessThan(Integer value) {
            addCriterion("magager_web_id <", value, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdLessThanOrEqualTo(Integer value) {
            addCriterion("magager_web_id <=", value, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdIn(List<Integer> values) {
            addCriterion("magager_web_id in", values, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdNotIn(List<Integer> values) {
            addCriterion("magager_web_id not in", values, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdBetween(Integer value1, Integer value2) {
            addCriterion("magager_web_id between", value1, value2, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andMagagerWebIdNotBetween(Integer value1, Integer value2) {
            addCriterion("magager_web_id not between", value1, value2, "magagerWebId");
            return (Criteria) this;
        }

        public Criteria andNavigationNameIsNull() {
            addCriterion("navigation_name is null");
            return (Criteria) this;
        }

        public Criteria andNavigationNameIsNotNull() {
            addCriterion("navigation_name is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationNameEqualTo(String value) {
            addCriterion("navigation_name =", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameNotEqualTo(String value) {
            addCriterion("navigation_name <>", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameGreaterThan(String value) {
            addCriterion("navigation_name >", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameGreaterThanOrEqualTo(String value) {
            addCriterion("navigation_name >=", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameLessThan(String value) {
            addCriterion("navigation_name <", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameLessThanOrEqualTo(String value) {
            addCriterion("navigation_name <=", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameLike(String value) {
            addCriterion("navigation_name like", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameNotLike(String value) {
            addCriterion("navigation_name not like", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameIn(List<String> values) {
            addCriterion("navigation_name in", values, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameNotIn(List<String> values) {
            addCriterion("navigation_name not in", values, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameBetween(String value1, String value2) {
            addCriterion("navigation_name between", value1, value2, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameNotBetween(String value1, String value2) {
            addCriterion("navigation_name not between", value1, value2, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkIsNull() {
            addCriterion("navigation_link is null");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkIsNotNull() {
            addCriterion("navigation_link is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkEqualTo(String value) {
            addCriterion("navigation_link =", value, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkNotEqualTo(String value) {
            addCriterion("navigation_link <>", value, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkGreaterThan(String value) {
            addCriterion("navigation_link >", value, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkGreaterThanOrEqualTo(String value) {
            addCriterion("navigation_link >=", value, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkLessThan(String value) {
            addCriterion("navigation_link <", value, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkLessThanOrEqualTo(String value) {
            addCriterion("navigation_link <=", value, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkLike(String value) {
            addCriterion("navigation_link like", value, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkNotLike(String value) {
            addCriterion("navigation_link not like", value, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkIn(List<String> values) {
            addCriterion("navigation_link in", values, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkNotIn(List<String> values) {
            addCriterion("navigation_link not in", values, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkBetween(String value1, String value2) {
            addCriterion("navigation_link between", value1, value2, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationLinkNotBetween(String value1, String value2) {
            addCriterion("navigation_link not between", value1, value2, "navigationLink");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroIsNull() {
            addCriterion("navigation_intro is null");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroIsNotNull() {
            addCriterion("navigation_intro is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroEqualTo(String value) {
            addCriterion("navigation_intro =", value, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroNotEqualTo(String value) {
            addCriterion("navigation_intro <>", value, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroGreaterThan(String value) {
            addCriterion("navigation_intro >", value, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroGreaterThanOrEqualTo(String value) {
            addCriterion("navigation_intro >=", value, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroLessThan(String value) {
            addCriterion("navigation_intro <", value, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroLessThanOrEqualTo(String value) {
            addCriterion("navigation_intro <=", value, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroLike(String value) {
            addCriterion("navigation_intro like", value, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroNotLike(String value) {
            addCriterion("navigation_intro not like", value, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroIn(List<String> values) {
            addCriterion("navigation_intro in", values, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroNotIn(List<String> values) {
            addCriterion("navigation_intro not in", values, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroBetween(String value1, String value2) {
            addCriterion("navigation_intro between", value1, value2, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationIntroNotBetween(String value1, String value2) {
            addCriterion("navigation_intro not between", value1, value2, "navigationIntro");
            return (Criteria) this;
        }

        public Criteria andNavigationImageIsNull() {
            addCriterion("navigation_image is null");
            return (Criteria) this;
        }

        public Criteria andNavigationImageIsNotNull() {
            addCriterion("navigation_image is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationImageEqualTo(String value) {
            addCriterion("navigation_image =", value, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageNotEqualTo(String value) {
            addCriterion("navigation_image <>", value, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageGreaterThan(String value) {
            addCriterion("navigation_image >", value, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageGreaterThanOrEqualTo(String value) {
            addCriterion("navigation_image >=", value, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageLessThan(String value) {
            addCriterion("navigation_image <", value, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageLessThanOrEqualTo(String value) {
            addCriterion("navigation_image <=", value, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageLike(String value) {
            addCriterion("navigation_image like", value, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageNotLike(String value) {
            addCriterion("navigation_image not like", value, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageIn(List<String> values) {
            addCriterion("navigation_image in", values, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageNotIn(List<String> values) {
            addCriterion("navigation_image not in", values, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageBetween(String value1, String value2) {
            addCriterion("navigation_image between", value1, value2, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationImageNotBetween(String value1, String value2) {
            addCriterion("navigation_image not between", value1, value2, "navigationImage");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceIsNull() {
            addCriterion("navigation_place is null");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceIsNotNull() {
            addCriterion("navigation_place is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceEqualTo(Integer value) {
            addCriterion("navigation_place =", value, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceNotEqualTo(Integer value) {
            addCriterion("navigation_place <>", value, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceGreaterThan(Integer value) {
            addCriterion("navigation_place >", value, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("navigation_place >=", value, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceLessThan(Integer value) {
            addCriterion("navigation_place <", value, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceLessThanOrEqualTo(Integer value) {
            addCriterion("navigation_place <=", value, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceIn(List<Integer> values) {
            addCriterion("navigation_place in", values, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceNotIn(List<Integer> values) {
            addCriterion("navigation_place not in", values, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceBetween(Integer value1, Integer value2) {
            addCriterion("navigation_place between", value1, value2, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationPlaceNotBetween(Integer value1, Integer value2) {
            addCriterion("navigation_place not between", value1, value2, "navigationPlace");
            return (Criteria) this;
        }

        public Criteria andNavigationSortIsNull() {
            addCriterion("navigation_sort is null");
            return (Criteria) this;
        }

        public Criteria andNavigationSortIsNotNull() {
            addCriterion("navigation_sort is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationSortEqualTo(Integer value) {
            addCriterion("navigation_sort =", value, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortNotEqualTo(Integer value) {
            addCriterion("navigation_sort <>", value, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortGreaterThan(Integer value) {
            addCriterion("navigation_sort >", value, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("navigation_sort >=", value, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortLessThan(Integer value) {
            addCriterion("navigation_sort <", value, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortLessThanOrEqualTo(Integer value) {
            addCriterion("navigation_sort <=", value, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortIn(List<Integer> values) {
            addCriterion("navigation_sort in", values, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortNotIn(List<Integer> values) {
            addCriterion("navigation_sort not in", values, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortBetween(Integer value1, Integer value2) {
            addCriterion("navigation_sort between", value1, value2, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andNavigationSortNotBetween(Integer value1, Integer value2) {
            addCriterion("navigation_sort not between", value1, value2, "navigationSort");
            return (Criteria) this;
        }

        public Criteria andLinkAddressIsNull() {
            addCriterion("link_address is null");
            return (Criteria) this;
        }

        public Criteria andLinkAddressIsNotNull() {
            addCriterion("link_address is not null");
            return (Criteria) this;
        }

        public Criteria andLinkAddressEqualTo(String value) {
            addCriterion("link_address =", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressNotEqualTo(String value) {
            addCriterion("link_address <>", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressGreaterThan(String value) {
            addCriterion("link_address >", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("link_address >=", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressLessThan(String value) {
            addCriterion("link_address <", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressLessThanOrEqualTo(String value) {
            addCriterion("link_address <=", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressLike(String value) {
            addCriterion("link_address like", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressNotLike(String value) {
            addCriterion("link_address not like", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressIn(List<String> values) {
            addCriterion("link_address in", values, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressNotIn(List<String> values) {
            addCriterion("link_address not in", values, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressBetween(String value1, String value2) {
            addCriterion("link_address between", value1, value2, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressNotBetween(String value1, String value2) {
            addCriterion("link_address not between", value1, value2, "linkAddress");
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

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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

        public Criteria andNavigationStatusIsNull() {
            addCriterion("navigation_status is null");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusIsNotNull() {
            addCriterion("navigation_status is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusEqualTo(Integer value) {
            addCriterion("navigation_status =", value, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusNotEqualTo(Integer value) {
            addCriterion("navigation_status <>", value, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusGreaterThan(Integer value) {
            addCriterion("navigation_status >", value, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("navigation_status >=", value, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusLessThan(Integer value) {
            addCriterion("navigation_status <", value, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("navigation_status <=", value, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusIn(List<Integer> values) {
            addCriterion("navigation_status in", values, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusNotIn(List<Integer> values) {
            addCriterion("navigation_status not in", values, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusBetween(Integer value1, Integer value2) {
            addCriterion("navigation_status between", value1, value2, "navigationStatus");
            return (Criteria) this;
        }

        public Criteria andNavigationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("navigation_status not between", value1, value2, "navigationStatus");
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