package br.com.fiap.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.domain.entity.IndicadorEntity;

@Repository
public interface IndicadorRepository extends JpaRepository<IndicadorEntity, String> {
	
	List<IndicadorEntity> findByIndicadorKey(String indicadorKey);

}
