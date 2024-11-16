package ru.gav.homework.factory.specifics;

import ru.gav.homework.factory.CoffeeFactory;
import ru.gav.homework.factory.entity.Coffee;
import ru.gav.homework.factory.entity.impl.Americano;

public class AmericanoFactory extends CoffeeFactory {
    @Override
    public Coffee prepare() {
        return new Americano();
    }
}
