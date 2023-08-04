package com.DesafioApi.Itau.dominio.adaptadoresServices;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
import com.DesafioApi.Itau.dominio.portas.interfaces.DadosCadastroServicePort;
import com.DesafioApi.Itau.dominio.portas.repositories.DadosCadastroRepositoryPort;

import java.util.List;
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
        DadosCadastro dadosCadastro = dadosCadastroRepositoryPort.buscarCadastroId(id);
        DadosCadastroDTO dadosCadastroDTO = dadosCadastro.toDadosCadastroDTO();

        return dadosCadastroDTO;
    }

    @Override
    public void deletarCadastro(Long id) {
        dadosCadastroRepositoryPort.deletarCadastro(id);
    }

    @Override
    public DadosCadastroDTO atualizarDados(Long id, DadosCadastroDTO dadosCadastroDTO) {
        DadosCadastro dadosCadastro = dadosCadastroRepositoryPort.atualizarDados(id, dadosCadastroDTO);
        DadosCadastroDTO cadastroDTO = dadosCadastro.toDadosCadastroDTO();

        return cadastroDTO;
    }
}
