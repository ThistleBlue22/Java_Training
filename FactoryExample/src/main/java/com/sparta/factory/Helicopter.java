package com.sparta.factory;

public class Helicopter implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Start the engine and take off");
    }
}
