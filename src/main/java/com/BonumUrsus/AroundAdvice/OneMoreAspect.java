package com.BonumUrsus.AroundAdvice;

import com.BonumUrsus.BeforeAdvice.MyAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class OneMoreAspect {

    public static Logger log = LoggerFactory.getLogger(MyAspect.class.getName());

    @Pointcut("execution(* com.BonumUrsus.AroundAdvice.*.getFortune(..))")
    public void getPointcut(){}

    @Around("getPointcut()")
    public Object getTrafficFortune(
            ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        log.info("Method: " + proceedingJoinPoint.getSignature());
        long start = System.currentTimeMillis();

        Object result = proceedingJoinPoint.proceed();

        long finish = System.currentTimeMillis();

        long duration = finish - start;

        log.info("Time spend: " + duration);

//        return "Random value";
        return result;
    }


}
