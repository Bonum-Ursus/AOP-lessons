package com.BonumUrsus.BeforeAdvice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyNewAspect {
    @Pointcut("execution(public void add*())")
    public void pointcutDeclaration(){}
    @Pointcut("execution(* get*())")
    public void getter(){}
    @Pointcut("execution(* set*(..))")
    public void setter(){}
    @Pointcut("pointcutDeclaration() && !(getter() || setter())")
    public void combiningPointcuts(){}


    @Before("combiningPointcuts()")
    public void beforeMethodAspect(){
        System.out.println(getClass() + " So... Second order go now");
    }
}
