package com.sparta.clara;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeeksAndDaysTest {
    WeeksAndDays weeksAndDays = new WeeksAndDays();
    @Test
    public void OneWeekAndOneDay() {
        String expected = "1 week/s and 1 day/s";
        String actual = weeksAndDays.TotalWeeksAndDays(8);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void OneDay() {
        String expected = "0 week/s and 1 day/s";
        String actual = weeksAndDays.TotalWeeksAndDays(1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ZeroDays() {
        String expected = "0 week/s and 0 day/s";
        String actual = weeksAndDays.TotalWeeksAndDays(0);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SixtyNineWeeksAndZeroDays() {
        String expected = "69 week/s and 0 day/s";
        String actual = weeksAndDays.TotalWeeksAndDays(69*7);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NegativeDays() {
        String expected = "Days cannot be lower than 0";
        String actual = weeksAndDays.TotalWeeksAndDays(-1);
        Assertions.assertEquals(expected, actual);
    }

}