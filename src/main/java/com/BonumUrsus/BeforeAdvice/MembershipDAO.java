package com.BonumUrsus.BeforeAdvice;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addCustomer(String s){
        System.out.println(MembershipDAO.class.getName() + " Yep! It's working=)");
    }
}
