package com.spring.core.DIBasedSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*Without using Spring Framework
        String message = "This is an message";
        EmailService e =  new EmailService();
        MessageSender messSender = new MessageSender(e);
        messSender.sendMessage(message);*/

        String message = "hello";
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = app.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
