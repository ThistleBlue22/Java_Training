package com.sparta.clara;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    SecondLargest sL = new SecondLargest();

    @Test
    public void setNumbers(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int number = 55;
        for (int i = 0; i < 10; i++) {

            integerArrayList.add(number);

            number += 3;
        }

        int expected = 79;
        int actual = sL.findTheSecondLargest(integerArrayList);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void specifiedNumbers(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(0);
        integerArrayList.add(22);
        integerArrayList.add(21);
        integerArrayList.add(12);
        integerArrayList.add(22);
        integerArrayList.add(1);
        integerArrayList.add(31);
        integerArrayList.add(43);
        integerArrayList.add(23);
        integerArrayList.add(67);
        integerArrayList.add(56);



        int expected = 56;
        int actual = sL.findTheSecondLargest(integerArrayList);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whySoNegative(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(-2);
        integerArrayList.add(-22);
        integerArrayList.add(-21);
        integerArrayList.add(-12);
        integerArrayList.add(-22);
        integerArrayList.add(-1);
        integerArrayList.add(-31);
        integerArrayList.add(-43);
        integerArrayList.add(-23);
        integerArrayList.add(-67);
        integerArrayList.add(-56);



        int expected = -2;
        int actual = sL.findTheSecondLargest(integerArrayList);
        Assertions.assertEquals(expected, actual);
    }

}