package ru.gav.homework.adapter.device;

public interface Device {
    byte[] read();

    void write(byte[] data);
}
