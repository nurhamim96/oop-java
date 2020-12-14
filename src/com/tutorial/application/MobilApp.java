package com.tutorial.application;

import com.tutorial.data.Mobil;

public class MobilApp {
    public static void main(String[] args) {
        var mobil = new Mobil("Avanza", "Toyota", "B451");
        var hondaJazz = new Mobil("Honda Jazz", "Honda", "A184D");

        System.out.println(mobil);
        System.out.println(hondaJazz);
    }
}
