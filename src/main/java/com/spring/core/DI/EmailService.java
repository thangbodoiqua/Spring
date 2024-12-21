package com.spring.core.DI;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService {
    public void sendMessage(String message){
        System.out.println(message + " from EmailService");
    }
}
