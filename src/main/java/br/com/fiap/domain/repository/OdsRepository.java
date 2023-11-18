package br.com.fiap.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.domain.entity.OdsEntity;
import br.com.fiap.domain.model.OdsModel;

@Repository
public interface OdsRepository extends JpaRepository<OdsEntity, String> {

}
