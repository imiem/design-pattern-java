package com.design.factory.abstractfactory.sample;

public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory = new SpringSkinFactory();
        Button button = skinFactory.createButton();
        TextField textField = skinFactory.createTextField();
        button.display();
        textField.display();

        skinFactory = new SummerSkinFactory();
        button = skinFactory.createButton();
        textField = skinFactory.createTextField();
        button.display();
        textField.display();

    }
}
