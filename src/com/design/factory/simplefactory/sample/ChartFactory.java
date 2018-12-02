package com.design.factory.simplefactory.sample;

public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if ("histogram".equalsIgnoreCase(type)) {
            chart = new HistogramChart();
        } else if ("pie".equalsIgnoreCase(type)) {
            chart = new PieChart();
        } else if ("line".equalsIgnoreCase(type)) {
            chart = new LineChart();
        }
        return chart;

    }
}
