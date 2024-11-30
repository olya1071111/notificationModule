package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Notification;

public interface NotificationSender<T extends Notification> {

    void send(T notification);

    NotificationType getType();
}
