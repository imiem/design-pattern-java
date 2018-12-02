package com.design.factory.factorymethod.sample;

public class DatebaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("DatebaseLogger write log");
    }
}
