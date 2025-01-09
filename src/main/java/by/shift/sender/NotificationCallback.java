package by.shift.sender;

import by.shift.model.Notification;
import by.shift.response.NotificationResponse;

public interface NotificationCallback<T extends Notification> {

    void process(T notification, NotificationResponse notificationResponse);
}
