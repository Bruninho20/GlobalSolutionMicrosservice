package br.com.fiap.domain.usecase;

import java.util.List;

import br.com.fiap.domain.dto.responses.IndicadorResponse;

public interface IndicadorUseCase {
	
	public List<IndicadorResponse> getIndicador(String id);

}
