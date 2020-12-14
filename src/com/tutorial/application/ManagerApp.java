package com.tutorial.application;

import com.tutorial.data.Employee;
import com.tutorial.data.Manager;
import com.tutorial.data.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {
        var vp = new VicePresident("Ibad");
        vp.sayHello("Budi");

        var manager = new Manager("Ibad");
        manager.sayHello("Eko");


        /* CONTOH POLYMORPHISME */
        System.out.println("====================== POLYMORPHISME =======================");
        Employee employee = new Employee("Ibad");
        employee.sayHello("Agus");

        employee = new Manager("Joko");
        employee.sayHello("Bambang");

        employee = new VicePresident("Ibad");
        employee.sayHello("Eko");

        System.out.println("====================== TYPE CHECK AND CASTS =======================");

        sayHello(new Employee("Budi"));
        sayHello(new Manager("Ibad"));
        sayHello(new VicePresident("Bambang"));

    }

    // Ini contoh Type check and casts
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hi, VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hi, Manager " + manager.name);
        } else {
            System.out.println("Hi, " + employee.name);

        }

    }
}
