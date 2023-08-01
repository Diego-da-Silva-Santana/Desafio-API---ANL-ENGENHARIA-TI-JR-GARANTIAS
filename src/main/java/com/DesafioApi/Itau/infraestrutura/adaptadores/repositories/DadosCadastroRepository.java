package com.DesafioApi.Itau.infraestrutura.adaptadores.repositories;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.portas.repositories.DadosCadastroRepositoryPort;
import com.DesafioApi.Itau.infraestrutura.adaptadores.entidades.DadosCadastroEntitiy;
import org.springframework.stereotype.Component;

@Component
public class DadosCadastroRepository implements DadosCadastroRepositoryPort {
    private final  SpringDadosCadastroRepository springDadosCadastroRepository;

    public DadosCadastroRepository(SpringDadosCadastroRepository springDadosCadastroRepository) {
        this.springDadosCadastroRepository = springDadosCadastroRepository;
    }

    @Override
    public void salvar(DadosCadastro dadosCadastro) {
        DadosCadastroEntitiy dadosCadastroEntitiy ;
        dadosCadastroEntitiy = new DadosCadastroEntitiy(dadosCadastro);
        springDadosCadastroRepository.save(dadosCadastroEntitiy);




    }
}
