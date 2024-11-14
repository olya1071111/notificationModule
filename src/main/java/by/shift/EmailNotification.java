package by.shift;

public class EmailNotification implements Notification {
    public void send() {
        System.out.println("email");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }
}