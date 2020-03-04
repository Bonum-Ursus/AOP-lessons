package com.BonumUrsus.BeforeAdvice;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount(){
        System.out.println(MembershipDAO.class.getName() + " Yep! It's working=)");
    }
}
