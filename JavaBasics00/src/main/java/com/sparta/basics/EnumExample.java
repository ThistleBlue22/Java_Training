package com.sparta.basics;

public class EnumExample {
    /* Start of Constants
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;
    End of Constants */

    public enum DayIndex {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }


    public static void main(String[] args) {
        DayIndex day = DayIndex.SUNDAY;

        if (day == DayIndex.SATURDAY || day == DayIndex.SUNDAY) {
            System.out.println("It's the weekend");
        } else {
            System.out.println("It's not the weekend");
        }

    }
}
