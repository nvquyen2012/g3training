package com.example.demomapstruct.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Aspect
@Component
@Slf4j
public class UpdateAndDeleteAspect {

    @Pointcut("within(com.example.demomapstruct.controller..*)")
    public void testPointCut(){

    }

//    @Before(value = "target(com.example.demomapstruct.controller.AbstractController)")
//    public void loggerForInvalidRequest(JoinPoint joinPoint) {
//        log.error("Error when execute {} in {} with exception", joinPoint.getSignature().getName(), joinPoint.getTarget().getClass().getSimpleName());
//    }
}
