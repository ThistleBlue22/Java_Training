package com.sparta.clara;

import java.util.ArrayList;
import java.util.Random;

public class SecondLargest {
    public static void main(String[] args) {
        try {
            SecondLargest sL = new SecondLargest();

            ArrayList<Integer> integerArrayList = new ArrayList<>();

            // loops 10 times to get random numbers and round them to cast them to int and add them to the array above
            for (int i = 0; i < 10; i++) {
                double x = 100 * Math.random();

                int y = (int) Math.round(x);
                integerArrayList.add(y);
            }
            // calls the method in a println statement
            System.out.println(sL.findTheSecondLargest(integerArrayList));
        }
        catch (Exception e){
            System.out.println("Please only add whole digit numbers to the Array, no Double, Letters or Symbols. The error" +
                    " is : " + e);
        }
    }

    public int findTheSecondLargest(ArrayList<Integer> intArray){
        int arrayLength = intArray.size();
        // sets the size of the array
        intArray.sort(null);
        // sorts the array in the default manner
        System.out.println(intArray);
        // shows the sorted list to ensure the answer is correct
        return intArray.get(arrayLength-2);
    }

}
