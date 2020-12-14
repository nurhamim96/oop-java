package com.tutorial.data.java_interface;

public class Avanza implements Car, IsMaintenance{

    public void drive() {
        System.out.println("This is Avanza Car");
    }


    public int getTire() {
        return 4;
    }

    public String hasBrand() {
        var brand = "Toyota";
        return brand;
    }


    public boolean isMaintenance() {
        return false;
    }
}
