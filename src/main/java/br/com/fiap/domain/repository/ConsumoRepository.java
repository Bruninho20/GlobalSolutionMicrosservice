package br.com.fiap.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.domain.entity.ConsumoEntity;

@Repository
public interface ConsumoRepository extends JpaRepository<ConsumoEntity, String> {

}
