package com.DesafioApi.Itau.aplicacao.adaptadores.controllers;

import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
import com.DesafioApi.Itau.dominio.portas.interfaces.DadosCadastroServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cadastro")
public class CadastroController {
    private final DadosCadastroServicePort dadosCadastroServicePort;

    public CadastroController(DadosCadastroServicePort dadosCadastroServicePort) {
        this.dadosCadastroServicePort = dadosCadastroServicePort;
    }

    @PostMapping
    public ResponseEntity<DadosCadastroDTO> criarCadastro(@RequestBody DadosCadastroDTO dadosCadastroDTO){
        dadosCadastroServicePort.criarCadastro(dadosCadastroDTO);


        return ResponseEntity.ok().body(dadosCadastroDTO);
    }




}
