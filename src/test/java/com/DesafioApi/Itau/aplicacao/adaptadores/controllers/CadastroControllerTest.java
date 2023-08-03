package com.DesafioApi.Itau.aplicacao.adaptadores.controllers;

import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
import com.DesafioApi.Itau.dominio.portas.repositories.DadosCadastroRepositoryPort;
import org.aspectj.weaver.ast.Var;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class CadastroControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private DadosCadastroDTO dadosCadastroDTO;
    @MockBean
    DadosCadastroRepositoryPort dadosCadastroRepositoryPort;



    @Test
    void criarCadastro() {
    }

    @Test
    void buscarCadastros() {

        dadosCadastroDTO = new DadosCadastroDTO("diego", "santana",25,"Brasil");
    }

    @Test
    void buscarCadastroId() {
    }

    @Test
    void deletarCadastro() {
    }

    @Test
    void atualizarDados() {
    }
}