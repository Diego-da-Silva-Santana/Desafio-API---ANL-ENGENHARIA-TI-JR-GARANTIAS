package com.DesafioApi.Itau.dominio;

public class DadosPessoa {
    private  String nome;
    private  String sobreNome;
    private Integer idade;
    private String Pais;

    public DadosPessoa() {
    }

    public DadosPessoa(String nome,
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
