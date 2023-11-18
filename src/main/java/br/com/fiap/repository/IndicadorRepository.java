package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.model.Indicador;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, String> {

}
