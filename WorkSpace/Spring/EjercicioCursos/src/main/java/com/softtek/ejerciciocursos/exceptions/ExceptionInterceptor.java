package com.softtek.ejerciciocursos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@RestController
public class ExceptionInterceptor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> genericException(
            Exception ex,
            WebRequest webRequest
    ){
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),
                ex.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(NoSuchElementFoundException.class)
    public ResponseEntity<ErrorResponse> exceptionNotFoundModel(
            NoSuchElementFoundException ex,
            WebRequest webRequest
    ){
        ErrorResponse exception = new ErrorResponse(LocalDateTime.now(),
                ex.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
    }
}
