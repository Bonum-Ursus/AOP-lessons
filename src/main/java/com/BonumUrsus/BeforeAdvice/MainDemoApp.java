package com.BonumUrsus.BeforeAdvice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO =
                context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO =
                context.getBean("membershipDAO", MembershipDAO.class);

        accountDAO.addAccount();
        accountDAO.setId(1);
        accountDAO.getId();
        accountDAO.setName("Name");
        accountDAO.getName();

        membershipDAO.addCustomer();

        context.close();
    }
}
