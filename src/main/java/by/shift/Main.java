package by.shift;

import by.shift.exception.ExceptionHandler;
import by.shift.model.Email;
import by.shift.model.Notification;
import by.shift.model.Sms;
import by.shift.notificationFactory.DefaultNotificationFactory;
import by.shift.notificationFactory.NotificationFactory;
import by.shift.resolver.LoggerNotificationResolver;
import by.shift.resolver.NotificationResolver;
import by.shift.sender.NotificationCallback;
import by.shift.sender.EmailNotificationCallback;
import by.shift.sender.NotificationSender;

import java.util.List;


public class Main {

    public static void main(String[] args) {

        Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());

        NotificationFactory notificationFactory = new DefaultNotificationFactory();
        List<NotificationSender<? extends Notification>> notifications = notificationFactory.createNotifications();

        Notification notification = new Email.EmailBuilder()
                .setMessage("hello")
                .setAttachment("attach")
                .setReceiver("Ivan")
                .setSender("Petr")
                .setTopic("classic builder").emailReceiver("mail@mail.by").build();


        NotificationResolver mapperNotification = new LoggerNotificationResolver(notifications);
        NotificationSender notificationSender = mapperNotification.getNotificationImpl(notification);


        SenderFacade senderFacade = new SenderFacade();

        NotificationCallback notificationCallback = new EmailNotificationCallback();

//        NotificationResponse notificationResponse = senderFacade.send(notificationSender, notification);

//        System.out.println(notificationResponse.getNotificationResult() + ": " + notificationResponse.getResponseMessage());

//        System.out.println(email.toString());

        Sms sms = Sms.newSmsBuilder()
                .setMessage("hello")
                .setReceiver("Ivan")
                .setSender("Petr").build();

        System.out.println(sms.toString());

    }
}
