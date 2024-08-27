package com.model;

public class Truck extends Vehicle{
    private double payLoadCapacity;

    public Truck(String brand,int model,double payLoadCapacity){
        super(brand, model);
        this.payLoadCapacity = payLoadCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("________ Trucks ________");
        super.displayInfo();
        System.out.print("Trucks pay Load : "+ payLoadCapacity + "kg...");
    }
}
