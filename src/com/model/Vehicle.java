package com.model;

public class Vehicle {
    private String brand;
    private int model;
    private int id;
    public static int count =0;

    public Vehicle(){
    }
    public Vehicle(String brand,int model){
        this.brand = brand;
        this.model = model;
        count++;
        this.id = count;
    }
    public static int getCount() {
        return count;
    }
    public void displayInfo(){
        System.out.println("Vehicle Brand is :"+ brand);
        System.out.println("Vehicle Model is :" + model);
    }
    public String getBrand(){
        return brand;
    }
    public int getModel() {
        return model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(int model){
        this.model=model;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Verhicle [brand ="+brand+" ID= "+id +" Model "+model +" ]";
    }
}
