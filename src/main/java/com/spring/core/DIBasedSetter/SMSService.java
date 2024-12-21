package com.spring.core.DIBasedSetter;

import org.springframework.stereotype.Component;

@Component("smsService")

public class SMSService implements MessageService {
    public void sendMessage(String message){
        System.out.println(message + " from SMSService");
    }
}
