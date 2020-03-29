/*
*MP2 COMP 167 Sanjit Verma
 */
package com.company;
public class Truck extends Vehicle{
    public double bedSpace;

//Truck()
    public Truck(){ }

//Truck + All properties of truck
    public Truck(int mpg , String color , Engine engine , String vehicleID , int seats , int doors , String make , String model , int mileage , int yr , double price , double bedSpace) {
        super(mpg , color, engine, vehicleID, seats, doors, make, model, mileage, yr, price);
        this.bedSpace= bedSpace;
    }
//Getter
    public double getBedSpace() {
        return bedSpace;
    }
//Setter
    public void setBedSpace(double bedSpace) {
        this.bedSpace = bedSpace;
    }
//to string methods
    public String toString() {
        return super.toString() + "  bedSpace:   " +bedSpace;
    }
}