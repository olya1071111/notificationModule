package by.shift.resolver;

import by.shift.exception.NotFoundNotificationException;
import by.shift.model.Notification;
import by.shift.sender.NotificationSender;
import by.shift.NotificationType;

public interface NotificationResolver {

    NotificationSender getNotificationImpl(Notification notification) throws NotFoundNotificationException;

}
