package by.shift.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {

        if (e instanceof InvalidNotificationException) {
            log.error(e.getMessage(), e);
            System.exit(0);
        }

        if (e instanceof NotFoundNotificationException) {
            log.error(e.getMessage(), e);
            System.exit(0);
        }

        log.error("Неизвестная ошибка", e);

    }
}
