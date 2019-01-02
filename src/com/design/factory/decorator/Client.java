package com.design.factory.decorator;

public class Client {
    public static void main(String[] args) {
        Component component, componentSb;
        component = new Window();
        componentSb = new ScrollBarDecorator(component);
        componentSb.display();
    }
}
