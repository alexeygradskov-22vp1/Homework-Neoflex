package ru.gav.homework.adapter.device.impl;

import ru.gav.homework.adapter.device.Device;

public class Card implements Device {
    private byte[] data;

    public byte[] read() {
        return data;
    }

    public void write(byte[] data) {
        this.data = data;
    }
}
