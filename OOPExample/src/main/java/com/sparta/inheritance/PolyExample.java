package com.sparta.inheritance;

import java.util.ArrayList;
import com.sparta.shapes.Circle;

public class PolyExample {
    public static void main(String[] args) {
        ArrayList<Object> objList = new ArrayList<>();

        objList.add("Hello");
        objList.add(new Customer("Neil", "Weightman", 1234));
        objList.add(new Circle(12.0));

        System.out.println(objList);

    }
}
