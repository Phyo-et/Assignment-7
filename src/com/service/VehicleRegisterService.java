package com.service;

import com.model.Car;
import com.model.Motorcycle;
import com.model.Truck;
import com.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    public Vehicle[] vehicles= new Vehicle[100];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String type ;
    private String brand;
    private int model;


    public void getVehicleInfo() throws IOException {
    String flag;

    do {
        this.commonVerhicle();
        if ("Car".equalsIgnoreCase(this.type)) {
            vehicles[Vehicle.getCount()]= getCarInfo();
        } else if ("Truck".equalsIgnoreCase(this.type)) {
             vehicles[Vehicle.getCount()]=this.getTruckInfo();
        } else if ("Motorcycle".equalsIgnoreCase(this.type)) {
            vehicles[Vehicle.getCount()]=this.getMotorcycleInfo();
        }

        System.out.print("Do you want to Enter new Vehicle? (Yes/No) : ");
        flag = br.readLine();
    }while(flag.equalsIgnoreCase("yes"));
    }
    public void commonVerhicle() throws IOException {
        System.out.print("Enter the Brand of Verhicle : ");
        this.brand =  br.readLine();
        System.out.print("Enter the model number of Verhicle : ");
        this.model = Integer.parseInt(br.readLine());
        System.out.print("Enter the type of Verhicle ( Car, Truck, Motorcycle )? ");
        this.type = br.readLine();
    }
    public Car getCarInfo() throws IOException {
        System.out.println("Enter the number of Doors :  ");
        int doors = Integer.parseInt(br.readLine());

        Car car = new Car(brand,model,doors);
        return car;
    }
    public Truck getTruckInfo() throws IOException {
        System.out.print("Enter the kilogram of payLoadCapacity :  ");
        double payLoadCapacity = Double.parseDouble(br.readLine());

        Truck truck = new Truck(brand,model,payLoadCapacity);
        return truck;
    }
    public Motorcycle getMotorcycleInfo() throws IOException {
        System.out.print("Motorcycle has sidecar (yes/no):  ");
        String hasSidecar = br.readLine();

        Motorcycle motorcycle= new Motorcycle(brand,model,hasSidecar);
        return motorcycle;
    }
}
