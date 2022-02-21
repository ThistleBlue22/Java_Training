package com.sparta.factory;

public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Start the car and put it in gear");
    }
}
