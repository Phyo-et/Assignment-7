package com.service;

import com.model.Car;

import java.io.IOException;

public class CarRegisterService extends VehicleRegisterService{

    @Override
    public Car verhicleInfo() throws IOException {
        System.out.print("Enter the number of Doors :  ");
        int doors = Integer.parseInt(br.readLine());
        System.out.println("\n");

        Car car = new Car(this.getVehicle().getBrand(),this.getVehicle().getModel(),doors);
        return car;
    }
}
