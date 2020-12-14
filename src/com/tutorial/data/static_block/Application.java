package com.tutorial.data.static_block;

public class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses kelas Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
