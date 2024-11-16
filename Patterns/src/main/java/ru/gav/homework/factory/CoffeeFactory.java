package ru.gav.homework.factory;

import ru.gav.homework.factory.entity.Coffee;

public abstract class CoffeeFactory {
    public void makeCoffee(){
        Coffee coffee = prepare();
        coffee.make();
    }

    public abstract Coffee prepare();

}

