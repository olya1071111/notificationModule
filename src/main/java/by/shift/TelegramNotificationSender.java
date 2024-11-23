package by.shift;

public class TelegramNotificationSender implements NotificationSender {
    public void send() {
        System.out.println("telegram");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }
}
