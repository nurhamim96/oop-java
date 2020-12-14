package com.tutorial.application;

import com.tutorial.error.ErrorWithRuntimeException;

public class ErrorRuntimeException {
    public static void main(String[] args) {

        loginApp("Ibad", "kompleks");
//        loginApp(null, "kompleks");
            System.out.println("Login sukses!");

    }

    public static void loginApp(String username, String password) {
        if (username == null || password == null) {
            throw new ErrorWithRuntimeException("Error with runtime exception example");
        }
    }
}
