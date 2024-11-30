package by.shift;

import by.shift.exception.ExceptionHandler;
import by.shift.model.Email;
import by.shift.model.Notification;
import by.shift.model.Sms;
import by.shift.model.Telegram;
import by.shift.resolver.LoggerNotificationResolver;
import by.shift.resolver.NotificationResolver;
import by.shift.sender.EmailNotificationSender;
import by.shift.sender.NotificationSender;
import by.shift.sender.SmsNotificationSender;
import by.shift.sender.TelegramNotificationSender;

import java.util.ArrayList;
import java.util.List;

import static by.shift.NotificationType.*;


public class Main {

    public static void main(String[] args) {

        Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());
        List<NotificationSender> notifications = new ArrayList<>();

        notifications.add(new SmsNotificationSender());
        notifications.add(new TelegramNotificationSender());
        notifications.add(new EmailNotificationSender());


        NotificationResolver mapperNotification = new LoggerNotificationResolver(notifications);
        NotificationSender notificationSender = mapperNotification.getNotificationImpl(EMAIL);

        Notification notification = new Email.EmailBuilder()
                .setMessage("hello")
                .setAttachment("attach")
                .setReceiver("Ivan")
                .setSender("Petr")
                .setTopic("classic builder").emailReceiver("mail@mail.by").build();


        SenderFacade senderFacade = new SenderFacade();
        senderFacade.send(notificationSender, notification);


//        System.out.println(email.toString());

        Sms sms = Sms.newSmsBuilder()
                .setMessage("hello")
                .setReceiver("Ivan")
                .setSender("Petr").build();

        System.out.println(sms.toString());

    }
}
