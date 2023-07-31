package com.DesafioApi.Itau.dominio.dtos;

public class DadosPessoaDTO {

    private  String nome;
    private  String sobreNome;
    private Integer idade;
    private String Pais;

    public DadosPessoaDTO() {
    }

    public DadosPessoaDTO(String nome,
                          String sobreNome,
                          Integer idade,
                          String pais) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        Pais = pais;
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
        return Pais;
    }
}
