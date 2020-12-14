package com.tutorial.application;

import com.tutorial.data.City;
import com.tutorial.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); INI ERROR KARENA DIA KELAS ABSTRAK JADI GABISA DI INSTANSIASI
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}
