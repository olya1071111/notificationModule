package by.shift.model;

import by.shift.NotificationType;
import by.shift.exception.InvalidNotificationException;
import lombok.ToString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ToString
public class Email implements Notification {

    private final String topic;
    private final String sender;
    private final String receiver;
    private final String message;
    private final String attachment;
    private final String emailReceiver;

    private Email(EmailBuilder emailBuilder) {
        this.topic = emailBuilder.topic;
        this.sender = emailBuilder.sender;
        this.receiver = emailBuilder.receiver;
        this.message = emailBuilder.message;
        this.attachment = emailBuilder.attachment;
        this.emailReceiver = emailBuilder.emailReceiver;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getReceiver() {
        return receiver;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

    public String getTopic() {
        return topic;
    }

    public String getAttachment() {
        return attachment;
    }

    public String getEmailReceiver() {
        return emailReceiver;
    }

    public static class EmailBuilder {

        private String topic;
        private String sender;
        private String receiver;
        private String message;
        private String attachment;
        public String emailReceiver;

        private static final String REGEX_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        public Email build() {
            validate();
            return new Email(this);
        }

        public EmailBuilder setMessage(String message) {

            this.message = message;
            return this;
        }

        public EmailBuilder setReceiver(String receiver) {

            this.receiver = receiver;
            return this;
        }

        public EmailBuilder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public EmailBuilder setAttachment(String attachment) {
            this.attachment = attachment;
            return this;
        }

        public EmailBuilder setTopic(String topic) {
            this.topic = topic;
            return this;
        }

        public EmailBuilder emailReceiver(String emailReceiver) {
            this.emailReceiver = emailReceiver;
            return this;
        }

        private void validate() {

            Pattern pattern = Pattern.compile(REGEX_EMAIL);
            Matcher matcher = pattern.matcher(this.emailReceiver);
            if (!matcher.matches()) {
                throw new InvalidNotificationException("Невалидный емайл");
            }

            checkString(this.topic, "тема");
            checkString(this.sender, "отправитель");
            checkString(this.message, "сообщение");
            checkString(this.attachment, "приложение");
        }

        private void checkString(String field, String fieldName) {
            if (field.isEmpty()) {
                throw new InvalidNotificationException("Пустое поле " + fieldName);
            }
        }

    }


}

