package com.sparta.clara;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {
    VowelCounter vc = new VowelCounter();
    @Test
    public void NormalString(){
        String string = "This is just a random assortment of letters that make up words, why can't we have our owune words?";

        int expected = 27;
        int actual = vc.VowelCounterString(string);
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void UpperCaseString(){
        String string = "This is just a random assortment of letters that make up words, why can't we have our owune words?".toUpperCase();

        int expected = 27;
        int actual = vc.VowelCounterString(string);
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void Numbers(){
        String string = "2934987234982349723897429387498234987234987234987234";

        int expected = 0;
        int actual = vc.VowelCounterString(string);
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void NumbersAndLetters(){
        String string = "This is 1337 speek";

        int expected = 4;
        int actual = vc.VowelCounterString(string);
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void NoStringCharactersPresent(){
        String string = "";

        int expected = 0;
        int actual = vc.VowelCounterString(string);
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void Symbols(){
        String string = "@{}~}][['{@[]/'.;;?>;./@@}@{';?.'/@/.;.;/'";

        int expected = 0;
        int actual = vc.VowelCounterString(string);
        Assertions.assertEquals(actual, expected);
    }

}