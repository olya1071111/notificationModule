package by.shift;


import by.shift.model.Notification;
import by.shift.response.NotificationResponse;
import by.shift.sender.NotificationSender;

public class SenderFacade {

    public NotificationResponse send(NotificationSender notificationSender, Notification notification) {
        return notificationSender.send(notification);
    }

}
