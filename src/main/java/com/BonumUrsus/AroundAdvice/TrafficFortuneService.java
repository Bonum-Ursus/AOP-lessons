package com.BonumUrsus.AroundAdvice;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {
    public String getFortune(){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Expect heavy traffic this morning.";
    }
    public String getFortune(Boolean tripWire){
        if(tripWire) {
            throw new RuntimeException("Exception message: Highway closed");
        }else
            return getFortune();
    }
}
