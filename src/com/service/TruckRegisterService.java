package com.service;

import com.model.Truck;

import java.io.IOException;

public class TruckRegisterService extends VehicleRegisterService{

    @Override
    public Truck verhicleInfo() throws IOException {
        System.out.print("Enter the kilogram of payLoadCapacity :  ");
        double payLoadCapacity = Double.parseDouble(br.readLine());
        System.out.println("\n");

        Truck truck = new Truck(this.getVehicle().getBrand(),this.getVehicle().getModel(),payLoadCapacity);
        return truck;
    }
}
