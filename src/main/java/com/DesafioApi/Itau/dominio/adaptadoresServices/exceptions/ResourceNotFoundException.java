package com.DesafioApi.Itau.dominio.adaptadoresServices.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Id não encontrado " + id);
    }
}
