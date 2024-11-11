package com.spring.core.ConfigWithAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {
    private Vihicle v;
    @Autowired
    public Traveler(Vihicle v){
        this.v = v;
    }
    public void startJourney(){
        this.v.move();
    }
}
