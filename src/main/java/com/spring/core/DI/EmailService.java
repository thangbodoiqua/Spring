package com.spring.core.DI;

public class EmailService implements MessageService {
    public void sendMessage(String message){
        System.out.println(message);
    }
}
