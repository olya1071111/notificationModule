package by.shift;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void send() {
        System.out.println("sms");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }
}
