package by.shift.exception;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {

        if (e instanceof InvalidNotificationException) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
    }
}
