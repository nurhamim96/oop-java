package com.tutorial.application;

import com.tutorial.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
//        connectToDatabase(null, "rahasia");
        connectToDatabase("Ibad", "rahasia");
        System.out.println("Berhasil terkoneksi ke database");
    }

    public static void connectToDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Gagal koneksi ke database!");
        }
    }
}
