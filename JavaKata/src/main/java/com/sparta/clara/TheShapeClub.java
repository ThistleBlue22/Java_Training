package com.sparta.clara;

public class TheShapeClub {
    public static void main(String[] args) {
        TheShapeClub tSC = new TheShapeClub();
        System.out.println(tSC.shapeAndString("Square", 45.6));
    }


    public String shapeAndString(String shape, double size){

        if (shape.equals("Square")){
            Square square = new Square();
            return "The shape " + shape + " has the area of " + square.getArea(size);
        }
        else if (shape.equals("Circle")){
            Circle circle = new Circle();
            return "The shape " + shape + " has the area of " + circle.getArea(size);
        }
        else{
            return "Please specify a Circle or a Square";
        }
    }
}
