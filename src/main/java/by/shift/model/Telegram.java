package by.shift.model;


import by.shift.exception.InvalidNotificationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telegram implements Notification {
    private String sender;
    private String receiver;
    private String message;
    private String attachment;

    public Telegram(TelegramBuilder telegramBuilder) {
        this.sender = telegramBuilder.sender;
        this.receiver = telegramBuilder.receiver;
        this.message = telegramBuilder.message;
        this.attachment = telegramBuilder.attachment;
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

    public String getAttachment() {
        return attachment;
    }

    public static class TelegramBuilder {

        private String sender;
        private String receiver;
        private String message;
        private String attachment;



        public Telegram build() {
//            validate();
            return new Telegram(this);
        }

        public TelegramBuilder setMessage(String message) {

            this.message = message;
            return this;
        }

        public TelegramBuilder setReceiver(String receiver) {

            this.receiver = receiver;
            return this;
        }

        public TelegramBuilder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public TelegramBuilder setAttachment(String attachment) {
            this.attachment = attachment;
            return this;
        }



    }

}
