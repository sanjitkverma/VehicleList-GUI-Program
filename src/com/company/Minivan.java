/*
 *MP2 COMP 167 Sanjit Verma
 */
package com.company;
public class Minivan extends Vehicle {
    public boolean slidingDoors;

    //Minivan()
    public Minivan(){}
//Minivan + All properties of Minivan
    public Minivan( int mpg, Engine engine, String color, String vehicleID ,int seats, int doors, String make  ,
        int mileage, String model,int yr, double price, boolean slidingDoors ){
            super(mpg, color, engine, vehicleID, seats, doors, make, model, mileage, yr, price);
            this.slidingDoors = slidingDoors;
        }
//Getter
        public boolean isSlidingDoors () {
            return slidingDoors;
        }

//Setter
        public void setSlidingDoors ( boolean slidingDoors){
            this.slidingDoors = slidingDoors;
        }
//to string methods
        public String toString () {
            return super.toString() + "  sliding doors:  " + slidingDoors;
        }
    }



