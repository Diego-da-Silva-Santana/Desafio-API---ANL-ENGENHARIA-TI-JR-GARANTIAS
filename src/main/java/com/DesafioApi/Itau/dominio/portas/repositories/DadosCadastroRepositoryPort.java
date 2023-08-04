package com.DesafioApi.Itau.dominio.portas.repositories;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;

import java.util.List;


public interface DadosCadastroRepositoryPort {
    void salvar(DadosCadastro dadosCadastro);

    List<DadosCadastro> buscarTodosCadastro();

    DadosCadastro buscarCadastroId(Long id);

    void deletarCadastro(Long id);

    DadosCadastro atualizarDados(Long id, DadosCadastroDTO dadosCadastroDTO);


}
