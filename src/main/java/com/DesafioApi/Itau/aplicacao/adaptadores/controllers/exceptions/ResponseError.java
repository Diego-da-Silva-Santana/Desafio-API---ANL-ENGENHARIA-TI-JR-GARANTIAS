package com.DesafioApi.Itau.aplicacao.adaptadores.controllers.exceptions;

public class ResponseError {

    private Integer status;
    private String error;

    public ResponseError() {
    }

    public ResponseError(Integer status, String error) {
        this.status = status;
        this.error = error;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
