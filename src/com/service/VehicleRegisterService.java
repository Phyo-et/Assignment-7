package com.service;

import com.model.Car;
import com.model.Motorcycle;
import com.model.Truck;
import com.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    public static Vehicle[] vehicles= new Vehicle[100];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    private String type ;
//    private String brand;
//    private int model;

        private Vehicle vehicle;

    public VehicleRegisterService(){
        this.vehicle= new Vehicle() ;
    }

    public void getVehicleInfo() throws IOException {
//    String flag;
//
//    do {
//        this.commonVerhicle();
//        if ("Car".equalsIgnoreCase(this.type)) {
//            vehicles[Vehicle.getCount()]= getCarInfo();
//        } else if ("Truck".equalsIgnoreCase(this.type)) {
//             vehicles[Vehicle.getCount()]=getTruckInfo();
//        } else if ("Motorcycle".equalsIgnoreCase(this.type)) {
//            vehicles[Vehicle.getCount()]=getMotorcycleInfo();
//        }
//
//        System.out.print("Do you want to Enter new Vehicle? (Yes/No) : ");
//        flag = br.readLine();
//    }while(flag.equalsIgnoreCase("yes"));

            this.commonVerhicle();
            Vehicle vehicle =this.verhicleInfo();
            vehicles[Vehicle.getCount()-1] = vehicle;
    }

    public Vehicle verhicleInfo()throws IOException {
        return null;
    }

    public void commonVerhicle() throws IOException {
        System.out.print("Enter the Brand of Verhicle : ");
        this.vehicle.setBrand(br.readLine());
        System.out.print("Enter the model number of Verhicle : ");
        this.vehicle.setModel(Integer.parseInt(br.readLine()));
//        System.out.print("Enter the type of Verhicle ( Car, Truck, Motorcycle )? ");
//        String type = br.readLine();
    }

    public static Vehicle[] getVehicles() {
        return vehicles;
    }


    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
