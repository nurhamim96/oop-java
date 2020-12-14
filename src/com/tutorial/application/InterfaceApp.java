package com.tutorial.application;

import com.tutorial.data.java_interface.Avanza;
import com.tutorial.data.java_interface.Car;

public class InterfaceApp {
    public static void main(String[] args) {
        Car car = new Avanza();

        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.hasBrand());
        System.out.println(((Avanza) car).isMaintenance());
    }
}
