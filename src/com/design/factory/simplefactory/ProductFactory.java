package com.design.factory.simplefactory;

public class ProductFactory {
    public static Product getProduct(String args) {
        Product product = null;
        if (("A").equalsIgnoreCase(args)) {
            product = new ConcreteProductA();
        } else if ("B".equalsIgnoreCase(args)) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
