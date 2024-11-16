package ru.gav.homework.proxy;

public class DataBase {

    private String name;

    public DataBase(String name){
        this.name=name;
    }

    public void connect(String URL) {
        System.out.println("Попытка подключения");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Подключение успешно по адресу %s%s", URL, name);
    }
}
