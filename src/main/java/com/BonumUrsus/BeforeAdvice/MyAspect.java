package com.BonumUrsus.BeforeAdvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyAspect {
    public static Logger log = LoggerFactory.getLogger(MyAspect.class.getName());

    @Pointcut("execution(public void add*(..))")
    public void pointcutDeclaration(){}

    @Pointcut("execution(* get*())")
    public void getter(){}

    @Pointcut("execution(* set(..))")
    public void setter(){}

    @Pointcut("pointcutDeclaration() && !(getter() || setter())")
    public void combiningPointcuts(){}


//    @Before("execution(* add*())") ---> for any return type method which starts with "add"
//    @Before("execution(public void addAccount(*))") ---> for one argument which has any type
//    @Before("execution(public void addAccount(..))") ---> for 0 to many arguments which has any type
    @Before("combiningPointcuts()")
    public void beforeAddAccountAdvise(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();

        log.info("(Before) My aspect is working!!!");
        log.info(methodSignature.toString());
        if(args.length > 0)
            log.info("args[0] = " + args[0].toString());
    }
    @AfterReturning(pointcut = "getter()", returning = "result")
    public void afterSetter(JoinPoint joinPoint, String result){
        log.info("After " +  joinPoint.getSignature() + "Name = " + result);
    }
}
