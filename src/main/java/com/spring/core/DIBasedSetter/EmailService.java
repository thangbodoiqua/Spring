package com.spring.core.DIBasedSetter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("emailService")
@Primary
public class EmailService implements MessageService {
    public void sendMessage(String message){
        System.out.println(message + " from EmailService");
    }
}
