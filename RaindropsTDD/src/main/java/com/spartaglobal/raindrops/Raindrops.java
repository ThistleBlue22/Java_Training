package com.spartaglobal.raindrops;

public class Raindrops {
    public static String plingPlangPlong(Integer i){
        StringBuilder sb = new StringBuilder();

        if (i % 3 == 0){
            sb.append("Pling");
        }
        if (i % 5 == 0){
            sb.append("Plang");
        }
        if (i % 7 == 0){
            sb.append("Plong");
        }
        if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) sb.append(i);

        return sb.toString();
    }
}
