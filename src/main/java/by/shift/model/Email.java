package by.shift.model;

import lombok.Data;
import lombok.ToString;

@ToString
public class Email implements Notification {

    private final String topic;
    private final String sender;
    private final String receiver;
    private final String message;
    private final String attachment;

    private Email(EmailBuilder emailBuilder) {
        this.topic = emailBuilder.topic;
        this.sender = emailBuilder.sender;
        this.receiver = emailBuilder.receiver;
        this.message = emailBuilder.message;
        this.attachment = emailBuilder.attachment;
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

    public static class EmailBuilder {

        private String topic;
        private String sender;
        private String receiver;
        private String message;
        private String attachment;

        public Email build() {
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


    }


}

