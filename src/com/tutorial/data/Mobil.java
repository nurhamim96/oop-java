package com.tutorial.data;

public class Mobil {
    private String name;
    private String brand;
    private String nopol;

    public Mobil(String name, String brand, String nopol) {
        this.name = name;
        this.brand = brand;
        this.nopol = nopol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", nopol='" + nopol + '\'' +
                '}';
    }


}
