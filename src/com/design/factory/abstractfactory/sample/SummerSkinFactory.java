package com.design.factory.abstractfactory.sample;

public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
