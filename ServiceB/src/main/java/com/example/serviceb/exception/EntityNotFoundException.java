package com.example.serviceb.exception;

public class EntityNotFoundException extends ServiceBException {
    public EntityNotFoundException() {
        super("Requested entity not present in the DB.", GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);
    }

    public EntityNotFoundException(String message) {
        super(message, GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);
    }
}
