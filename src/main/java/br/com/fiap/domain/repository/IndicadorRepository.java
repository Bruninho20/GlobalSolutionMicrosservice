package br.com.fiap.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.domain.dto.IndicadorDTO;
import br.com.fiap.domain.entity.IndicadorEntity;

@Repository
public interface IndicadorRepository extends JpaRepository<IndicadorEntity, String> {

}
