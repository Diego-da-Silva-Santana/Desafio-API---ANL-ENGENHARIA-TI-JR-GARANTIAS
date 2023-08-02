package com.DesafioApi.Itau.dominio.adaptadoresServices;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
import com.DesafioApi.Itau.dominio.portas.interfaces.DadosCadastroServicePort;
import com.DesafioApi.Itau.dominio.portas.repositories.DadosCadastroRepositoryPort;
import com.DesafioApi.Itau.infraestrutura.adaptadores.repositories.SpringDadosCadastroRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @Override
    public List<DadosCadastroDTO> buscarCadastros() {
        List<DadosCadastro> dadosCadastros = this.dadosCadastroRepositoryPort.buscarTodosCadastro();
        List<DadosCadastroDTO> dadosCadastroDTOS = dadosCadastros.stream().map(DadosCadastro::toDadosCadastroDTO).collect(Collectors.toList());
        return dadosCadastroDTOS;
    }

    @Override
    public DadosCadastroDTO buscarcadastroId(Long id) {
      DadosCadastro dadosCadastro = dadosCadastroRepositoryPort.buscarcadastroId(id);
      DadosCadastroDTO dadosCadastroDTO = dadosCadastro.toDadosCadastroDTO();


        return dadosCadastroDTO;
    }
}
