package com.DesafioApi.Itau.dominio;

import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;

public class DadosCadastro {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String pais;

    public DadosCadastro() {
    }

    public DadosCadastro(String nome, String sobrenome, Integer idade, String pais) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.pais = pais;
    }

    public DadosCadastro(DadosCadastroDTO dadosCadastroDTO) {
        this.nome = dadosCadastroDTO.getNome();
        this.sobrenome = dadosCadastroDTO.getsobrenome();
        this.idade = dadosCadastroDTO.getIdade();
        this.pais = dadosCadastroDTO.getPais();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getPais() {
        return pais;
    }

    public DadosCadastroDTO toDadosCadastroDTO() {
        return new DadosCadastroDTO(nome, sobrenome, idade, pais);
    }
}
