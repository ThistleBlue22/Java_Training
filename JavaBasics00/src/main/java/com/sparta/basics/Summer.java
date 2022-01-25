package com.sparta.basics;

public class Summer {
    public static void main(String[] args) {
        int[] myInts = {1,2,3,4,57,78,5,756,34,45,54};
        Summer summer = new Summer();
        System.out.println(summer.sumArray(myInts)); // 1039
    }

    public int sumArray(int[] theInts){
        // complete this method
        int num = 0;
        for (int number: theInts) {
            num += number;
        }

        return num;
    }
}
