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

        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, HEAD, OPTIONS");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
        chain.doFilter(request, response);
    }
}
