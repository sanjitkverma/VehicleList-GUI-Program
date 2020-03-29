/*
 *MP2 COMP 167 Sanjit Verma
 */
package com.company;
import java.util.ArrayList;
public class Lot {
    public String lotName;
    public ArrayList<Vehicle> vehicles;

//Lot()
    public Lot(){
        vehicles = new ArrayList<>();
    }
//Getter
    public String getLotName() {
        return lotName;
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
//Setter
    public void setLotName(String lotName) {
        this.lotName = lotName;
    }
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles= vehicles;
    }
}