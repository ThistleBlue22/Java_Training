package com.spartaglobal.configtest;

public class ConfigTester {
    public static void main(String[] args) {
        ConfigTester configTester = new ConfigTester();
        System.out.println(configTester.getMessage("Clara"));
    }
    public String getMessage(String name){
        return "Welcome to Sparta, " + name + "!";
    }
}
