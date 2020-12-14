package com.tutorial.data.variable_hiding;

public class Child extends Parent {
    public String name;

    public void doIt() {
        System.out.println("Child do it.");
        System.out.println("Child do it." + super.name);
    }
}
