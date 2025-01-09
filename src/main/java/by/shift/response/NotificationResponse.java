package by.shift.response;

import lombok.Getter;

@Getter
public class NotificationResponse {

    private final NotificationResult notificationResult;
    private final String responseMessage;
    private Throwable exception;

    public NotificationResponse(NotificationResult notificationResult, String responseMessage) {
        this.notificationResult = notificationResult;
        this.responseMessage = responseMessage;
    }
}
