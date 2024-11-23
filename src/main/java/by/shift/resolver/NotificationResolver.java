package by.shift.resolver;

import by.shift.NotificationSender;
import by.shift.NotificationType;

public interface NotificationResolver {

    NotificationSender getNotificationImpl(NotificationType notificationType);

}
