package com.BonumUrsus.AroundAdvice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExecutableClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService tfs =
                context.getBean("trafficFortuneService", TrafficFortuneService.class);

        System.out.println(tfs.getFortune(false));

        context.close();
    }
}
