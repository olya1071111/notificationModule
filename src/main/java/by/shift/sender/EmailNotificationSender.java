package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Email;
import by.shift.response.NotificationResponse;

import static by.shift.response.NotificationResult.OK;

public class EmailNotificationSender implements NotificationSender<Email> {
    public NotificationResponse send(Email notification) {

        System.out.println(notification.getSender() + " отправил " + notification.getReceiver() +
                " сообщение " + notification.getMessage() + " на емаил " + notification.getEmailReceiver());
        return new NotificationResponse(OK, "Email успешно отправлен");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendAsync(Email notification, NotificationCallback<Email> notificationCallback) {

        Thread thread = new Thread(() -> {
            NotificationResponse send = send(notification);
            notificationCallback.process(notification, send);
        });

        thread.start();
    }
}