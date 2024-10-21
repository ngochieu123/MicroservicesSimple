package com.example.serviceb.exception;

import com.example.serviceb.exception.common.ErrorResponse;
import com.example.serviceb.exception.custom.MicroservicesGlobalException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MicroservicesGlobalException.class)
    protected ResponseEntity handleGlobalException(MicroservicesGlobalException microservicesGlobalException, Locale locale) {
        return ResponseEntity
                .badRequest()
                .body(ErrorResponse.builder()
                        .code(microservicesGlobalException.getCode())
                        .message(microservicesGlobalException.getMessage())
                        .build());
    }

    @ExceptionHandler({Exception.class})
    protected ResponseEntity handleException(Exception e, Locale locale) {
        return ResponseEntity
                .badRequest()
                .body("Exception occur inside API " + e);
    }
}
