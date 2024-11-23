package by.shift;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificationLogger implements NotificationSender {

    private final NotificationSender notificationSender;

    public NotificationLogger(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void send() {
        log.info("Начало отправки сообщения " + notificationSender.getType());
        notificationSender.send();
        log.info("Отправлено сообщение " + notificationSender.getType());
    }

    @Override
    public NotificationType getType() {
        return notificationSender.getType();
    }
}
