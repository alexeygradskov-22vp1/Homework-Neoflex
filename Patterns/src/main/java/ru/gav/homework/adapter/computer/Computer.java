package ru.gav.homework.adapter.computer;

import ru.gav.homework.adapter.Adapter;

import java.util.Objects;

public abstract class Computer {
    private final String NO_DATA = "Пустая карта";

    protected Adapter adapter;

    public void display(){
        System.out.println(getDataFromAdapter());
    }

    public abstract void writeOnDevice(String data);

    private String getDataFromAdapter(){
        if (adapter.read().isEmpty()) {
            return NO_DATA;
        }else return adapter.read();
    }

    public abstract void connect(Adapter adapter);
}
