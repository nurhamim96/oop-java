package com.tutorial.application;

import com.tutorial.data.enum_class.Customer;
import com.tutorial.data.enum_class.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Ibad");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        /* Konversi Dari Enum ke String | String ke Enum */

        String levelName = Level.VIP.name(); // Enum -> String
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM"); // String -> Enum
        System.out.println(level);

        System.out.println("============ Get All Level Enum ==============");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
