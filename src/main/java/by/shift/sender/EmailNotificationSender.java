package by.shift.sender;

import by.shift.NotificationType;
import by.shift.model.Email;

public class EmailNotificationSender implements NotificationSender<Email> {
    public void send(Email notification) {

        System.out.println(notification.getSender() + " отправил " + notification.getReceiver() +
                " сообщение " + notification.getMessage() + " на емаил " + notification.getEmailReceiver());
    }

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }
}