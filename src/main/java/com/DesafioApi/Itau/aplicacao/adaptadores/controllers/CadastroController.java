package com.DesafioApi.Itau.aplicacao.adaptadores.controllers;

import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
import com.DesafioApi.Itau.dominio.portas.interfaces.DadosCadastroServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastro")
public class CadastroController {
    private final DadosCadastroServicePort dadosCadastroServicePort;

    public CadastroController(DadosCadastroServicePort dadosCadastroServicePort) {
        this.dadosCadastroServicePort = dadosCadastroServicePort;
    }

    @PostMapping
    public ResponseEntity<DadosCadastroDTO> criarCadastro(@RequestBody DadosCadastroDTO dadosCadastroDTO) {
        dadosCadastroServicePort.criarCadastro(dadosCadastroDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<DadosCadastroDTO>> buscarCadastros(){
        List<DadosCadastroDTO> list = dadosCadastroServicePort.buscarCadastros();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity<DadosCadastroDTO> buscarcadastroId(@PathVariable Long id){
        DadosCadastroDTO dadosCadastroDTO = dadosCadastroServicePort.buscarcadastroId(id);

        return ResponseEntity.ok().body(dadosCadastroDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarCadastro(@PathVariable Long id){
        dadosCadastroServicePort.deletarCadastro(id);
        return ResponseEntity.noContent().build();

    }






}
