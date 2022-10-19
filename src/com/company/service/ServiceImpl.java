package com.company.service;


import com.company.entities.Driver;
import com.company.entities.State;
import com.company.entities.Truck;

import java.util.ArrayList;
import java.util.List;

import static com.company.Main.*;


public class ServiceImpl implements Service {
    List<Truck> trucks = new ArrayList<>(List.of(GSON.fromJson(readTtuck(), Truck[].class)));
    List<Driver> drivers = new ArrayList<>(List.of(GSON.fromJson(readDriver(), Driver[].class)));


    public List<Truck> getTrucks() {
        return trucks;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    @Override
    public void changeDriver(int truckId, int driverId) {
        truckId--;
        driverId--;

        trucks.get(truckId).setDriver(drivers.get(driverId).getName(driverId));
        System.out.println("""
                #   | Bus              |  Driver   |  State
                ————|——————————————————|———————————|—————————>""");
        for (Truck t : trucks) {
            System.out.println(t);
        }
        System.out.println("\n");

        drivers.get(driverId).setTruckNamed(trucks.get(truckId).getTruckName(truckId));
        System.out.println("""
                #   | Driver           | Bus
                ————|——————————————————|——————————>""");
        for (Driver d : drivers) {
            System.out.println(d);
        }

    }

    @Override
    public void startDriving(int truckId) {
        truckId--;
        if (trucks.get(truckId).getState() != State.ROUTE) {
            System.out.println("""
                #   | Bus              |  Driver   |  State
                ————|——————————————————|———————————|—————————>""");
            for (Truck t : trucks) {
                trucks.get(truckId).setState(State.ROUTE);
                System.out.println(t);
            }
        } else {
            System.out.println("the truck is already under route");
        }
    }

    @Override
    public void startRepair(int truckId) {
        truckId--;
        if (trucks.get(truckId).getState() != State.REPAIR) {
            System.out.println("""
                #   | Bus              |  Driver   |  State
                ————|——————————————————|———————————|—————————>""");
            for (Truck t : trucks) {
                trucks.get(truckId).setState(State.REPAIR);
                System.out.println(t);
            }
        } else {
            System.out.println("the truck is already under repair");
        }
    }

    @Override
    public void changeTruckState() {

    }
}












