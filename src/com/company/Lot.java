package com.company;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Lot {
    public String lotName;
    public ArrayList<Vehicle> vehicles;

    //Lot()
    public Lot() {
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
        this.vehicles = vehicles;
    }

    //Load Vehicle
    public void loadVehicle(String fileName) throws IOException {
        File fl = new File(fileName);
        Scanner sc = new Scanner(fl);
        while (sc.hasNext()) {
            if (sc.nextLine() == "Car" || sc.nextLine() == "car ") {
                Car cars = new Car();
                cars.setMpg(Integer.parseInt(sc.nextLine()));
                cars.setColor(sc.nextLine());
                Engine engines = new Engine();
                cars.setVehicleID(sc.nextLine());
                cars.setSeats(Integer.parseInt(sc.nextLine()));
                cars.setDoors(Integer.parseInt(sc.nextLine()));
                cars.setMake(sc.nextLine());
                cars.setModel(sc.nextLine());
                cars.setMileage(Integer.parseInt(sc.nextLine()));
                cars.setYear(Integer.parseInt(sc.nextLine()));
                cars.setPrice(Double.parseDouble(sc.nextLine()));

                String[] engineInfo = sc.nextLine().split(",");
                engines.setTransmission(engineInfo[0]);
                engines.setCylinders(Integer.parseInt(engineInfo[2]));
                engines.setFourWheelDrive(engineInfo[0] == "4WD ");
                engines.setHybrid(engineInfo[3] == "hybrid");
                engines.setHorsePower(Double.parseDouble(engineInfo[4]));
                cars.setEngine(engines);
                cars.setConvertible(sc.nextLine() == "Yes");
                vehicles.add(cars);
            } else if (sc.nextLine() == "Truck" || sc.nextLine() == "truck ") {
                Truck trucks = new Truck();
                trucks.setMpg(Integer.parseInt(sc.nextLine()));
                trucks.setColor(sc.nextLine());
                Engine engines = new Engine();
                trucks.setVehicleID(sc.nextLine());
                trucks.setSeats(Integer.parseInt(sc.nextLine()));
                trucks.setDoors(Integer.parseInt(sc.nextLine()));
                trucks.setMake(sc.nextLine());
                trucks.setModel(sc.nextLine());
                trucks.setMileage(Integer.parseInt(sc.nextLine()));
                trucks.setYear(Integer.parseInt(sc.nextLine()));
                trucks.setPrice(Double.parseDouble(sc.nextLine()));

                String[] engineInfo = sc.nextLine().split(",");
                engines.setTransmission(engineInfo[0]);
                engines.setCylinders(Integer.parseInt(engineInfo[2]));
                engines.setFourWheelDrive(engineInfo[0] == "4WD ");
                engines.setHybrid(engineInfo[3] == "hybrid");
                engines.setHorsePower(Double.parseDouble(engineInfo[4]));
                trucks.setEngine(engines);
                trucks.setBedSpace(Double.parseDouble(sc.nextLine()));
                vehicles.add(trucks);
            } else if (sc.nextLine() == "Suv" || sc.nextLine() == "suv ") {
                SUV suvs = new SUV();
                suvs.setMpg(Integer.parseInt(sc.nextLine()));
                suvs.setColor(sc.nextLine());
                Engine engines = new Engine();
                suvs.setVehicleID(sc.nextLine());
                suvs.setSeats(Integer.parseInt(sc.nextLine()));
                suvs.setDoors(Integer.parseInt(sc.nextLine()));
                suvs.setMake(sc.nextLine());
                suvs.setModel(sc.nextLine());
                suvs.setMileage(Integer.parseInt(sc.nextLine()));
                suvs.setYear(Integer.parseInt(sc.nextLine()));
                suvs.setPrice(Double.parseDouble(sc.nextLine()));

                String[] engineInfo = sc.nextLine().split(",");
                engines.setTransmission(engineInfo[0]);
                engines.setCylinders(Integer.parseInt(engineInfo[2]));
                engines.setFourWheelDrive(engineInfo[0] == "4WD ");
                engines.setHybrid(engineInfo[3] == "hybrid");
                engines.setHorsePower(Double.parseDouble(engineInfo[4]));
                suvs.setEngine(engines);
                suvs.setCargoSpace(Double.parseDouble(sc.nextLine()));
                vehicles.add(suvs);
            } else if (sc.nextLine() == "Minivan" || sc.nextLine() == "minivan ") {
                Minivan minivans = new Minivan();
                minivans.setMpg(Integer.parseInt(sc.nextLine()));
                minivans.setColor(sc.nextLine());
                Engine engines = new Engine();
                minivans.setVehicleID(sc.nextLine());
                minivans.setSeats(Integer.parseInt(sc.nextLine()));
                minivans.setDoors(Integer.parseInt(sc.nextLine()));
                minivans.setMake(sc.nextLine());
                minivans.setModel(sc.nextLine());
                minivans.setMileage(Integer.parseInt(sc.nextLine()));
                minivans.setYear(Integer.parseInt(sc.nextLine()));
                minivans.setPrice(Double.parseDouble(sc.nextLine()));

                String[] engineInfo = sc.nextLine().split(",");
                engines.setTransmission(engineInfo[0]);
                engines.setCylinders(Integer.parseInt(engineInfo[2]));
                engines.setFourWheelDrive(engineInfo[0] == "4WD ");
                engines.setHybrid(engineInfo[3] == "hybrid");
                engines.setHorsePower(Double.parseDouble(engineInfo[4]));
                minivans.setEngine(engines);
                minivans.setSlidingDoors(sc.nextLine() == "Yes");
                vehicles.add(minivans);
            }
        }
    }
    public static void main(String args[]) throws IOException {
    }
}
