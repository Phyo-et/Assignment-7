package com.model;

public class Car extends Vehicle{
    private int doors;

    public Car(String brand,int model,int doors){
        super(brand, model);
        this.doors = doors;
    }

    @Override
    public void displayInfo(){
        System.out.println("________ Cars ________");
        super.displayInfo();
        System.out.print("Cars had "+doors + "doors...");
    }

}
