package com.spring.core.ConfigWithAnno;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vihicle {
    @Override
    public void move() {
        System.out.println("Car is moveing");
    }
}
