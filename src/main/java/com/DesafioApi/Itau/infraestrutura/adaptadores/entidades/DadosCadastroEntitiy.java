package com.DesafioApi.Itau.infraestrutura.adaptadores.entidades;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import jakarta.persistence.*;

@Entity
@Table(name = "dados_cadastro")
public class DadosCadastroEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String pais;

    public DadosCadastroEntitiy() {
    }
    public Long getId(){
        return codigo;
    }

    public DadosCadastroEntitiy(DadosCadastro dadosCadastro) {
        this.nome = dadosCadastro.getNome();
        this.sobrenome = dadosCadastro.getSobreNome();
        this.idade = dadosCadastro.getIdade();
        this.pais = dadosCadastro.getPais();
    }

    public DadosCadastro toDadosCadastro() {
        return new DadosCadastro(this.nome, this.sobrenome, this.idade, this.pais);
    }
}
