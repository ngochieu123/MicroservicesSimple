package com.example.servicea.exception.custom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MicroservicesGlobalException extends RuntimeException {

    private String code;
    private String message;

    public MicroservicesGlobalException(String message) {
        super(message);
    }
}