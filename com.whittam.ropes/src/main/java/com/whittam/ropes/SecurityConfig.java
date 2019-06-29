package com.whittam.ropes;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tyronboyd on 22/6/19.
 */

@Component
public class SecurityConfig extends GenericFilterBean {

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        if(!httpServletResponse.getHeaderNames().contains("Access-Control-Allow-Origin")) {
            httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
        }

        String headers= httpServletRequest.getHeader("Access-Control-Request-Headers");
        if(!httpServletResponse.getHeaderNames().contains("Access-Control-Allow-Headers") && StringUtils.isNotBlank(headers)) {
            httpServletResponse.addHeader("Access-Control-Allow-Headers", headers);
        }
        chain.doFilter(request, response);
    }
}
