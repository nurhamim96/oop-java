package com.tutorial.application;

import com.tutorial.data.variable_hiding.Child;
import com.tutorial.data.variable_hiding.Parent;

public class VariableHidingApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Ibad";
        System.out.println(child.name);
        child.doIt();

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
