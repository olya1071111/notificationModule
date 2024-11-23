package by.shift;

import by.shift.model.Email;
import by.shift.model.Sms;
import by.shift.resolver.LoggerNotificationResolver;
import by.shift.resolver.NotificationResolver;

import java.util.ArrayList;
import java.util.List;

import static by.shift.NotificationType.*;


public class Main {

    public static void main(String[] args) {

        List<NotificationSender> notifications = new ArrayList<>();

        notifications.add(new SmsNotificationSender());
        notifications.add(new TelegramNotificationSender());
        notifications.add(new EmailNotificationSender());


        NotificationResolver mapperNotification = new LoggerNotificationResolver(notifications);
        NotificationSender notification = mapperNotification.getNotificationImpl(TELEGRAM);


        SenderFacade senderFacade = new SenderFacade();
        senderFacade.send(notification);

        Email email = new Email.EmailBuilder()
                .setMessage("hello")
                .setAttachment("attach")
                .setReceiver("Ivan")
                .setSender("Petr")
                .setTopic("classic builder").build();

        System.out.println(email.toString());

        Sms sms = Sms.newSmsBuilder()
                .setMessage("hello")
                .setReceiver("Ivan")
                .setSender("Petr").build();

        System.out.println(sms.toString());


    }



}
