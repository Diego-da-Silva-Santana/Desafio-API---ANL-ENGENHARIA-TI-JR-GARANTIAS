package com.DesafioApi.Itau.dominio.portas.repositories;

import com.DesafioApi.Itau.dominio.DadosCadastro;

// Vai fazer persistencia no banco de dados
public interface DadosCadastroRepositoryPort {
    void salvar(DadosCadastro dadosCadastro);
}
