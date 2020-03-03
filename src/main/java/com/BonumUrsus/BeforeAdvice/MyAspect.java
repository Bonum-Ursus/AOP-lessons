package com.BonumUrsus.BeforeAdvice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    public static Logger log = LoggerFactory.getLogger(MyAspect.class.getName());
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvise(){
        log.info("My aspect is working!!!");
    }
}
