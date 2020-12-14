package com.tutorial.application;

import static com.tutorial.data.static_block.Application.PROCESSORS; // INI CONTOH IMPORT STATIC (SINGLE IMPORT)
import static com.tutorial.data.static_keyword.Constant.*; // INI CONTOH IMPORT STATIC (ALL IMPORT)
import com.tutorial.data.static_keyword.Contry;
import com.tutorial.data.static_keyword.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5)
        );

        Contry.City city = new Contry.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
