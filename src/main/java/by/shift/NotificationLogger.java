package by.shift;

import by.shift.model.Notification;
import by.shift.sender.NotificationSender;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificationLogger implements NotificationSender {

    private final NotificationSender notificationSender;

    public NotificationLogger(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void send(Notification notification) {
        log.info("Начало отправки сообщения " + notificationSender.getType());
        notificationSender.send(notification);
        log.info("Отправлено сообщение " + notificationSender.getType());
    }

    @Override
    public NotificationType getType() {
        return notificationSender.getType();
    }
}
