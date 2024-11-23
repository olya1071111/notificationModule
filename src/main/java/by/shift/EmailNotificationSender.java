package by.shift;

public class EmailNotificationSender implements NotificationSender {
    public void send() {
        System.out.println("email");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }
}