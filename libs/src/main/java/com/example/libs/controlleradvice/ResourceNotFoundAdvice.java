package com.example.libs.controlleradvice;

import com.example.libs.exception.ResourceNotFoundException;
import com.example.libs.payload.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceNotFoundAdvice {

//    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity resourceNotFoundHandler() {
        return ResponseEntity.internalServerError().body(BaseResponse.builder()
                .code("404")
                .message("Resource is not found")
                .build());
    }
}
