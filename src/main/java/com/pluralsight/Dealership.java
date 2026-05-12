package com.pluralsight;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public Dealership setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Dealership setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Dealership setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ArrayList<Vehicle>getVehiclesByPrice(double min, double max) {

        ArrayList<Vehicle> results = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >=min &&
                    vehicle.getPrice() <= max){
                results.add(vehicle);
            }
        }

    return results;
    }

    public ArrayList<Vehicle>getVehiclesByMakeModel(String make, String model) {

        ArrayList<Vehicle> results = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            if (vehicle.getMake().equalsIgnoreCase(make) &&
                    vehicle.getModel().equalsIgnoreCase(model)) {

                results.add(vehicle);
            }


        }
        return results;
    }

    public ArrayList<Vehicle>getVehicleByYear(double min, double max) {
        ArrayList<Vehicle> results = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min &&
                    vehicle.getYear() <= max) {
                results.add(vehicle);

            }
        }
    return results;
    }
    public ArrayList<Vehicle>getVehiclesByColor(String color) {

        ArrayList<Vehicle> results = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            if (vehicle.getColor().equalsIgnoreCase(color)) {

                results.add(vehicle);
            }
        }
        return results;

    }

    public ArrayList<Vehicle>getVehiclesByMileage(double min, double max) {

        ArrayList<Vehicle> results = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min &&
                    vehicle.getOdometer() <= max) {
                results.add(vehicle);

            }
        }
        return results;
    }
    public ArrayList<Vehicle>getVehicleByType(String type) {

        ArrayList<Vehicle> results = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            if (vehicle.getVehicleType().equalsIgnoreCase(type) ) {

                results.add(vehicle);
            }
        }
        return results;
    }
    public ArrayList<Vehicle>getAllVehicles(){

        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }
    public void remove(Vehicle vehicle){
        this.inventory.remove(vehicle);

    }
}



