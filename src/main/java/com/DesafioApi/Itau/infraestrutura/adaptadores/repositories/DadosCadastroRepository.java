package com.DesafioApi.Itau.infraestrutura.adaptadores.repositories;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.portas.repositories.DadosCadastroRepositoryPort;
import com.DesafioApi.Itau.infraestrutura.adaptadores.entidades.DadosCadastroEntitiy;
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
    public DadosCadastro buscarcadastroId(Long id) {
        Optional<DadosCadastroEntitiy> dadosCadastroEntitiy = springDadosCadastroRepository.findById(id);

        return dadosCadastroEntitiy.get().toDadosCadastro();
    }
}
