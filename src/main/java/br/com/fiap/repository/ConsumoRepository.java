package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.model.Consumo;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, String> {

}
