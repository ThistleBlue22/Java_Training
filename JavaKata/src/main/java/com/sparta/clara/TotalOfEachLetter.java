package com.sparta.clara;

import java.util.ArrayList;

public class TotalOfEachLetter {
    public static void main(String[] args) {
        TotalOfEachLetter toel = new TotalOfEachLetter();

        System.out.println(toel.LetterCounter("This is a string of characters"));
    }

    public ArrayList<Integer> LetterCounter(String words){
        ArrayList<Integer> letterCount = new ArrayList<>();

        words = words.strip();

        String[] newStringList = words.split("");

        for (String s: newStringList){
            if (s.equals(" ")){
                System.out.println(true);
            }
        }



        return letterCount;
    }
}
