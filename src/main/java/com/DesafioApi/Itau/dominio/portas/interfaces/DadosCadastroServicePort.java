package com.DesafioApi.Itau.dominio.portas.interfaces;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;

import java.util.List;
import java.util.Optional;

public interface DadosCadastroServicePort {

    void criarCadastro(DadosCadastroDTO dadosCadastroDTO);
    List<DadosCadastroDTO> buscarCadastros();

    public DadosCadastroDTO buscarcadastroId(Long id);


}
