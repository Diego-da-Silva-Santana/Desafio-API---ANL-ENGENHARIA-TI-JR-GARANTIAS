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
    public ResponseEntity<List<DadosCadastroDTO>> buscarCadastros() {

        List<DadosCadastroDTO> list = dadosCadastroServicePort.buscarCadastros();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<DadosCadastroDTO> buscarCadastroId(@PathVariable Long id) {

        DadosCadastroDTO dadosCadastroDTO = dadosCadastroServicePort.buscarcadastroId(id);

        if (dadosCadastroDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(dadosCadastroDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarCadastro(@PathVariable Long id) {

        dadosCadastroServicePort.deletarCadastro(id);

        return ResponseEntity.noContent().build();

    }

//    @PatchMapping(value = "/{id}")
//    public ResponseEntity<DadosCadastroDTO> atualizarDados(@RequestBody DadosCadastroDTO dadosCadastroDTO, @PathVariable("id") Long id) {
//
//        DadosCadastroDTO dadoParaAtualizar = dadosCadastroServicePort.atualizarDados(id,dadosCadastroDTO);
//        //DadosCadastroDTO dadosCadastroDTO1 = dadosCadastroServicePort.atualizarDados(id);
//        BeanUtils.copyProperties(dadoParaAtualizar, dadosCadastroDTO);
//
//
//        //return ResponseEntity.ok().body(dadosCadastroDTO1);
//        return null;
//    }

//    @PatchMapping(value = "/{id}")
//    public ResponseEntity<DadosCadastroDTO> atualizarDados( @PathVariable("id") Long id) {
//
//
//        return null;
//    }


}
