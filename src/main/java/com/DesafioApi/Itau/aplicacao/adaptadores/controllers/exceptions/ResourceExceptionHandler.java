package com.DesafioApi.Itau.aplicacao.adaptadores.controllers.exceptions;

import com.DesafioApi.Itau.infraestrutura.adaptadores.repositories.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ResponseError> resourceNotFound(ResourceNotFoundException e) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        ResponseError err = new ResponseError(status.value(), e.getMessage());

        return ResponseEntity.status(status).body(err);
    }
}
