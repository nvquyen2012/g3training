package com.example.demomapstruct.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InterceptorAppConfig {

    @Autowired
    private DefaultInterceptor defaultInterceptor;

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(defaultInterceptor);
//    }
}
