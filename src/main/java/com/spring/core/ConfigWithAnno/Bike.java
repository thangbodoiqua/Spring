package com.spring.core.ConfigWithAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bike")
@Primary
public class Bike implements Vihicle {
    @Override
    public void move() {
        System.out.println("Bike is moveing");
    }
}
