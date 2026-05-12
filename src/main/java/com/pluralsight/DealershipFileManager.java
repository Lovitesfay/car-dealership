package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DealershipFileManager {

    //variable for the path to the CSV file
    private final String filePath = "src/main/resources/inventory.csv";

    public Dealership getDealership(){


        Dealership toyota = null;

        try{
//

            //creating the BufferedReader for the inventory.csv file
            BufferedReader inventoryReader = new BufferedReader(new FileReader(filePath));

            // keep the first line
            String dealershipInfo = inventoryReader.readLine();

            if(dealershipInfo != null){

                //split it like this ... D & B Used Cars|111 Old Benbrook Rd|817-555-5555
                String[] splitCategories = dealershipInfo.split("\\|");
                String name = splitCategories[0];
                String address = splitCategories[1];
                String phone = splitCategories[2];

                //create the dealership
                toyota = new Dealership(name, address, phone);

            }

            String vehicleDetails;

            while((vehicleDetails = inventoryReader.readLine()) != null){

                //split it by category
                String[] vehicleParts = vehicleDetails.split("\\|");

                int vin = Integer.parseInt(vehicleParts[0]);
                int year = Integer.parseInt(vehicleParts[1]);
                String make = vehicleParts[2];
                String model = vehicleParts[3];
                String type = vehicleParts[4];
                String color = vehicleParts[5];
                int odometer = Integer.parseInt(vehicleParts[6]);
                double price = Double.parseDouble(vehicleParts[7]);

                //create the vehicle
                Vehicle theVehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);

                //add the vehicle to the inventory
                toyota.addVehicle(theVehicle);

            }

            //close the reader
            inventoryReader.close();

        }catch (Exception error){
            System.out.println("Can't load into the file " + error.getMessage());
        }


        //return the created dealership
        return toyota;
    }

    //stay empty for now but we will revisit later
    public void saveDealership(Dealership dealership){


        try {

            BufferedWriter inventoryWriter =
                    new BufferedWriter(new FileWriter(filePath,true));

            // save dealership info
            inventoryWriter.write(
                    dealership.getName() + "|" +
                            dealership.getAddress() + "|" +
                            dealership.getPhoneNumber()
            );

            inventoryWriter.newLine();

            // save vehicles
            for (Vehicle vehicle : dealership.getAllVehicles()) {

                inventoryWriter.write(
                        vehicle.getVin() + "|" +
                                vehicle.getYear() + "|" +
                                vehicle.getMake() + "|" +
                                vehicle.getModel() + "|" +
                                vehicle.getVehicleType() + "|" +
                                vehicle.getColor() + "|" +
                                vehicle.getOdometer() + "|" +
                                vehicle.getPrice()
                );

                inventoryWriter.newLine();
            }

            inventoryWriter.close();

            System.out.println("Dealership saved.");

        } catch (Exception e) {

            System.out.println("Error saving file.");
        }
    }



        //deal with the dealership info for the first line

        //deal with each vehicle



    }

