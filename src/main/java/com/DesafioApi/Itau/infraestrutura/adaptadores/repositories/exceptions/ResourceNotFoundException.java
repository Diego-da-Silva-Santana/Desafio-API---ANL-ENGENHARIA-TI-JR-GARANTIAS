package com.DesafioApi.Itau.infraestrutura.adaptadores.repositories.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Id " + id + " não foi encontrado");
    }
}


