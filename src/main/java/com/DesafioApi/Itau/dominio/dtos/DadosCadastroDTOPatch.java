package com.DesafioApi.Itau.dominio.dtos;

public class DadosCadastroDTOPatch {

    private String pais;

    public DadosCadastroDTOPatch() {
    }

    public DadosCadastroDTOPatch(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
}
