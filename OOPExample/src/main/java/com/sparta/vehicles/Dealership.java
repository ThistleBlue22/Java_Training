package com.sparta.vehicles;

public class Dealership {
    public static void main(String[] args) {
        Vehicle renaultClio = new Vehicle("Renault", "Clio", "HGF4GH5GHD", "1.0L 3-Cylinder", "Blue", "Subcompact", 100, true);

        System.out.println(renaultClio);

        Vehicle dmcDeLorean = new Vehicle("DeLorean Motor Company", "DeLorean", "OUTATIME", "2.85 L V6 PRV Engine ZMJ-159", "White", "Sports Car", 88, true);

        System.out.println(dmcDeLorean);
    }
}
