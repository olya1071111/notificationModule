package by.shift;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationResolver {
    private final Map<NotificationType, Notification> notificationMap;

    public NotificationResolver(List<Notification> notifications) {

        this.notificationMap = new HashMap<>();

        for (Notification notification : notifications) {
            notificationMap.put(notification.getType(), notification);
        }
    }

    public Notification getNotificationImpl(NotificationType notificationType) {
        return notificationMap.get(notificationType);
    }
}
