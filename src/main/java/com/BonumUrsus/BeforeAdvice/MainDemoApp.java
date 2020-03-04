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
        accountDAO.setName("This is the name of account");
        System.out.println(accountDAO.getName());

        membershipDAO.addCustomer("New Customer added!");

        context.close();
    }
}
