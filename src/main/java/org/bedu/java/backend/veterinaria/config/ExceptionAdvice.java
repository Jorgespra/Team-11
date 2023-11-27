package org.bedu.java.backend.veterinaria.config;

import org.bedu.java.backend.veterinaria.dto.ErrorDTO;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.LinkedList;
import java.util.List;

public class ExceptionAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorDTO validationErrors(MethodArgumentNotValidException ex){
        List<FieldError> fieldErrors =ex.getBindingResult().getFieldErrors();
        List<String> errors = new LinkedList<>();

        for(FieldError fieldError : fieldErrors){
            errors.add(fieldError.getDefaultMessage());
        }

        return new ErrorDTO ("ERR_VALID", "Hubo un error al validar datos de entrada", null);
    }


}
