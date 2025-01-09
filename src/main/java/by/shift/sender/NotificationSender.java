package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Notification;
import by.shift.response.NotificationResponse;

public interface NotificationSender<T extends Notification> {

    NotificationResponse send(T notification);

    NotificationType getType();

    void sendAsync(T notification, NotificationCallback<T> notificationCallback);
}
