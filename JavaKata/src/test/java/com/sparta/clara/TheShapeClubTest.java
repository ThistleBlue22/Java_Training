package com.sparta.clara;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheShapeClubTest {
    // String Format
    // The shape (type) has the area of (size)
    TheShapeClub theShapeClub = new TheShapeClub();

    @Test
    public void Square() {
        String expected = "The shape Square has the area of 2079.36";
        String actual = theShapeClub.shapeAndString("Square", 45.6);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Circle() {
        String expected = "The shape Circle has the area of 6532.5";
        String actual = theShapeClub.shapeAndString("Circle", 45.6);
        Assertions.assertEquals(expected, actual);
    }


}