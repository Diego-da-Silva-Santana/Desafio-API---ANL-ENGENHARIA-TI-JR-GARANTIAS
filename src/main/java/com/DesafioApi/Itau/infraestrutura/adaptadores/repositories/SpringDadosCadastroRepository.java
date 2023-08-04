package com.DesafioApi.Itau.infraestrutura.adaptadores.repositories;

import com.DesafioApi.Itau.infraestrutura.adaptadores.entidades.DadosCadastroEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDadosCadastroRepository extends JpaRepository<DadosCadastroEntitiy, Long> {
}
