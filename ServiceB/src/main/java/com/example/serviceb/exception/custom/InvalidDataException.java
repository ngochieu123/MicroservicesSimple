package com.example.serviceb.exception.custom;

public class InvalidDataException extends MicroservicesGlobalException {
    public InvalidDataException(String message, String code) {
        super(message, code);
    }
}
