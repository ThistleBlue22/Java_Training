package com.sparta.basics;

public class JavaBasics {
    public static void main(String[] args) {
        int myIndex = 0;
        // The 8 types of primitive types: int, float, double, short, long, byte, char and boolean
        // String is not a primitive type, it is a class

        String name = "Clara Oswin Oswald"; // String literal

        // int, byte, short and long can hold whole numbers
        // float and double hold real numbers, float holds single point and double holds double point floating numbers

        float fNumber = 34.43f;
        double dNumber = 34.43;

        String anotherName = "Clara Oswin Oswald"; // Pulled from the String pool, works because Strings are IMMUTABLE

        anotherName.toUpperCase(); // Does nothing
        String oneMoreName = anotherName.toUpperCase(); // Changes the String in anotherName to upper case

        System.out.println(name);
        System.out.println(anotherName);
        System.out.println(oneMoreName);
        System.out.println("This is " + name);
        System.out.println("UPPER CASE: " + oneMoreName);
        // boolean is a true of false

        String newString = new String("Clara Oswin Oswald");

        if (name.equals(newString))
            System.out.println("Hi");

        boolean isTrue = true;
        boolean isFalse = false;
    }
}
