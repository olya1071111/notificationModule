package by.shift;

public class TelegramNotification implements Notification{
    public void send() {
        System.out.println("telegram");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }
}
