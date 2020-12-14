package com.tutorial.error;

public class ErrorWithRuntimeException extends RuntimeException{
    public ErrorWithRuntimeException(String message) {
        super(message);
    }
}
