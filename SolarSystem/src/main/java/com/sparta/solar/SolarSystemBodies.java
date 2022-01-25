package com.sparta.solar;

public class SolarSystemBodies {
    public enum Planet {
        MERCURY("Mercury", "0.39", "0.330"),
        VENUS("Venus", "0.72", "4.87"),
        EARTH("Earth", "1", "5.97"),
        MARS("Mars", "1.52", "0.642"),
        JUPITER("Jupiter", "5.2", "1898"),
        SATURN("Saturn", "9.54", "568"),
        URANUS("Uranium", "19.2", "86.8"),
        NEPTUNE("Neptune", "30.06", "102"),
        PLUTO("Pluto", "39", "0.0130");

        final String planet;
        final String  distance;
        final String mass;

        Planet(String planet, String d, String m) {
            this.planet = planet;
            this.distance = d;
            this.mass = m;
        }
    }

    public static void main(String[] args) {
        if (Integer.parseInt(Planet.EARTH.distance) == 1){
            System.out.println("The " + Planet.EARTH.planet + " is " + Planet.EARTH.distance + "au away from the sun!");
        }
    }
}
