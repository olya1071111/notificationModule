package by.shift.resolver;

import by.shift.exception.NotFoundNotificationException;
import by.shift.sender.NotificationLogger;
import by.shift.model.Notification;
import by.shift.sender.NotificationSender;
import by.shift.NotificationType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggerNotificationResolver implements NotificationResolver {

    private final Map<NotificationType, NotificationSender<? extends Notification>> notificationMap;

    public LoggerNotificationResolver(List<NotificationSender<? extends Notification>> notifications) {

        this.notificationMap = new HashMap<>();

        for (NotificationSender<? extends Notification> notification : notifications) {
            notificationMap.put(notification.getType(), notification);
        }
    }

    public NotificationSender getNotificationImpl(Notification notification) {

        NotificationSender<? extends Notification> notificationSender = notificationMap.get(notification.getType());

        if (notificationSender == null) {
            throw new NotFoundNotificationException("Имплементация не найдена");
        }

        return new NotificationLogger(notificationSender);
    }
}
