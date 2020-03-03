package com.BonumUrsus.BeforeAdvice;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(){
        System.out.println("Account added");
    }
}
