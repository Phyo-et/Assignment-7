package com.model;

public class Motorcycle extends Vehicle{
    private String hasSidecar;

    public Motorcycle(String brand,int model,String hasSidecar){
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo(){
        System.out.println("________ Motorcycle ________");
        super.displayInfo();
        System.out.print("Motorcycle had sidecar : "+ hasSidecar);
    }
}
