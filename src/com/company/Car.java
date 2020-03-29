/*
 *MP2 COMP 167 Sanjit Verma
 */
package com.company;
public class Car extends Vehicle{
    public boolean convertible;
//Car()
    public Car(){ }

//Car + All properties of Car
    public Car (int mpg , String color , Engine engine , String vehicleID , int seats , int doors , String make , String model , int mileage , int yr , double price , boolean convertible){
        super(mpg , color, engine, vehicleID, seats, doors, make, model, mileage, yr, price);
        this.convertible=convertible;
    }
//Getter
    public boolean isConvertible() {
        return convertible;
    }
//Setter
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
//to string methods
    public String toString() {
        return super.toString() + "  convertible: " + convertible ;
    }
}
