package by.shift.sender;

import by.shift.model.Email;
import by.shift.response.NotificationResponse;
import lombok.extern.slf4j.Slf4j;

import static by.shift.response.NotificationResult.OK;

@Slf4j
public class EmailNotificationCallback implements NotificationCallback<Email> {
    @Override
    public void process(Email notification, NotificationResponse notificationResponse) {

        if (notificationResponse.getNotificationResult() == OK) {
            System.out.println(notificationResponse.getResponseMessage());
            log.info("статус ОК");
        } else {
            log.error("что-то пошло не так");
        }
    }
}
