package com.sparta.shapes;

import java.util.Random;

public class ShapeDriver {
    public static void main(String[] args) {
        //Circle circle = new Circle(3);
        //Square square = new Square(45);

        //System.out.println(circle);
        //System.out.println(square);

        Random r = new Random();

        Shape[] s = new Shape[5];

        for (int i=0; i<5;i++){
            if (r.nextDouble(1) < 0.5)
                s[i] = new Circle(r.nextDouble());

            else
                s[i] = new Square(r.nextDouble());
        }
        for (Shape sh: s)
            System.out.println(sh + " " + s.equals(sh));
    }
}
