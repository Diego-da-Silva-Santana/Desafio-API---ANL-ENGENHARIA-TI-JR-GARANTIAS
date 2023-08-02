package com.DesafioApi.Itau.dominio.portas.repositories;

import com.DesafioApi.Itau.dominio.DadosCadastro;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface DadosCadastroRepositoryPort {
    void salvar(DadosCadastro dadosCadastro);
    List<DadosCadastro> buscarTodosCadastro();

   DadosCadastro buscarcadastroId(Long id);
   void deletarCadastro(Long id);


}
