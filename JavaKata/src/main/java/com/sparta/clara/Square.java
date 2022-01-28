package com.sparta.clara;

public class Square extends Shape{

    @Override
    public double getArea(double area) {
        double size =  area * area;
        double round = Math.round(size * 100d) / 100d;
        // https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java

        return round;
    }
}
