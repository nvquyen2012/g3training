package com.example.demomapstruct.exception;

//@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such student")
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Long id) {
        super("Student not found with id: " + id);
    }
}
