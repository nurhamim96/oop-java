package com.tutorial.application;

import com.tutorial.data.CreateUserRequest;
import com.tutorial.utils.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserName("Ibad");
        createUserRequest.setPassword("p@s$w0rd");

        ValidationUtil.validationReflection(createUserRequest);
    }
}
