package com.sparta.basics;

public class StringTesting {
    public static void main(String[] args) {
        String name = "Clara Porteous";
        System.out.println("The persons name is: " + name);
        System.out.println("Their surname is: " + name.substring(6));

        String surname = name.substring(6); // surname referenced the name.substring(6) command and the original String

        System.out.printf("Their surname is %s", surname);

        String firstName = new String(name.substring(0,6));

    }
}
