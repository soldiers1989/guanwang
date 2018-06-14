package com.web.business.model.caspain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerLayoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ManagerLayoutExample() {
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

        public Criteria andManagerWebIdIsNull() {
            addCriterion("manager_web_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdIsNotNull() {
            addCriterion("manager_web_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdEqualTo(Integer value) {
            addCriterion("manager_web_id =", value, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdNotEqualTo(Integer value) {
            addCriterion("manager_web_id <>", value, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdGreaterThan(Integer value) {
            addCriterion("manager_web_id >", value, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_web_id >=", value, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdLessThan(Integer value) {
            addCriterion("manager_web_id <", value, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_web_id <=", value, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdIn(List<Integer> values) {
            addCriterion("manager_web_id in", values, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdNotIn(List<Integer> values) {
            addCriterion("manager_web_id not in", values, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_web_id between", value1, value2, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andManagerWebIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_web_id not between", value1, value2, "managerWebId");
            return (Criteria) this;
        }

        public Criteria andTitleNameIsNull() {
            addCriterion("title_name is null");
            return (Criteria) this;
        }

        public Criteria andTitleNameIsNotNull() {
            addCriterion("title_name is not null");
            return (Criteria) this;
        }

        public Criteria andTitleNameEqualTo(String value) {
            addCriterion("title_name =", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameNotEqualTo(String value) {
            addCriterion("title_name <>", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameGreaterThan(String value) {
            addCriterion("title_name >", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameGreaterThanOrEqualTo(String value) {
            addCriterion("title_name >=", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameLessThan(String value) {
            addCriterion("title_name <", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameLessThanOrEqualTo(String value) {
            addCriterion("title_name <=", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameLike(String value) {
            addCriterion("title_name like", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameNotLike(String value) {
            addCriterion("title_name not like", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameIn(List<String> values) {
            addCriterion("title_name in", values, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameNotIn(List<String> values) {
            addCriterion("title_name not in", values, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameBetween(String value1, String value2) {
            addCriterion("title_name between", value1, value2, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameNotBetween(String value1, String value2) {
            addCriterion("title_name not between", value1, value2, "titleName");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroIsNull() {
            addCriterion("layout_intro is null");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroIsNotNull() {
            addCriterion("layout_intro is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroEqualTo(String value) {
            addCriterion("layout_intro =", value, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroNotEqualTo(String value) {
            addCriterion("layout_intro <>", value, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroGreaterThan(String value) {
            addCriterion("layout_intro >", value, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroGreaterThanOrEqualTo(String value) {
            addCriterion("layout_intro >=", value, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroLessThan(String value) {
            addCriterion("layout_intro <", value, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroLessThanOrEqualTo(String value) {
            addCriterion("layout_intro <=", value, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroLike(String value) {
            addCriterion("layout_intro like", value, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroNotLike(String value) {
            addCriterion("layout_intro not like", value, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroIn(List<String> values) {
            addCriterion("layout_intro in", values, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroNotIn(List<String> values) {
            addCriterion("layout_intro not in", values, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroBetween(String value1, String value2) {
            addCriterion("layout_intro between", value1, value2, "layoutIntro");
            return (Criteria) this;
        }

        public Criteria andLayoutIntroNotBetween(String value1, String value2) {
            addCriterion("layout_intro not between", value1, value2, "layoutIntro");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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

        public Criteria andLayoutStatusIsNull() {
            addCriterion("layout_status is null");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusIsNotNull() {
            addCriterion("layout_status is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusEqualTo(Integer value) {
            addCriterion("layout_status =", value, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusNotEqualTo(Integer value) {
            addCriterion("layout_status <>", value, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusGreaterThan(Integer value) {
            addCriterion("layout_status >", value, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("layout_status >=", value, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusLessThan(Integer value) {
            addCriterion("layout_status <", value, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusLessThanOrEqualTo(Integer value) {
            addCriterion("layout_status <=", value, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusIn(List<Integer> values) {
            addCriterion("layout_status in", values, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusNotIn(List<Integer> values) {
            addCriterion("layout_status not in", values, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusBetween(Integer value1, Integer value2) {
            addCriterion("layout_status between", value1, value2, "layoutStatus");
            return (Criteria) this;
        }

        public Criteria andLayoutStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("layout_status not between", value1, value2, "layoutStatus");
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