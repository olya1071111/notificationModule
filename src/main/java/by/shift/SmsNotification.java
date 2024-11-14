package by.shift;

public class SmsNotification implements Notification{
    @Override
    public void send() {
        System.out.println("sms");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }
}
