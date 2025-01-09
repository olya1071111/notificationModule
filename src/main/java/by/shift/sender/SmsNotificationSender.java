package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Sms;
import by.shift.response.NotificationResponse;

import static by.shift.response.NotificationResult.OK;

public class SmsNotificationSender implements NotificationSender<Sms> {
    @Override
    public NotificationResponse send(Sms notification) {
        System.out.println(notification.getSender() + " отправил " + notification.getReceiver() +
                " сообщение " + notification.getMessage());
        return new NotificationResponse(OK,"Sms успещно отправлен");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

    @Override
    public void sendAsync(Sms notification, NotificationCallback<Sms> notificationCallback) {

    }
}
