package com.DesafioApi.Itau.dominio.portas.interfaces;

import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;

public interface DadosCadastroServicePort {

    void criarCadastro(DadosCadastroDTO dadosCadastroDTO);
}
