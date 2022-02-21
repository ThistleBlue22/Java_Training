package com.sparta.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.drive();

        Vehicle h = new Helicopter();
        h.drive();
    }
}
