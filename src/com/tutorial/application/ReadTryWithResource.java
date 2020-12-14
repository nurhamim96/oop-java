package com.tutorial.application;

import java.io.*;

public class ReadTryWithResource {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {

                String line = reader.readLine();

                if (line == null) {
                    break;
                };

                System.out.println(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
