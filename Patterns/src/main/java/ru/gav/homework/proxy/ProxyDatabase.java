package ru.gav.homework.proxy;

public class ProxyDatabase {
    private final String URL = "localhost:80/";

    private DataBase dataBase;

    public ProxyDatabase(DataBase dataBase){
        this.dataBase=dataBase;
    }

    public void connect(){
        dataBase.connect(URL);
    }
}
