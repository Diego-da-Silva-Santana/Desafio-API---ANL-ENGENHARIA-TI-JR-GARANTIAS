package com.DesafioApi.Itau.infraestrutura.adaptadores.entidades;

import com.DesafioApi.Itau.dominio.DadosCadastro;
import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "dados_cadastro")
public class DadosCadastroEntitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private  String nome;
    private  String sobreNome;
    private Integer idade;
    private String pais;

    public DadosCadastroEntitiy() {
    }

    public DadosCadastroEntitiy(DadosCadastro dadosCadastro){
        this.nome = dadosCadastro.getNome();
        this.sobreNome = dadosCadastro.getSobreNome();
        this.idade = dadosCadastro.getIdade();
        this.pais = dadosCadastro.getPais();
    }

    public DadosCadastro toDadosCadastro(){
        return new DadosCadastro(this.nome,this.sobreNome,this.idade,this.pais);
    }

}
