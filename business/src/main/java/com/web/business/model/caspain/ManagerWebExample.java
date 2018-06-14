package com.web.business.model.caspain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerWebExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ManagerWebExample() {
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

        public Criteria andUndomainUrlIsNull() {
            addCriterion("undomain_url is null");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlIsNotNull() {
            addCriterion("undomain_url is not null");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlEqualTo(String value) {
            addCriterion("undomain_url =", value, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlNotEqualTo(String value) {
            addCriterion("undomain_url <>", value, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlGreaterThan(String value) {
            addCriterion("undomain_url >", value, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlGreaterThanOrEqualTo(String value) {
            addCriterion("undomain_url >=", value, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlLessThan(String value) {
            addCriterion("undomain_url <", value, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlLessThanOrEqualTo(String value) {
            addCriterion("undomain_url <=", value, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlLike(String value) {
            addCriterion("undomain_url like", value, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlNotLike(String value) {
            addCriterion("undomain_url not like", value, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlIn(List<String> values) {
            addCriterion("undomain_url in", values, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlNotIn(List<String> values) {
            addCriterion("undomain_url not in", values, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlBetween(String value1, String value2) {
            addCriterion("undomain_url between", value1, value2, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andUndomainUrlNotBetween(String value1, String value2) {
            addCriterion("undomain_url not between", value1, value2, "undomainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlIsNull() {
            addCriterion("domain_url is null");
            return (Criteria) this;
        }

        public Criteria andDomainUrlIsNotNull() {
            addCriterion("domain_url is not null");
            return (Criteria) this;
        }

        public Criteria andDomainUrlEqualTo(String value) {
            addCriterion("domain_url =", value, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlNotEqualTo(String value) {
            addCriterion("domain_url <>", value, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlGreaterThan(String value) {
            addCriterion("domain_url >", value, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlGreaterThanOrEqualTo(String value) {
            addCriterion("domain_url >=", value, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlLessThan(String value) {
            addCriterion("domain_url <", value, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlLessThanOrEqualTo(String value) {
            addCriterion("domain_url <=", value, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlLike(String value) {
            addCriterion("domain_url like", value, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlNotLike(String value) {
            addCriterion("domain_url not like", value, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlIn(List<String> values) {
            addCriterion("domain_url in", values, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlNotIn(List<String> values) {
            addCriterion("domain_url not in", values, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlBetween(String value1, String value2) {
            addCriterion("domain_url between", value1, value2, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andDomainUrlNotBetween(String value1, String value2) {
            addCriterion("domain_url not between", value1, value2, "domainUrl");
            return (Criteria) this;
        }

        public Criteria andApartmentNameIsNull() {
            addCriterion("apartment_name is null");
            return (Criteria) this;
        }

        public Criteria andApartmentNameIsNotNull() {
            addCriterion("apartment_name is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentNameEqualTo(String value) {
            addCriterion("apartment_name =", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameNotEqualTo(String value) {
            addCriterion("apartment_name <>", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameGreaterThan(String value) {
            addCriterion("apartment_name >", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("apartment_name >=", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameLessThan(String value) {
            addCriterion("apartment_name <", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameLessThanOrEqualTo(String value) {
            addCriterion("apartment_name <=", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameLike(String value) {
            addCriterion("apartment_name like", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameNotLike(String value) {
            addCriterion("apartment_name not like", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameIn(List<String> values) {
            addCriterion("apartment_name in", values, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameNotIn(List<String> values) {
            addCriterion("apartment_name not in", values, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameBetween(String value1, String value2) {
            addCriterion("apartment_name between", value1, value2, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameNotBetween(String value1, String value2) {
            addCriterion("apartment_name not between", value1, value2, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameIsNull() {
            addCriterion("slogen_name is null");
            return (Criteria) this;
        }

        public Criteria andSlogenNameIsNotNull() {
            addCriterion("slogen_name is not null");
            return (Criteria) this;
        }

        public Criteria andSlogenNameEqualTo(String value) {
            addCriterion("slogen_name =", value, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameNotEqualTo(String value) {
            addCriterion("slogen_name <>", value, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameGreaterThan(String value) {
            addCriterion("slogen_name >", value, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameGreaterThanOrEqualTo(String value) {
            addCriterion("slogen_name >=", value, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameLessThan(String value) {
            addCriterion("slogen_name <", value, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameLessThanOrEqualTo(String value) {
            addCriterion("slogen_name <=", value, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameLike(String value) {
            addCriterion("slogen_name like", value, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameNotLike(String value) {
            addCriterion("slogen_name not like", value, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameIn(List<String> values) {
            addCriterion("slogen_name in", values, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameNotIn(List<String> values) {
            addCriterion("slogen_name not in", values, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameBetween(String value1, String value2) {
            addCriterion("slogen_name between", value1, value2, "slogenName");
            return (Criteria) this;
        }

        public Criteria andSlogenNameNotBetween(String value1, String value2) {
            addCriterion("slogen_name not between", value1, value2, "slogenName");
            return (Criteria) this;
        }

        public Criteria andLogoImageIsNull() {
            addCriterion("logo_image is null");
            return (Criteria) this;
        }

        public Criteria andLogoImageIsNotNull() {
            addCriterion("logo_image is not null");
            return (Criteria) this;
        }

        public Criteria andLogoImageEqualTo(String value) {
            addCriterion("logo_image =", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageNotEqualTo(String value) {
            addCriterion("logo_image <>", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageGreaterThan(String value) {
            addCriterion("logo_image >", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageGreaterThanOrEqualTo(String value) {
            addCriterion("logo_image >=", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageLessThan(String value) {
            addCriterion("logo_image <", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageLessThanOrEqualTo(String value) {
            addCriterion("logo_image <=", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageLike(String value) {
            addCriterion("logo_image like", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageNotLike(String value) {
            addCriterion("logo_image not like", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageIn(List<String> values) {
            addCriterion("logo_image in", values, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageNotIn(List<String> values) {
            addCriterion("logo_image not in", values, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageBetween(String value1, String value2) {
            addCriterion("logo_image between", value1, value2, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageNotBetween(String value1, String value2) {
            addCriterion("logo_image not between", value1, value2, "logoImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageIsNull() {
            addCriterion("qr_wechat_image is null");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageIsNotNull() {
            addCriterion("qr_wechat_image is not null");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageEqualTo(String value) {
            addCriterion("qr_wechat_image =", value, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageNotEqualTo(String value) {
            addCriterion("qr_wechat_image <>", value, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageGreaterThan(String value) {
            addCriterion("qr_wechat_image >", value, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageGreaterThanOrEqualTo(String value) {
            addCriterion("qr_wechat_image >=", value, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageLessThan(String value) {
            addCriterion("qr_wechat_image <", value, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageLessThanOrEqualTo(String value) {
            addCriterion("qr_wechat_image <=", value, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageLike(String value) {
            addCriterion("qr_wechat_image like", value, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageNotLike(String value) {
            addCriterion("qr_wechat_image not like", value, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageIn(List<String> values) {
            addCriterion("qr_wechat_image in", values, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageNotIn(List<String> values) {
            addCriterion("qr_wechat_image not in", values, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageBetween(String value1, String value2) {
            addCriterion("qr_wechat_image between", value1, value2, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrWechatImageNotBetween(String value1, String value2) {
            addCriterion("qr_wechat_image not between", value1, value2, "qrWechatImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageIsNull() {
            addCriterion("qr_app_image is null");
            return (Criteria) this;
        }

        public Criteria andQrAppImageIsNotNull() {
            addCriterion("qr_app_image is not null");
            return (Criteria) this;
        }

        public Criteria andQrAppImageEqualTo(String value) {
            addCriterion("qr_app_image =", value, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageNotEqualTo(String value) {
            addCriterion("qr_app_image <>", value, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageGreaterThan(String value) {
            addCriterion("qr_app_image >", value, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageGreaterThanOrEqualTo(String value) {
            addCriterion("qr_app_image >=", value, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageLessThan(String value) {
            addCriterion("qr_app_image <", value, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageLessThanOrEqualTo(String value) {
            addCriterion("qr_app_image <=", value, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageLike(String value) {
            addCriterion("qr_app_image like", value, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageNotLike(String value) {
            addCriterion("qr_app_image not like", value, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageIn(List<String> values) {
            addCriterion("qr_app_image in", values, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageNotIn(List<String> values) {
            addCriterion("qr_app_image not in", values, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageBetween(String value1, String value2) {
            addCriterion("qr_app_image between", value1, value2, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andQrAppImageNotBetween(String value1, String value2) {
            addCriterion("qr_app_image not between", value1, value2, "qrAppImage");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneIsNull() {
            addCriterion("service_telephone is null");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneIsNotNull() {
            addCriterion("service_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneEqualTo(String value) {
            addCriterion("service_telephone =", value, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneNotEqualTo(String value) {
            addCriterion("service_telephone <>", value, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneGreaterThan(String value) {
            addCriterion("service_telephone >", value, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_telephone >=", value, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneLessThan(String value) {
            addCriterion("service_telephone <", value, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneLessThanOrEqualTo(String value) {
            addCriterion("service_telephone <=", value, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneLike(String value) {
            addCriterion("service_telephone like", value, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneNotLike(String value) {
            addCriterion("service_telephone not like", value, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneIn(List<String> values) {
            addCriterion("service_telephone in", values, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneNotIn(List<String> values) {
            addCriterion("service_telephone not in", values, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneBetween(String value1, String value2) {
            addCriterion("service_telephone between", value1, value2, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTelephoneNotBetween(String value1, String value2) {
            addCriterion("service_telephone not between", value1, value2, "serviceTelephone");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNull() {
            addCriterion("service_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNotNull() {
            addCriterion("service_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEqualTo(String value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(String value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(String value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(String value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(String value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLike(String value) {
            addCriterion("service_time like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotLike(String value) {
            addCriterion("service_time not like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<String> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<String> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(String value1, String value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(String value1, String value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceEmailIsNull() {
            addCriterion("service_email is null");
            return (Criteria) this;
        }

        public Criteria andServiceEmailIsNotNull() {
            addCriterion("service_email is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEmailEqualTo(String value) {
            addCriterion("service_email =", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailNotEqualTo(String value) {
            addCriterion("service_email <>", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailGreaterThan(String value) {
            addCriterion("service_email >", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailGreaterThanOrEqualTo(String value) {
            addCriterion("service_email >=", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailLessThan(String value) {
            addCriterion("service_email <", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailLessThanOrEqualTo(String value) {
            addCriterion("service_email <=", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailLike(String value) {
            addCriterion("service_email like", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailNotLike(String value) {
            addCriterion("service_email not like", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailIn(List<String> values) {
            addCriterion("service_email in", values, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailNotIn(List<String> values) {
            addCriterion("service_email not in", values, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailBetween(String value1, String value2) {
            addCriterion("service_email between", value1, value2, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailNotBetween(String value1, String value2) {
            addCriterion("service_email not between", value1, value2, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andIcpNumIsNull() {
            addCriterion("icp_num is null");
            return (Criteria) this;
        }

        public Criteria andIcpNumIsNotNull() {
            addCriterion("icp_num is not null");
            return (Criteria) this;
        }

        public Criteria andIcpNumEqualTo(String value) {
            addCriterion("icp_num =", value, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumNotEqualTo(String value) {
            addCriterion("icp_num <>", value, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumGreaterThan(String value) {
            addCriterion("icp_num >", value, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumGreaterThanOrEqualTo(String value) {
            addCriterion("icp_num >=", value, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumLessThan(String value) {
            addCriterion("icp_num <", value, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumLessThanOrEqualTo(String value) {
            addCriterion("icp_num <=", value, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumLike(String value) {
            addCriterion("icp_num like", value, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumNotLike(String value) {
            addCriterion("icp_num not like", value, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumIn(List<String> values) {
            addCriterion("icp_num in", values, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumNotIn(List<String> values) {
            addCriterion("icp_num not in", values, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumBetween(String value1, String value2) {
            addCriterion("icp_num between", value1, value2, "icpNum");
            return (Criteria) this;
        }

        public Criteria andIcpNumNotBetween(String value1, String value2) {
            addCriterion("icp_num not between", value1, value2, "icpNum");
            return (Criteria) this;
        }

        public Criteria andWebColorIsNull() {
            addCriterion("web_color is null");
            return (Criteria) this;
        }

        public Criteria andWebColorIsNotNull() {
            addCriterion("web_color is not null");
            return (Criteria) this;
        }

        public Criteria andWebColorEqualTo(String value) {
            addCriterion("web_color =", value, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorNotEqualTo(String value) {
            addCriterion("web_color <>", value, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorGreaterThan(String value) {
            addCriterion("web_color >", value, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorGreaterThanOrEqualTo(String value) {
            addCriterion("web_color >=", value, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorLessThan(String value) {
            addCriterion("web_color <", value, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorLessThanOrEqualTo(String value) {
            addCriterion("web_color <=", value, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorLike(String value) {
            addCriterion("web_color like", value, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorNotLike(String value) {
            addCriterion("web_color not like", value, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorIn(List<String> values) {
            addCriterion("web_color in", values, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorNotIn(List<String> values) {
            addCriterion("web_color not in", values, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorBetween(String value1, String value2) {
            addCriterion("web_color between", value1, value2, "webColor");
            return (Criteria) this;
        }

        public Criteria andWebColorNotBetween(String value1, String value2) {
            addCriterion("web_color not between", value1, value2, "webColor");
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

        public Criteria andCreateByIdIsNull() {
            addCriterion("create_by_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIdIsNotNull() {
            addCriterion("create_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByIdEqualTo(Integer value) {
            addCriterion("create_by_id =", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotEqualTo(Integer value) {
            addCriterion("create_by_id <>", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdGreaterThan(Integer value) {
            addCriterion("create_by_id >", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_by_id >=", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdLessThan(Integer value) {
            addCriterion("create_by_id <", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_by_id <=", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdIn(List<Integer> values) {
            addCriterion("create_by_id in", values, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotIn(List<Integer> values) {
            addCriterion("create_by_id not in", values, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdBetween(Integer value1, Integer value2) {
            addCriterion("create_by_id between", value1, value2, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_by_id not between", value1, value2, "createById");
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

        public Criteria andUpdateByIdIsNull() {
            addCriterion("update_by_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdIsNotNull() {
            addCriterion("update_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdEqualTo(Integer value) {
            addCriterion("update_by_id =", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotEqualTo(Integer value) {
            addCriterion("update_by_id <>", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdGreaterThan(Integer value) {
            addCriterion("update_by_id >", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by_id >=", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdLessThan(Integer value) {
            addCriterion("update_by_id <", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_by_id <=", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdIn(List<Integer> values) {
            addCriterion("update_by_id in", values, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotIn(List<Integer> values) {
            addCriterion("update_by_id not in", values, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdBetween(Integer value1, Integer value2) {
            addCriterion("update_by_id between", value1, value2, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by_id not between", value1, value2, "updateById");
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