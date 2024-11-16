package ru.gav.homework.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.concurrent.Semaphore;

public final class LoggerSingleton {
    private volatile static LoggerSingleton loggerSingleton;
    private static volatile Semaphore semaphore = new Semaphore(1);

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (Objects.isNull(loggerSingleton) && semaphore.tryAcquire()) {
            loggerSingleton = new LoggerSingleton();
            semaphore.release();
            return loggerSingleton;
        } else {
            return loggerSingleton;
        }
    }

    public <T> void log(Object obj, String info) {
        String localDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.printf("Log Info: %s - %s - %s%n", localDate, obj.getClass().getSimpleName(), info);
    }
}
