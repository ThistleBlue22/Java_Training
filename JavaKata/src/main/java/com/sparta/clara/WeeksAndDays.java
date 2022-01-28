package com.sparta.clara;

public class WeeksAndDays {
    public static void main(String[] args) {
        WeeksAndDays weeksAndDays = new WeeksAndDays();
        System.out.println(weeksAndDays.TotalWeeksAndDays(-1));
    }

    public String TotalWeeksAndDays(int days) {

        int weeks = 0;

        if (days < 0){
            return "Days cannot be lower than 0";
        }

        while (days > 6){
            weeks += 1;
            days -= 7;
        }

        return weeks + " week/s and " + days + " day/s";
    }
}
