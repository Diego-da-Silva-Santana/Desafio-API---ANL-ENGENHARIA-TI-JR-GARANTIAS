package com.DesafioApi.Itau.dominio.dtos;

public class DadosCadastroDTO {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String pais;

    public DadosCadastroDTO() {
    }

    public DadosCadastroDTO(String nome,
                            String sobrenome,
                            Integer idade,
                            String pais) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getsobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getPais() {
        return pais;
    }


}
