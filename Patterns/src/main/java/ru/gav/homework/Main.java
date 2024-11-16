package ru.gav.homework;

import ru.gav.homework.adapter.Adapter;
import ru.gav.homework.adapter.CardAdapter;
import ru.gav.homework.adapter.computer.Computer;
import ru.gav.homework.adapter.computer.extnds.Macbook;
import ru.gav.homework.adapter.device.Device;
import ru.gav.homework.adapter.device.impl.Card;
import ru.gav.homework.factory.CoffeeFactory;
import ru.gav.homework.factory.specifics.AmericanoFactory;
import ru.gav.homework.factory.specifics.EspressoFactory;
import ru.gav.homework.proxy.DataBase;
import ru.gav.homework.proxy.ProxyDatabase;
import ru.gav.homework.singleton.LoggerSingleton;
import ru.gav.homework.singleton.TestClass;

public class Main {
    public static void main(String[] args) {
        // Singleton
        LoggerSingleton logger = LoggerSingleton.getInstance();
        TestClass testClass = new TestClass();
        logger.log(testClass, "Some Info");

        //Factory
        CoffeeFactory coffeeFactory = new AmericanoFactory();
        coffeeFactory.makeCoffee();
        coffeeFactory = new EspressoFactory();
        coffeeFactory.makeCoffee();

        //Adapter
        Device device = new Card();
        Adapter adapter = new CardAdapter(device);
        Computer computer = new Macbook();
        computer.connect(adapter);
        computer.writeOnDevice("Привет!");
        computer.display();

        //Proxy
        DataBase dataBase = new DataBase("patterns");
        ProxyDatabase proxyDatabase = new ProxyDatabase(dataBase);
        proxyDatabase.connect();
    }
}