package com.design.factory.factorymethod.sample;

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("FileLogger write log");
    }
}
