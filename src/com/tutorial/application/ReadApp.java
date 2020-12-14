package com.tutorial.application;
import java.io.*;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                    new FileReader("README.md")
            );

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("File tidak ditemukan " + throwable.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("File berhasil ditutup.");
                } catch (IOException exception) {
                    System.out.println("Error menutup resource " + exception.getMessage());
                }

            }
        }
    }
}
