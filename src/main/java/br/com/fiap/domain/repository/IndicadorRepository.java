package br.com.fiap.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.domain.entity.IndicadorEntity;
import br.com.fiap.domain.model.Indicador;

@Repository
public interface IndicadorRepository extends JpaRepository<IndicadorEntity, String> {

}
