package com.sparta.basics;

public class CustomerComparison {
    public static void main(String[] args) {
        Customer c1 = new Customer("Clara", "Porteous");

        Customer c2 = new Customer("Clara", "Porteous");

        Customer c3 = new Customer();
        
        String s;

        //System.out.println(s); Doesn't like non-initialised values
        // if (c1.equals(c2))
        System.out.println(c3.getFirstName()); // Won't follow the same and will assign values that are null in
                                               // Objects as being default and therefore null

        /*
        For integer types, default value is 0
        For floating point types, 0.0
        Boolean, false
        Char default is \u0000
         */



    }
}
