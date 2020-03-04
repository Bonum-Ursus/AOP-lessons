package com.BonumUrsus.BeforeAdvice;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    int id;
    String name;
    public void addAccount(){
        System.out.println(getClass().getName() + " Account added");
    }

    public int getId() {
        System.out.println("Getter method");
        return id;
    }

    public void setId(int id) {
        System.out.println("Setter method");

        this.id = id;
    }

    public String getName() {
        System.out.println("Getter method");

        return name;

    }

    public void setName(String name) {
        System.out.println("Setter method");

        this.name = name;
    }
}
