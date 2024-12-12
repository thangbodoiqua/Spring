package com.spring.core.DI;

public class SMSService implements MessageService{
    public void sendMessage(String message){
        System.out.println(message);
    }
}
