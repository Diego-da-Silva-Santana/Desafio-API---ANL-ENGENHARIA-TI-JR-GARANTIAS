package com.DesafioApi.Itau.infraestrutura.adaptadores.repositories;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
import com.DesafioApi.Itau.dominio.portas.repositories.DadosCadastroRepositoryPort;
import com.DesafioApi.Itau.infraestrutura.adaptadores.entidades.DadosCadastroEntitiy;
import com.DesafioApi.Itau.infraestrutura.adaptadores.repositories.exceptions.ResourceNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class DadosCadastroRepository implements DadosCadastroRepositoryPort {
    private final SpringDadosCadastroRepository springDadosCadastroRepository;

    public DadosCadastroRepository(SpringDadosCadastroRepository springDadosCadastroRepository) {
        this.springDadosCadastroRepository = springDadosCadastroRepository;
    }

    @Override
    public void salvar(DadosCadastro dadosCadastro) {
        DadosCadastroEntitiy dadosCadastroEntitiy;
        dadosCadastroEntitiy = new DadosCadastroEntitiy(dadosCadastro);
        springDadosCadastroRepository.save(dadosCadastroEntitiy);
    }

    @Override
    public List<DadosCadastro> buscarTodosCadastro() {
        List<DadosCadastroEntitiy> dadosCadastroEntitiys = this.springDadosCadastroRepository.findAll();

        return dadosCadastroEntitiys.stream().map(DadosCadastroEntitiy::toDadosCadastro).collect(Collectors.toList());
    }

    @Override
    public DadosCadastro buscarCadastroId(Long id) {
        Optional<DadosCadastroEntitiy> dadosCadastroEntitiy = this.springDadosCadastroRepository.findById(id);

        return dadosCadastroEntitiy.orElseThrow(() -> new ResourceNotFoundException(id)).toDadosCadastro();

    }

    @Override
    public void deletarCadastro(Long id) {
        try {
            springDadosCadastroRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {

            throw new ResourceNotFoundException(id);
        }
    }

    @Override
    public DadosCadastro atualizarDados(Long id, DadosCadastroDTO dadosCadastroDTO) {
        Optional<DadosCadastroEntitiy> possivelDadosCadastroEntitiy = this.springDadosCadastroRepository.findById(id);
        possivelDadosCadastroEntitiy.isEmpty();
        DadosCadastroEntitiy dadosCadastroEntitiy = possivelDadosCadastroEntitiy.get();
        dadosCadastroEntitiy.atualizarDadosCadastro(dadosCadastroDTO);
        springDadosCadastroRepository.save(dadosCadastroEntitiy);

        return dadosCadastroEntitiy.toDadosCadastro();

    }
}