package com.example.libs.controlleradvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ConstraintValidationException extends ResponseEntityExceptionHandler {

//    private String getErrorMessagesFromException(MethodArgumentNotValidException ex) {
//        return ex.getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(", "));
//    }
}
