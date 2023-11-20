package br.com.fiap.domain.usecase;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.fiap.domain.dto.responses.ObjetivosGeraisResponse;

public interface ObjetivosUseCase {

	public List <ObjetivosGeraisResponse> getConsumo();

}
