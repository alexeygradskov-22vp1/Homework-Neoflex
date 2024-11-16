package ru.gav.homework.adapter;

import ru.gav.homework.adapter.device.Device;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class CardAdapter implements Adapter {

    private Device device;

    public CardAdapter(Device device) {
        this.device = device;
    }

    @Override
    public String read() {
        return new String(
                Objects.isNull(device.read()) ? new byte[0] : device.read(),
                StandardCharsets.UTF_8);
    }

    @Override
    public void write(String data) {
        device.write(data.getBytes(StandardCharsets.UTF_8));
    }
}
