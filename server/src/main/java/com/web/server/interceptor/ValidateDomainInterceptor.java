package com.web.server.interceptor;

import com.web.business.model.caspain.ManagerWeb;
import com.web.business.service.website.ManagerWebService;
import com.web.common.support.DomainThreadLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Sky
 * create 2018/05/11
 * email sky.li@ixiaoshuidi.com
 **/
public class ValidateDomainInterceptor implements HandlerInterceptor {
    private final Logger LOG = LoggerFactory.getLogger(ValidateDomainInterceptor.class);
    //        private final String DOMAIN_NAME="web.shuidiguanjia.com";
    @Value("${domain_url}")
    private String DOMAIN_NAME;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String domainName = request.getServerName();
        BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
        ManagerWebService managerWebService = (ManagerWebService) factory.getBean("managerWebService");
        ManagerWeb managerWeb;
        if (DOMAIN_NAME.equals(domainName)) {
            String requestURI = request.getRequestURI();
            String[] requestURIArr = requestURI.split("/");
            managerWeb = managerWebService.findManagerWebByUndomainUrl(DOMAIN_NAME + "/" + requestURIArr[1]);
        } else {
            managerWeb = managerWebService.findManagerWebByDomainUrl(domainName);
        }
        DomainThreadLocal.set(managerWeb.getId());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
