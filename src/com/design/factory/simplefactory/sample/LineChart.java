package com.design.factory.simplefactory.sample;

public class LineChart implements Chart{

    public LineChart() {
        System.out.println("Create LineChart");
    }

    @Override
    public void display() {
        System.out.println("Display LineChart");
    }
}
