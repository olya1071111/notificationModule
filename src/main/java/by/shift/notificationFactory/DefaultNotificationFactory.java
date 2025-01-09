package by.shift.notificationFactory;

import by.shift.model.Notification;
import by.shift.sender.EmailNotificationSender;
import by.shift.sender.NotificationSender;
import by.shift.sender.SmsNotificationSender;
import by.shift.sender.TelegramNotificationSender;

import java.util.ArrayList;
import java.util.List;

public class DefaultNotificationFactory implements NotificationFactory {
    @Override
    public List<NotificationSender<? extends Notification>> createNotifications() {

        List<NotificationSender<? extends Notification>> notifications = new ArrayList<>();

        notifications.add(new SmsNotificationSender());
        notifications.add(new TelegramNotificationSender());
        notifications.add(new EmailNotificationSender());

        return notifications;
    }
}
