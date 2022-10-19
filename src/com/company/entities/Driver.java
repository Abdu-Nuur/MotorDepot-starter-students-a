package com.company.entities;



public class Driver {
    private int idDiver;
    private String name;
    private String truckNamed;

    public Driver(int idDiver, String name, String truckNamed) {
        this.idDiver = idDiver;
        this.name = name;
        this.truckNamed = truckNamed;
    }

    public int getIdDiver(int truckId) {
        return idDiver;
    }

    public void setIdDiver(int idDiver) {
        this.idDiver = idDiver;
    }

    public String getName(int driver) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTruckNamed() {
        return truckNamed;
    }

    public void setTruckNamed(String truckNamed) {
        this.truckNamed = truckNamed;
    }

    @Override
    public String toString() {
        int y = 16 - name.length();
        int z = 3 - (idDiver+"").length();
        return idDiver + " ".repeat(z) +  " | " + name + " ".repeat(y) + " | " + truckNamed;
    }
}
