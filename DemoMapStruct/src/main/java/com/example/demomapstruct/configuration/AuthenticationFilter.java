package com.example.demomapstruct.configuration;

import com.example.demomapstruct.exception.TokenNotFoundException;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Scanner;

//@Configuration
@Slf4j
public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //checking request
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String token = httpServletRequest.getHeader("token");
        Scanner s = new Scanner(httpServletRequest.getInputStream(), "UTF-8").useDelimiter("\\A");
        if (s.hasNext()) {
            log.info(s.next());
        } else {
            log.info("");
        }
        //verify token
        if (token == null || (token != null && !token.contains("g3"))) {
            throw new TokenNotFoundException("Token is not found");
        }

//        Map<String, Object> body = httpServletRequest.getReader();

        //remove token from header


        //modify response


        //allow filter chain continue
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
