package by.shift.notificationFactory;

import by.shift.model.Notification;
import by.shift.sender.NotificationSender;

import java.util.List;

public interface NotificationFactory {
    List<NotificationSender<? extends Notification>> createNotifications();
}
