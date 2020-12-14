package com.tutorial.application;

import com.tutorial.anotation.Fancy;
import com.tutorial.data.Animal;
import com.tutorial.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Meong...";
        animal.run();
    }
}
