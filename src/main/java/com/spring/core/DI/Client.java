package com.spring.core.DI;

public class Client {
    public static void main(String[] args) {
        String message = "This is an message";
        EmailService emailService =  new EmailService();
        MessageSender messSender = new MessageSender(emailService);
        // Điều này thể hiện rằng smsSender đang phụ thuộc vào smsService
        messSender.sendMessage(message);
    }
}
