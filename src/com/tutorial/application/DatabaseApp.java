package com.tutorial.application;

import com.tutorial.error.DatabaseError;

// Note : Error exception tidak di rekomendasikan menggunakan try-catch.
// gunakan Error exception pada error yang fatal yang menyebabkan aplikasinya tidak bisa berjalan dengan baik. seperti Gagal koneksi ke Database.

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
