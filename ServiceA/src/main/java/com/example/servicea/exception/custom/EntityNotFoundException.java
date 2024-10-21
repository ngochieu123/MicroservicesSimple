package com.example.servicea.exception.custom;

import com.example.servicea.exception.common.GlobalErrorCode;

public class EntityNotFoundException extends MicroservicesGlobalException {
    public EntityNotFoundException() {
        super("Requested entity not present in the DB.", GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);
    }

    public EntityNotFoundException (String message) {
        super(message, GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);
    }
}