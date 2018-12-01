package com.design.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        Product product = ProductFactory.getProduct("A");
        product.methodSame();
        product.methodDiff();

        product = ProductFactory.getProduct("B");
        product.methodSame();
        product.methodDiff();

    }
}
