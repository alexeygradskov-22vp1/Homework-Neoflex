package ru.gav.homework.factory.entity.impl;

import ru.gav.homework.factory.entity.Coffee;

public class Espresso implements Coffee {
    @Override
    public void make() {
        System.out.println("Эспрессо");
    }
}
