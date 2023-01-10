package com.example.libs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidStudentException extends RuntimeException{
    public InvalidStudentException(String message) {
        super(message);
    }
}
