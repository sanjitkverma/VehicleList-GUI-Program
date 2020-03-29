/*
 *MP2 COMP 167 Sanjit Verma
 */
package com.company;
public class Vehicle{
    public int mpg;
    public String color;
    public Engine engine ;
    public String vehicleID;
    public int seats;
    public int doors;
    public  String make;
    public String model;
    public int mileage;
    public int year;
    public double price;

//Getter
    public int getMpg() {
        return mpg;
    }
    public String getColor() {
        return color;
    }
    public Engine getEngine() {
        return engine;
    }
    public String getVehicleID() {
        return vehicleID;
    }
    public int getSeats() {
        return seats;
    }
    public String getMake() {
        return make;
    }
    public int getDoors() {
        return doors;
    }
    public String getModel() {
        return model;
    }
    public int getMileage() {
        return mileage;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }

//Setter
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        this.price = price;
    }

//Vehicle()
    public Vehicle(){ }

//Vehicle+ All properties of vehicle
    public Vehicle(int mpg , String color , Engine engine , String vehicleID , int seats , int doors , String make , String model , int mileage , int yr , double price){
        this.mpg= mpg;
        this.color=color;
        this.engine= engine;
        this.vehicleID= vehicleID;
        this.seats = seats;
        this.doors= doors;
        this.make =make;
        this.model =model;
        this.mileage= mileage;
        this.year= yr;
        this.price=price;
    }

//To string method
    public String toString() {
        return "Year: "+year + " Make: " +make +" Model: " + model + " Mileage: " + mileage + " Miles Per Gallon: " + mpg + " Color: " + color+" Seats: " + seats + " Doors: " + doors + " Price: " + price + " Vehicle ID: " + vehicleID + " Engine: " + engine.toString();
    }
}