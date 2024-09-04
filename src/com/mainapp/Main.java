package com.mainapp;

import com.model.Vehicle;
import com.service.CarRegisterService;
import com.service.MotorcycleRegisterService;
import com.service.TruckRegisterService;
import com.service.VehicleRegisterService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
//        VehicleRegisterService service =new VehicleRegisterService();
//        service.getVehicleInfo();
//
//        for (int i = 0; i< Vehicle.getCount(); i++){
//            service.vehicles[i].displayInfo();
//        }

        String flag = null;
        VehicleRegisterService service = null;

    do {
        System.out.print("Enter the type of Verhicle ( Car, Truck, Motorcycle )? ");
           String type = br.readLine();

        if ("Car".equalsIgnoreCase(type)) {
            service = new CarRegisterService();
        } else if ("Truck".equalsIgnoreCase(type)) {
             service = new TruckRegisterService();
        } else if ("Motorcycle".equalsIgnoreCase(type)) {
           service = new MotorcycleRegisterService();
        }
        service.getVehicleInfo();

        System.out.print("Do you want to Enter new Vehicle? (Yes/No) : ");
        flag = br.readLine();
    }while(flag.equalsIgnoreCase("yes"));

        System.out.println("\n");

        for (int i = 0; i < Vehicle.getCount(); i++) {
            VehicleRegisterService.vehicles[i].displayInfo();
        }
   }
}