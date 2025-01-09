package by.shift.model;

import by.shift.NotificationType;

public interface Notification {
    String getMessage();
    String getReceiver();
    String getSender();

    NotificationType getType();

}
