package com.DesafioApi.Itau.dominio.dtos;

public class DadosCadastroDTO {
    private String nome;
    private String sobreNome;
    private Integer idade;
    private String pais;

    public DadosCadastroDTO() {
    }

    public DadosCadastroDTO(String nome,
                            String sobreNome,
                            Integer idade,
                            String pais) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.pais = pais;
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
}
