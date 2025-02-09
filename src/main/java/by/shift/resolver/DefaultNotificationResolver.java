package by.shift.resolver;

import by.shift.model.Notification;
import by.shift.sender.NotificationSender;
import by.shift.NotificationType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultNotificationResolver implements NotificationResolver {
    private final Map<NotificationType, NotificationSender> notificationMap;

    public DefaultNotificationResolver(List<NotificationSender> notifications) {

        this.notificationMap = new HashMap<>();

        for (NotificationSender notification : notifications) {
            notificationMap.put(notification.getType(), notification);
        }
    }

    public NotificationSender getNotificationImpl(Notification notification) {

        return notificationMap.get(notification.getType());
    }
}
