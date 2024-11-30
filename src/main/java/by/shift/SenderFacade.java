package by.shift;


import by.shift.model.Notification;
import by.shift.sender.NotificationSender;

public class SenderFacade {

    public void send(NotificationSender notificationSender, Notification notification) {
        notificationSender.send(notification);
    }

}
