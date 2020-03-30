/*
 *MP2 COMP 167 Sanjit Verma
 */
package com.company;

public class SUV extends Vehicle {
    public double cargoSpace;
    public boolean removableSeats;
//SUV()
    public SUV() { }

//SUV + All properties of SUV
    public SUV(int mpg , String color  , Engine engine , String vehicleID , int seats , int doors , String make , String model , int mileage , int year , double price , double cargoSpace, boolean removableSeats ){
        super (mpg , color , engine , vehicleID , seats , doors , make , model , mileage , year , price);
        this.cargoSpace= cargoSpace;
        this.removableSeats= removableSeats;
    }
//Getter
    public double getCargoSpace() {
        return cargoSpace;
    }
    public boolean isRemovableSeats () {
        return removableSeats;
    }
//Setter
    public void setCargoSpace(double cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
    public void setRemovableSeats ( boolean removableSeats){
        this.removableSeats = removableSeats;
    }
//to string methods
    public String toString() {
        return super.toString() + "  cargo space:   " + cargoSpace;
    }
}