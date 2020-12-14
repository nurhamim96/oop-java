package com.tutorial.data;

public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + " My name is manager " + this.name);
    }
}
