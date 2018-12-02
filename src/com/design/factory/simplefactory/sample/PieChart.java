package com.design.factory.simplefactory.sample;

public class PieChart implements Chart {
    public PieChart() {
        System.out.println("Create PieChart");
    }

    @Override
    public void display() {
        System.out.println("Display PieChart");
    }
}
