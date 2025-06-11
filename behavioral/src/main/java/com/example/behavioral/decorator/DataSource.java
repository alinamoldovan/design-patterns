package com.example.behavioral.decorator;

public interface  DataSource {
    void writeData(String data);

    String readData();

    void close();

}
