package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(Appconfig.class);
        Car car = app.getBean(Car.class);
        car.move();
        Traveler tr = app.getBean(Traveler.class);
        tr.startJourney();
    }
}
