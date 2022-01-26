package com.sparta.vehicles;

public class Vehicle {
    private String make;
    private String model;
    private String licencePlate;
    private String engineSize;
    private String colour;
    private String type;
    private int fuelLevel;
    private boolean isMOTed;

    public Vehicle(String make, String model, String licencePlate, String engineSize, String colour, String type, int fuelLevel, boolean isMOTed) {
        this.make = make;
        this.model = model;
        this.licencePlate = licencePlate;
        this.engineSize = engineSize;
        this.colour = colour;
        this.type = type;
        this.fuelLevel = fuelLevel;
        this.isMOTed = isMOTed;
    }

    public String isMOTValid() {
        String isMOTValid;
     if (isMOTed()){
         isMOTValid = "valid";
     }
     else{
         isMOTValid = "invalid";
     }
     return isMOTValid;
    }

    public String toString() {
        String carMOT = isMOTValid();

        return "The car with make and model " + getMake() + " " + getModel() + " has an engine size of " + getEngineSize() +
                " and has a fuel level of " + getFuelLevel() + "%. The car is MOT " + carMOT +
                ". The colour of the car is " + getColour() + " and is a " + getType() + " type of car." +
                " We have a car with the licence plate: " + getLicencePlate();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean isMOTed() {
        return isMOTed;
    }

    public void setMOTed(boolean MOTed) {
        isMOTed = MOTed;
    }
}
