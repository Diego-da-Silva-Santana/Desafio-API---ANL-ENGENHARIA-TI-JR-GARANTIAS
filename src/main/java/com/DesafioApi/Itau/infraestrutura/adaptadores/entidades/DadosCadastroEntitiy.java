package com.DesafioApi.Itau.infraestrutura.adaptadores.entidades;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import com.DesafioApi.Itau.dominio.dtos.DadosCadastroDTO;
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

    public DadosCadastroEntitiy(DadosCadastro dadosCadastro) {
        this.nome = dadosCadastro.getNome();
        this.sobrenome = dadosCadastro.getSobrenome();
        this.idade = dadosCadastro.getIdade();
        this.pais = dadosCadastro.getPais();
    }

    public DadosCadastro toDadosCadastro() {
        return new DadosCadastro(this.nome, this.sobrenome, this.idade, this.pais);
    }

    public void atualizarDadosCadastro(DadosCadastroDTO dadosCadastroDTO) {

        if (dadosCadastroDTO.getNome() != null) {
            this.nome = dadosCadastroDTO.getNome();
        }

        if (dadosCadastroDTO.getsobrenome() != null) {
            this.sobrenome = dadosCadastroDTO.getsobrenome();
        }

        if (dadosCadastroDTO.getIdade() != null) {
            this.idade = dadosCadastroDTO.getIdade();
        }

        if (dadosCadastroDTO.getPais() != null) {
            this.pais = dadosCadastroDTO.getPais();
        }
    }
}
