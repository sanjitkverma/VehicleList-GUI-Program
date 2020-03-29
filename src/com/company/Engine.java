/*
 *MP2 COMP 167 Sanjit Verma
 */
package com.company;
public class Engine{
    public String transmission;
    public int cylinders;
    public boolean fourWheelDrive;
    public boolean hybrid;
    public double horsePower ;

//Getter
    public String getTransmission() {
        return transmission;
    }
    public int getCylinders() {
        return cylinders;
    }
    public double getHorsePower() {
        return horsePower;
    }
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
    public boolean isHybrid() {
        return hybrid;
    }

//Setter
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
    public void setHybrid(boolean hybrid){
        this.hybrid = hybrid;
    }
    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

//Engine()
    public Engine(){ }
//Engine + All properties of Enginer
    public Engine(String transmission , int cylinders , boolean fourWheelDrive , boolean hybrid , double horsePower){
        this.transmission= transmission;
        this.cylinders =cylinders;
        this.fourWheelDrive = fourWheelDrive;
        this.hybrid = hybrid;
        this.horsePower=horsePower;
    }
//toString method
    public String toString(){
        return "Transmission: " + transmission + " cylinders: " + cylinders + " four wheel drive: " + fourWheelDrive + " hybrid: " + hybrid + " horse power: " + horsePower;
    }
}
