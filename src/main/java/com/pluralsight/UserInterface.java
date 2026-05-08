package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
public static Scanner input = new Scanner(System.in);
    Dealership dealership;
   public UserInterface(){}

    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();

        this.dealership = fileManager.getDealership();

    }

    public void display() {
        // create dealership
        this.init();


        boolean appRunning = true;
        while (appRunning) {
            System.out.print("""
                    
                    
                    1 - Find vehicles within a price range: 
                    2 - Find vehicles by make / model: 
                    3 - Find vehicles by year range: 
                    4 - Find vehicles by color: 
                    5 - Find vehicles by mileage range: 
                    6 - Find vehicles by type (car, truck, SUV, van): 
                    7 - List ALL vehicles: 
                    8 - Add a vehicle: 
                    9 - Remove a vehicle: 
                    99 - Quit: 
                    
                    
                    
                    
                    """);


            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    addVehicleRequest();
                    break;
                case 9:
                    removeVehicleRequest();
                    break;
                case 99:
                    appRunning = false;
                    System.out.println("System Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;




            }
        }
    }

    public void processGetByPriceRequest(){
        System.out.println("list of Vehicles by price");



    }

    public void processGetByMakeModelRequest(){
        System.out.println("list of Vehicles by MakeModel");
        ArrayList<Vehicle>VehicleByMakeModel = dealership.getVehiclesByMakeModel();
    }

    public void processGetByYearRequest(){
        System.out.println("list of Vehicles by Year");
        ArrayList<Vehicle>VehicleByYear = dealership.getVehicleByYear();
    }

    public void processGetByColorRequest(){
        System.out.println("list of Vehicles by Color");
        ArrayList<Vehicle>VehicleBYColor = dealership.getVehiclesByColor();
    }

    public void processGetByMileageRequest(){
        System.out.println("list of Vehicles by Mileage");
        ArrayList<Vehicle>VehicleByMileage = dealership.getVehiclesByMileage();
    }

    public void processGetByVehicleTypeRequest(){
        System.out.println("list of Vehicles by VehicleType");
        ArrayList<Vehicle>VehicleByType = dealership.getVehicleByType();
    }

    public void processGetAllVehiclesRequest(){

            ArrayList<Vehicle>ListAllCars = dealership.getAllVehicles();
            displayVehicles(ListAllCars);
        }

    public void addVehicleRequest(){
    }

    public void removeVehicleRequest(){}


    public static void displayVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
   }
}

