package by.shift.model;

public class Telegram implements Notification {
    private String sender;
    private String receiver;
    private String message;
    private String attachment;

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

}
