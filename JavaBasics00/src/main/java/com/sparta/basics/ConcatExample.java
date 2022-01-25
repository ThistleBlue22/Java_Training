package com.sparta.basics;

public class ConcatExample {
    public static void main(String[] args) {
        String[] names = {"Aiden", "Alvaro", "Andrew", "Antony", "Autumn",
                "Ben", "Brandon", "Conor", "Dale"};

        StringBuilder sb = new StringBuilder(); // More efficient to concat strings and arrays

        for (String name: names) {
            sb.append(name); // Appends the name value
            sb.append(", "); // Appends the comma and a space
        }
    }
}
