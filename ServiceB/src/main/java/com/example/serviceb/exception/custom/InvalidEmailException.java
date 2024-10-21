package com.example.serviceb.exception.custom;

public class InvalidEmailException extends MicroservicesGlobalException {
    public InvalidEmailException(String message, String code) {
        super(message, code);
    }
}
