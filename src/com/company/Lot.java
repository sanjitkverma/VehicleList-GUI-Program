/*
 *MP2 COMP 167 Sanjit Verma
 */
package com.company;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
//Lotname String
public class Lot{
    String lotName;

    //Vehicle Arraylist
    ArrayList<Vehicle> vehicles;
    List<String> ignoreAll= Arrays.asList("and","it", "you");

    public static void main(String[] args) throws IOException {
        Lot add = new Lot();

        add.loadVehicles("lot.txt");
        add.saveVehicles("lot.txt");
    }
    //Lot()
    public Lot(){
        vehicles=new ArrayList<>();
    }

    public String getLotName() {
        return lotName;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    //Load Vehicle
    public void loadVehicles (String fileName) throws IOException {
        File fl = new File(fileName);
        Scanner sc = new Scanner(fl);

        while (sc.hasNext()) {
            String type = sc.nextLine().trim();
            sc.skip("Year: ");
            int year = Integer.parseInt(sc.nextLine().trim());
            sc.skip("Make: ");
            String make = sc.nextLine();
            sc.skip("Model: ");
            String model = sc.nextLine();
            sc.skip("Mileage:");
            int mileage = Integer.parseInt(sc.nextLine().trim());
            sc.skip("Miles Per Gallon: ");
            int mpg = Integer.parseInt(sc.nextLine());
            sc.skip("Color: ");
            String color = sc.nextLine();
            sc.skip("Seats: ");
            int seats = Integer.parseInt(sc.nextLine());
            sc.skip("Doors: ");
            int doors = Integer.parseInt(sc.nextLine());
            sc.skip("Price: ");
            double price = Double.parseDouble(sc.nextLine());
            sc.skip("VehicleID: ");
            String id = sc.nextLine();
            sc.skip("Engine specifications");
            String[] engineInfo = sc.nextLine().split(", ");
            if (type.equals("Car")||type.equals("car")) {
                Engine newEngine = new Engine();
                newEngine.setTransmission(engineInfo[0]);
                newEngine.setFourWheelDrive(engineInfo[1] == "4WD");
                String[] cylinders = engineInfo[2].split(" ");
                newEngine.setCylinders(Integer.parseInt(cylinders[0]));
                newEngine.setHybrid(engineInfo[3] == "hybrid");
                String[] hp = engineInfo[4].split("");
                newEngine.setHorsePower(Double.parseDouble(hp[0]));

                Car cars = new Car();
                cars.setYear(year);
                cars.setMake(make);
                cars.setModel(model);
                cars.setMileage(mileage);
                cars.setMpg(mpg);
                cars.setColor(color);
                cars.setSeats(seats);
                cars.setDoors(doors);
                cars.setPrice(price);
                cars.setVehicleID(id);
                cars.setEngine(newEngine);
                sc.skip("Convertible: ");
                cars.setConvertible(sc.nextLine().trim().equals("Yes"));
                vehicles.add(cars);
            }
            else if (type.equals("Truck")||type.equals("truck")){
                Engine newEngine = new Engine();
                newEngine.setTransmission(engineInfo[0]);
                newEngine.setFourWheelDrive(engineInfo[1] == "4WD");
                String[] cylinders = engineInfo[2].split(" ");
                newEngine.setCylinders(Integer.parseInt(cylinders[0]));
                newEngine.setHybrid(engineInfo[3] == "hybrid");
                String[] hp = engineInfo[4].split("");
                newEngine.setHorsePower(Double.parseDouble(hp[0]));

                Truck trucks = new Truck();
                trucks.setYear(year);
                trucks.setMake(make);
                trucks.setModel(model);
                trucks.setMileage(mileage);
                trucks.setMpg(mpg);
                trucks.setColor(color);
                trucks.setSeats(seats);
                trucks.setDoors(doors);
                trucks.setPrice(price);
                trucks.setVehicleID(id);
                trucks.setEngine(newEngine);
                sc.skip("Bed Space: ");
                trucks.setBedSpace(Double.parseDouble(sc.nextLine()));
                vehicles.add(trucks);

            }
            else if (type.equals("SUV")||type.equals("suv")) {
                Engine newEngine = new Engine();
                newEngine.setTransmission(engineInfo[0]);
                newEngine.setFourWheelDrive(engineInfo[1] == "4WD");
                String[] cylinders = engineInfo[2].split(" ");
                newEngine.setCylinders(Integer.parseInt(cylinders[0]));
                newEngine.setHybrid(engineInfo[3] == "hybrid");
                String[] hp = engineInfo[4].split("");
                newEngine.setHorsePower(Double.parseDouble(hp[0]));

                SUV suvs = new SUV();
                suvs.setYear(year);
                suvs.setMake(make);
                suvs.setModel(model);
                suvs.setMileage(mileage);
                suvs.setMpg(mpg);
                suvs.setColor(color);
                suvs.setSeats(seats);
                suvs.setDoors(doors);
                suvs.setPrice(price);
                suvs.setVehicleID(id);
                suvs.setEngine(newEngine);
                sc.skip("Cargo Space: ");
                suvs.setCargoSpace(Double.parseDouble(sc.nextLine()));

                sc.skip("Removable Seats:");
                suvs.setRemovableSeats(sc.nextLine().trim().equals("Yes"));
                vehicles.add(suvs);
            }

            else if (type.equals("Van") ||type.equals("van")) {
                Engine newEngine = new Engine();
                newEngine.setTransmission(engineInfo[0]);
                newEngine.setFourWheelDrive(engineInfo[1] == "4WD");
                String[] cylinders = engineInfo[2].split(" ");
                newEngine.setCylinders(Integer.parseInt(cylinders[0]));
                newEngine.setHybrid(engineInfo[3] == "hybrid");
                String[] hp = engineInfo[4].split("");
                newEngine.setHorsePower(Double.parseDouble(hp[0]));

                Minivan minivans = new Minivan();
                minivans.setYear(year);
                minivans.setMake(make);
                minivans.setModel(model);
                minivans.setMileage(mileage);
                minivans.setMpg(mpg);
                minivans.setColor(color);
                minivans.setSeats(seats);
                minivans.setDoors(doors);
                minivans.setPrice(price);
                minivans.setVehicleID(id);
                minivans.setEngine(newEngine);
                sc.skip("Sliding doors: ");
                minivans.setSlidingDoors(sc.nextLine().equals("Yes"));
                vehicles.add(minivans);
            }
        }
    }
    //Save Vehicle
    public void saveVehicles (String fileName) throws IOException {
        FileWriter write= new FileWriter(fileName);
        for(Vehicle v:vehicles) {
            String save="       ";
            save += v.toString();
            write.write(save);
        }
        write.close();
    }
}