package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Email;
import by.shift.model.Notification;
import by.shift.response.NotificationResponse;
import by.shift.sender.NotificationSender;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificationLogger implements NotificationSender {

    private final NotificationSender notificationSender;

    public NotificationLogger(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public NotificationResponse send(Notification notification) {

        log.info("Начало отправки сообщения " + notification.getType());
        NotificationResponse notificationResponse = notificationSender.send(notification);
        log.info("Отправлено сообщение " + notification.getType());

        return notificationResponse;
    }

    @Override
    public NotificationType getType() {
        return notificationSender.getType();
    }

    @Override
    public void sendAsync(Notification notification, NotificationCallback notificationCallback) {

    }
}
