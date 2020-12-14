package com.tutorial.application;

import com.tutorial.data.record_class.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("admin", "rahasia");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Ibad"));
        System.out.println(new LoginRequest("Ibad", "aphasia"));

    }
}
