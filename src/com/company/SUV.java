/*
 *MP2 COMP 167 Sanjit Verma
 */
package com.company;

public class SUV extends Vehicle {
    public double cargoSpace;

//SUV()
    public SUV() { }

//SUV + All properties of SUV
    public SUV(int mpg , String color  , Engine engine , String vehicleID , int seats , int doors , String make , String model , int mileage , int yr , double price , double cargoSpace ){
        super (mpg , color , engine , vehicleID , seats , doors , make , model , mileage , yr , price);
        this.cargoSpace= cargoSpace;
    }
//Getter
    public double getCargoSpace() {
        return cargoSpace;
    }
//Setter
    public void setCargoSpace(double cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
//to string methods
    public String toString() {
        return super.toString() + "  cargo space:   " + cargoSpace;
    }
}