package com.spartaglobal.raindrops;

import org.junit.jupiter.api.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class RaindropsShould {


    @Test
    @DisplayName("Given one, return a String")
    public void givenOneReturnAString(){
        assertEquals("1", Raindrops.plingPlangPlong(1));
    }

    @Test
    @DisplayName("Given two, return a String")
    public void givenTwoReturnTwo(){
        assertEquals("2", Raindrops.plingPlangPlong(2));
    }

    @Test
    @DisplayName("Given three return Pling")
    public void givenThree_Return_Pling(){
        assertEquals("Pling", Raindrops.plingPlangPlong(3));
    }
    @Test
    public void givenANumberDivisibleByThree_ButNotFiveOrSeven_Return_Pling(){
        assertEquals("Pling", Raindrops.plingPlangPlong(9));

    }
    @Test
    @DisplayName("Given 5, return Plang")
    public void givenFive_Return_Plang(){
        assertEquals("Plang", Raindrops.plingPlangPlong(5));
    }
    @Test
    public void givenANumberDivisibleByFive_ButNotThreeOrSeven_Return_Plang(){

        assertEquals("Plang", Raindrops.plingPlangPlong(10));

    }
    @Test
    @DisplayName("Given 15 return PlingPlang")
    public void givenFifteen_Return_PlingPlang(){
        assertEquals("PlingPlang", Raindrops.plingPlangPlong(15));
    }
    @Test
    public void givenANumberDivisibleByFifteen_ButNotSeven_Return_PlingPlang(){

        assertEquals("PlingPlang", Raindrops.plingPlangPlong(30));

    }
    @Test
    @DisplayName("Given 7 return Plong")
    public void givenSeven_Return_Plong(){
        assertEquals("Plong", Raindrops.plingPlangPlong(7));
    }
    @Test
    @DisplayName("Given 7 return Plong")
    public void givenANumberDivisibleBySeven_ButNotThreeOrFive_Return_Plong(){
        assertEquals("Plong", Raindrops.plingPlangPlong(14));
    }
    @Test
    @DisplayName("Given 21 return PlingPlong")
    public void givenTwentyOne_Return_PlingPlong(){
        assertEquals("PlingPlong", Raindrops.plingPlangPlong(21));
    }
    @Test
    public void givenThirtyFive_Return_PlangPlong(){
        assertEquals("PlangPlong", Raindrops.plingPlangPlong(35));

    }
    @Test
    public void givenOneHundredAndFive_Return_PlingPlangPlong(){
        assertEquals("PlingPlangPlong", Raindrops.plingPlangPlong(105));

    }


}
