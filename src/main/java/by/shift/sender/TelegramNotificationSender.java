package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Telegram;
import by.shift.response.NotificationResponse;

import static by.shift.response.NotificationResult.OK;

public class TelegramNotificationSender implements NotificationSender<Telegram> {
    public NotificationResponse send(Telegram notification) {

        System.out.println(notification.getSender() + " отправил " + notification.getReceiver() +
                " сообщение " + notification.getMessage() + " на емаил " + notification.getAttachment());
        return new NotificationResponse(OK, "Telegram успещно отправлен");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }

    @Override
    public void sendAsync(Telegram notification, NotificationCallback<Telegram> notificationCallback) {

    }
}
