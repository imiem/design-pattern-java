package com.design.factory.factorymethod.sample;

public class DatebaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DatebaseLogger();
    }
}
