package com.design.factory.simplefactory.sample;

public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
