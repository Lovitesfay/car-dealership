package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
// save
    public void saveContract(Contract contract){


        try{

            FileWriter writer =
                    new FileWriter("contracts.csv", true);

            Vehicle vehicle = contract.getVehicleSold();

            writer.write(
                    contract.getDate() + "|" +
                            contract.getCustomerName() + "|" +
                            vehicle.getVin() + "|" +
                            vehicle.getYear() + "|" +
                            vehicle.getMake() + "|" +
                            vehicle.getModel() + "\n"
            );

            writer.close();

        }

        catch(IOException e){
            System.out.println("Error saving contract.");
        }

    }

    }

