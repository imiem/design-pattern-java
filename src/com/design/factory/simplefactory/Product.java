package com.design.factory.simplefactory;

public abstract class Product {
    public void methodSame() {
        System.out.println("Same");
    }

    public abstract void methodDiff();
}
