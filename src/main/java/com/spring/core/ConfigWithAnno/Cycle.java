package com.spring.core.ConfigWithAnno;

import org.springframework.stereotype.Component;

@Component("cycle")
public class Cycle implements Vihicle {
    @Override
    public void move() {
        System.out.println("Cycle is moveing");
    }
}
