package by.shift.resolver;

import by.shift.sender.NotificationSender;
import by.shift.NotificationType;

public interface NotificationResolver {

    NotificationSender getNotificationImpl(NotificationType notificationType);

}
