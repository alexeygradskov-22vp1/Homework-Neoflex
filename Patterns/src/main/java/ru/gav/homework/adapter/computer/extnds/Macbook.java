package ru.gav.homework.adapter.computer.extnds;

import ru.gav.homework.adapter.Adapter;
import ru.gav.homework.adapter.computer.Computer;

public class Macbook extends Computer {
    private final String CHECK_SECURITY = "Проверка безопасности устройства";
    private final String SIGNATURE = "\nЗаписано с помощью MacBook";

    @Override
    public void writeOnDevice(String data) {
        super.adapter.write(data.concat(SIGNATURE));
    }

    @Override
    public void connect(Adapter adapter) {
        System.out.println(CHECK_SECURITY);
        super.adapter = adapter;
    }
}
