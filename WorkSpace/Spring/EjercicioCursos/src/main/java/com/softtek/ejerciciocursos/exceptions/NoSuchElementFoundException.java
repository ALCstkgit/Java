package com.softtek.ejerciciocursos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoSuchElementFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NoSuchElementFoundException(String mensaje) {
        super(mensaje);
    }
}
