package by.shift.resolver;

import by.shift.NotificationLogger;
import by.shift.NotificationSender;
import by.shift.NotificationType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggerNotificationResolver implements NotificationResolver {

    private final Map<NotificationType, NotificationSender> notificationMap;

    public LoggerNotificationResolver(List<NotificationSender> notifications) {

        this.notificationMap = new HashMap<>();

        for (NotificationSender notification : notifications) {
            notificationMap.put(notification.getType(), notification);
        }
    }

    public NotificationSender getNotificationImpl(NotificationType notificationType) {

        return new NotificationLogger(notificationMap.get(notificationType));
    }
}
