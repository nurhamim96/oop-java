package com.tutorial.data;

public class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + " My name is Employee " + this.name);
    }
}
