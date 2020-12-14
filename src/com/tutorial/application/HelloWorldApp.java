package com.tutorial.application;

import com.tutorial.data.anonymous_class.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello Guys");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {

            public void sayHello() {
                System.out.println("Halo");
            }

            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Ibad");
        System.out.println("==========================");
        indonesia.sayHello();
        indonesia.sayHello("Ibad");
    }
}
