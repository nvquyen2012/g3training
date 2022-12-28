package com.example.demomapstruct.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AnyControllerAspect {

    @Before("@annotation(com.example.demomapstruct.annotation.MakeChangesInDatabase)")
    public void beforeReceiveRequest(JoinPoint jp){
        log.info("Receive change database request from {}", jp.getSignature().getName(), jp.getTarget().getClass().getSimpleName());
    }

    @Pointcut("within(com.example.demomapstruct.controller.AbstractController)")
    public void withinAbstractController() {
    }

    @Before("withinAbstractController()")
    public void testWithin(){
        log.info("test string");
    }
//
//    @After(value = "execution(* com.example.demomapstruct.controller.AbstractController.*(..))")
//    public void afterReceiveRequest(JoinPoint jp){
//        log.info("Complete {} request in {}", jp.getSignature().getName(), jp.getTarget().getClass().getSimpleName());
//    }

//    @Around(value = "execution(* com.example.demomapstruct.controller.AbstractController.*(..))")
//    public void afterReceiveRequest(ProceedingJoinPoint jp){
//        log.info("Receive {} request from {}", jp.getSignature().getName(), jp.getTarget().getClass().getSimpleName());
//        LocalDateTime start = LocalDateTime.now();
//        try {
//            jp.proceed();
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//        LocalDateTime end = LocalDateTime.now();
//        log.info("Complete {} request in {}", jp.getSignature().getName(), jp.getTarget().getClass().getSimpleName());
//    }

//    @AfterReturning(value = "execution(* com.example.demomapstruct.controller.AbstractController.*(..))", returning = "res")
//    public void afterReturning(JoinPoint joinPoint, ResponseEntity res) {
//        log.info("Student: {}", res.getBody().toString());
//    }
//
//    @AfterThrowing(value = "execution(* com.example.demomapstruct.controller.AbstractController.*(..))", throwing = "ex")
//    public void afterThrowing(JoinPoint jp, Exception ex){
//        log.error("Error when execute {} in {} with exception {}", jp.getSignature().getName(), jp.getTarget().getClass().getSimpleName(), ex.getMessage());
//    }

}
