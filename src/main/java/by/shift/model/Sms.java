package by.shift.model;

import by.shift.NotificationType;
import lombok.ToString;

@ToString
public class Sms implements Notification {

    private String sender;
    private String receiver;
    private String message;

    public static SmsBuilder newSmsBuilder() {
        return new Sms().new SmsBuilder();
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
        return NotificationType.SMS;
    }

    public class SmsBuilder {

        private SmsBuilder() {
        }

        public Sms build() {
            return Sms.this;
        }

        public SmsBuilder setMessage(String message) {
            Sms.this.message = message;
            return this;
        }

        public SmsBuilder setReceiver(String receiver) {
            Sms.this.receiver = receiver;
            return this;
        }

        public SmsBuilder setSender(String sender) {
            Sms.this.sender = sender;
            return this;
        }
    }
}
