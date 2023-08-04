package com.DesafioApi.Itau.dominio.portas.interfaces;

import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTOPatch;

import java.util.List;

public interface DadosCadastroServicePort {

    void criarCadastro(DadosCadastroDTO dadosCadastroDTO);

    List<DadosCadastroDTO> buscarCadastros();

    DadosCadastroDTO buscarcadastroId(Long id);

    void deletarCadastro(Long id);

    //DadosCadastroDTO atualizarDados(Long id, DadosCadastroDTOPatch dadosCadastroDTOPatch);

}
