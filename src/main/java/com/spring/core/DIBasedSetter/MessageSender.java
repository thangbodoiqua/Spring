package com.spring.core.DIBasedSetter;

import com.spring.core.DIBasedConstructor.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;
    private MessageService smsService;
/*    @Autowired
    public MessageSender(@Qualifier("smsService") MessageService messageService){
        this.messageService = messageService;
    }*/
    @Autowired
    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("SetterBasedDI 1 worked");
    }
    @Autowired
    public void setSmsService(MessageService smsService) {
        this.smsService = smsService;
        System.out.println("SetterBasedDI 2 worked");
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
