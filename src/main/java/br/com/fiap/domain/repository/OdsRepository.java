package br.com.fiap.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.domain.dto.ObjetivosDTO;
import br.com.fiap.domain.entity.OdsEntity;

@Repository
public interface OdsRepository extends JpaRepository<OdsEntity, String> {

}
