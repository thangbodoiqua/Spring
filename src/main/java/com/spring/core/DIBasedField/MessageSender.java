package com.spring.core.DIBasedField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;
    @Autowired
    @Qualifier("smsService")
    private MessageService smsService;

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
