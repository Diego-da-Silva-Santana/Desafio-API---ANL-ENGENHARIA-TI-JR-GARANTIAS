package com.DesafioApi.Itau.infraestrutura.configuracao;

import com.DesafioApi.Itau.dominio.adaptadoresServices.DadosCadastroServiceImpl;
import com.DesafioApi.Itau.dominio.portas.interfaces.DadosCadastroServicePort;
import com.DesafioApi.Itau.dominio.portas.repositories.DadosCadastroRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {
    @Bean
    DadosCadastroServicePort dadosCadastroService(DadosCadastroRepositoryPort dadosCadastroRepositoryPort) {
        return new DadosCadastroServiceImpl(dadosCadastroRepositoryPort);
    }
}
