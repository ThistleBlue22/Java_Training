package com.sparta.clara;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DupeLocatorTest {
    DupeLocator dp = new DupeLocator();
    @Test
    public void nameTest() {
        String name = "Clara Oswin Oswald";
        String[] newStringList = {"a", "s", "w", "l", "o"};
        List<String> actual = dp.dupeValueFinder(name);
        List<String> expected = Arrays.asList(newStringList);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void singleCharacterTest() {
        String name = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String[] newStringList = {"a"};
        List<String> actual = dp.dupeValueFinder(name);
        List<String> expected = Arrays.asList(newStringList);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void alternateCapitalisation() {
        String name = "BoRn Of OsiRiS";
        String[] newStringList = {"r", "s", "i", "o"};
        List<String> actual = dp.dupeValueFinder(name);
        List<String> expected = Arrays.asList(newStringList);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noSpaceTest() {
        String name = "isis";
        String[] newStringList = {"s", "i"};
        List<String> actual = dp.dupeValueFinder(name);
        List<String> expected = Arrays.asList(newStringList);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void randomStringOfText() {
        String name = "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Minus minima quo sequi error nostrum consequatur rem numquam laudantium corrupti magnam atque, nam corporis reprehenderit commodi, quam explicabo magni. Nulla, id.";
        String[] newStringList = {",", ".", "a", "c", "d", "e", "g", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"};
        List<String> actual = dp.dupeValueFinder(name);
        List<String> expected = Arrays.asList(newStringList);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void spaceTest() {
        String name = "";
        String[] newStringList = {};
        List<String> actual = dp.dupeValueFinder(name);
        List<String> expected = Arrays.asList(newStringList);
        Assertions.assertEquals(expected, actual);
    }

}