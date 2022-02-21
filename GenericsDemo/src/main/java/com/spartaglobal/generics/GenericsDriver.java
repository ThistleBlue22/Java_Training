package com.spartaglobal.generics;

public class GenericsDriver {
    public static void main(String[] args) {
        ObjectCache<String> cache = new ObjectCache<>();

        cache.setTheString("Sparta Global");
        System.out.println(cache.getTheString());
    }
}
