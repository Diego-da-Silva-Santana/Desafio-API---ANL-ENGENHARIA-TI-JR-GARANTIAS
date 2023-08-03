package com.DesafioApi.Itau.dominio;

import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;

public class DadosCadastro {
    private String nome;
    private String sobreNome;
    private Integer idade;
    private String pais;

    public DadosCadastro() {
    }

    public DadosCadastro(String nome, String sobreNome, Integer idade, String pais) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.pais = pais;
    }

    public DadosCadastro(DadosCadastroDTO dadosCadastroDTO) {
        this.nome = dadosCadastroDTO.getNome();
        this.sobreNome = dadosCadastroDTO.getSobreNome();
        this.idade = dadosCadastroDTO.getIdade();
        this.pais = dadosCadastroDTO.getPais();
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getPais() {
        return pais;
    }

    public DadosCadastroDTO toDadosCadastroDTO() {
        return new DadosCadastroDTO(nome, sobreNome, idade, pais);
    }
}
