package com.service;

import com.model.Motorcycle;

import java.io.IOException;

public class MotorcycleRegisterService extends VehicleRegisterService{

    @Override
    public Motorcycle verhicleInfo() throws IOException {
        System.out.print("Motorcycle has sidecar (yes/no):  ");
        String hasSidecar = br.readLine();
        System.out.println("\n");

        Motorcycle motorcycle= new Motorcycle(this.getVehicle().getBrand(),this.getVehicle().getModel(),hasSidecar);
        return motorcycle;
    }
}
