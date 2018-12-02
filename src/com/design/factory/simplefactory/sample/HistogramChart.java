package com.design.factory.simplefactory.sample;

public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("Create HistogramChart");
    }

    @Override
    public void display() {
        System.out.println("Display HistogramChart");
    }
}
