package org.bedu.java.backend.veterinaria.config;

import java.util.LinkedList;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

import org.bedu.java.backend.veterinaria.dto.ErrorDTO;
import org.bedu.java.backend.veterinaria.exception.RuntimeException;
import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO validationErrors(MethodArgumentNotValidException ex) {
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        List<String> errors = new LinkedList<>();

        for (FieldError fieldError : fieldErrors) {
            errors.add(fieldError.getDefaultMessage());
        }

        return new ErrorDTO("ERR_VALID", "Hubo un error al validar los datos de entrada", errors);
    }

    @ExceptionHandler(RuntimeException.class)
    public ErrorDTO applicationError(RuntimeException ex) {
        return new ErrorDTO(ex.getCode(), ex.getMessage(), ex.getDetails());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDTO unknownErrors(Exception ex) {
        log.error(ex.getMessage());
        return new ErrorDTO("ERR_UNKNOWN", "Hubo un error desconocido", null);
    }
}