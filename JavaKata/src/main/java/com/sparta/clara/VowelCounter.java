package com.sparta.clara;

public class VowelCounter {
    public static void main(String[] args) {
        VowelCounter vc = new VowelCounter();
        String string = "SOLID TIME YAS";

        System.out.println(vc.VowelCounterString(string));

    }

    public int VowelCounterString(String string) {
        String lowerString = string.toLowerCase();

        String[] newStringArray = lowerString.split("");

        int counter = 0;

        for (String s:newStringArray){
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o")|| s.equals("u")){
                counter += 1;
            }

        }

        return counter;
    }
}
