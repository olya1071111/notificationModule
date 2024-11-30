package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Telegram;

public class TelegramNotificationSender implements NotificationSender<Telegram> {
    public void send(Telegram notification) {

        System.out.println(notification.getSender() + " отправил " + notification.getReceiver() +
                " сообщение " + notification.getMessage() + " на емаил " + notification.getAttachment());
    }

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }
}
