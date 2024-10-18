package com.example.serviceb.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceBException extends RuntimeException {
    private String code;
    private String message;

    public ServiceBException(String message) {
        super(message);
    }
}
