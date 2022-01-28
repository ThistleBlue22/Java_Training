package com.sparta.vehicles;

public class Car extends Vehicle{
    private int numberOfSeats;
    private boolean sunroof;
    private String bootSize;

    public Car(String make, String model, String licencePlate, String engineSize, String colour, String type, int fuelLevel, boolean isMOTed, int numberOfSeats, boolean sunroof, String bootSize) {
        super(make, model, licencePlate, engineSize, colour, type, fuelLevel, isMOTed);
        this.numberOfSeats = numberOfSeats;
        this.sunroof = sunroof;
        this.bootSize = bootSize;
    }

    public String sunroofStatus(boolean isSunroof) {
        if (isSunroof){
            return "has";
        }
        else{
            return "has not";
        }
    }

    public String toString() {
        return super.toString() + "This car has " + getNumberOfSeats() + " number of seats, a boot size of " + getBootSize() +
                ". The car " + sunroofStatus(isSunroof()) + " got a sunroof";
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public String getBootSize() {
        return bootSize;
    }

    public void setBootSize(String bootSize) {
        this.bootSize = bootSize;
    }
}
