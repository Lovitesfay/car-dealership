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
                    
                    ************************************************
                            WELCOME TO TOYOTA DEALERSHIP
                    ************************************************
                    
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
        System.out.println("""
                ====================================================
                                FIND VEHICLES BY PRICE:
                ====================================================
                """);

       System.out.print(" Enter minimum price: ");
        double min = input.nextDouble();

        System.out.print(" Enter maximum price: ");
        double max = input.nextDouble();

        ArrayList<Vehicle>vehicles = dealership.getVehiclesByPrice( min, max);

        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }


    }

    public void processGetByMakeModelRequest(){
        System.out.println("""
                ====================================================
                          FIND VEHICLES BY MAKE AND MODEL:
                ====================================================
                
                """);
        System.out.print(" Enter vehicle make: ");
        String make = input.next();

        System.out.print(" Enter vehicle model: ");
        String model = input.next();

        ArrayList<Vehicle>VehicleByMakeModel = dealership.getVehiclesByMakeModel(make,model);
        for (Vehicle vehicle: VehicleByMakeModel){
            System.out.println(vehicle);
        }
    }

    public void processGetByYearRequest(){
        System.out.println("""
                ====================================================
                                FIND VEHICLES BY YEAR:
                ====================================================
                """);

        System.out.println(" Enter minimum year: ");
        double min = input.nextDouble();

        System.out.println(" Enter maximum year: ");
        double max = input.nextDouble();

        ArrayList<Vehicle>vehicles = dealership.getVehicleByYear(min, max);

        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }
    }

    public void processGetByColorRequest(){
        System.out.println("""
                ====================================================
                                FIND VEHICLES BY COLOR:
                ====================================================
                """);

        System.out.println(" Enter vehicle color: ");
        String color = input.next();

        ArrayList<Vehicle>VehicleBYColor = dealership.getVehiclesByColor(color);
        for (Vehicle vehicle: VehicleBYColor){
            System.out.println(vehicle);
        }
    }

    public void processGetByMileageRequest(){

        System.out.println("""
                ====================================================
                                FIND VEHICLES BY ODOMETER:
                ====================================================
                """);


       System.out.println(" Enter minimum mileage: ");
        double min = input.nextDouble();

        System.out.println(" Enter maximum mileage: ");
        double max = input.nextDouble();
        ArrayList<Vehicle>vehicles = dealership.getVehiclesByMileage(min, max);

        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }
    }

    public void processGetByVehicleTypeRequest(){
        System.out.println("""
                ====================================================
                      FIND VEHICLES BY TYPE (Car, Truck, SUV):
                ====================================================
                
                """);

        System.out.println(" Enter vehicle type: ");
        String type = input.next();

        ArrayList<Vehicle>VehicleByType = dealership.getVehicleByType(type);
        for (Vehicle vehicle: VehicleByType){
            System.out.println(vehicle);
        }
    }

    public void processGetAllVehiclesRequest(){

            ArrayList<Vehicle>ListAllCars = dealership.getAllVehicles();
            displayVehicles(ListAllCars);
        }

    public void addVehicleRequest(){

        System.out.print("VIN: ");
        int vin = input.nextInt();

        System.out.print("Year: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("Make: ");
        String make = input.nextLine();

        System.out.print("Model: ");
        String model = input.nextLine();

        System.out.print("Type: ");
        String type = input.nextLine();

        System.out.print("Color: ");
        String color = input.nextLine();

        System.out.print("Odometer: ");
        int odometer = input.nextInt();

        System.out.print("Price: ");
        double price = input.nextDouble();

        Vehicle newVehicle = new Vehicle(
                vin,
                year,
                make,
                model,
                type,
                color,
                odometer,
                price
        );

        dealership.addVehicle(newVehicle);

        DealershipFileManager fileManager = new DealershipFileManager();

        fileManager.saveDealership(dealership);

        System.out.println("Vehicle Added!");

    }



    public void removeVehicleRequest(){
        System.out.println("""
                ====================================================
                                REMOVE VEHICLES BY VIN:
                ====================================================
                """);

        System.out.print("ENTER VIN: ");
        int vin = input.nextInt();




        DealershipFileManager fileManager = new DealershipFileManager();

        fileManager.saveDealership(dealership);

        System.out.println("Vehicle Removed!");


    }


    public static void displayVehicles(ArrayList<Vehicle> vehicles) {

   }
}

