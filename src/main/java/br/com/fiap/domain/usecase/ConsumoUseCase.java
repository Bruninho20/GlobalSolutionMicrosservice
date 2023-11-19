package br.com.fiap.domain.usecase;

import org.springframework.http.ResponseEntity;

import br.com.fiap.domain.dto.responses.ObjetivosGeraisResponse;

public interface ConsumoUseCase {

	public ResponseEntity<ObjetivosGeraisResponse> getConsumo();

}
