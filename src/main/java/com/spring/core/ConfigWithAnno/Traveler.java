package com.spring.core.ConfigWithJav;

public class Traveler {
    private Vihicle v;
    public Traveler(Vihicle v){
        this.v = v;
    }
    public void startJourney(){
        this.v.move();
    }
}