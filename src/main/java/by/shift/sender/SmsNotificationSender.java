package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Sms;

public class SmsNotificationSender implements NotificationSender<Sms> {
    @Override
    public void send(Sms notification) {
        System.out.println(notification.getSender() + " отправил " + notification.getReceiver() +
                " сообщение " + notification.getMessage());
    }

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }
}
