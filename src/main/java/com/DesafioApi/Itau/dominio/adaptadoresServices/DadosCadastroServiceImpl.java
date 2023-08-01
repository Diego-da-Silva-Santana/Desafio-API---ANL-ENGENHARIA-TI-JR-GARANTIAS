package com.DesafioApi.Itau.dominio.adaptadoresServices;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
import com.DesafioApi.Itau.dominio.portas.interfaces.DadosCadastroServicePort;
import com.DesafioApi.Itau.dominio.portas.repositories.DadosCadastroRepositoryPort;

public class DadosCadastroServiceImpl implements DadosCadastroServicePort {

    private final DadosCadastroRepositoryPort dadosCadastroRepositoryPort;

    public DadosCadastroServiceImpl(DadosCadastroRepositoryPort dadosCadastroRepositoryPort) {
        this.dadosCadastroRepositoryPort = dadosCadastroRepositoryPort;
    }

    @Override
    public void criarCadastro(DadosCadastroDTO dadosCadastroDTO) {
        DadosCadastro dadosCadastro = new DadosCadastro(dadosCadastroDTO);
        this.dadosCadastroRepositoryPort.salvar(dadosCadastro);




    }
}
