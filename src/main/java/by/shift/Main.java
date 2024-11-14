package by.shift;

import java.util.ArrayList;
import java.util.List;

import static by.shift.NotificationType.*;


public class Main {

    public static void main(String[] args) {

        List<Notification> notifications = new ArrayList<>();

        notifications.add(new SmsNotification());
        notifications.add(new TelegramNotification());
        notifications.add(new EmailNotification());


        NotificationResolver mapperNotification = new NotificationResolver(notifications);

        Notification notification = mapperNotification.getNotificationImpl(TELEGRAM);

        notification.send();

    }

}
