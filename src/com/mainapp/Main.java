package com.mainapp;

import com.model.Vehicle;
import com.service.VehicleRegisterService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        VehicleRegisterService service =new VehicleRegisterService();
        service.getVehicleInfo();

        for (int i = 0; i< Vehicle.getCount(); i++){
            service.vehicles[i].displayInfo();
        }
    }
}