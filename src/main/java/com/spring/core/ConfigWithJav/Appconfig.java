package com.spring.core.ConfigWithJav;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    public Vihicle car(){
        return new Car();
    }
    @Bean
    public Vihicle bike(){
        return new Bike();
    }
    @Bean
    public Vihicle cycle(){
        return new Cycle();
    }
    @Bean
    public Traveler traveler(){
        return new Traveler(new Bike());
    }
}
