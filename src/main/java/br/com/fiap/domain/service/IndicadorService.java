package br.com.fiap.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.domain.dao.IndicadorDAO;
import br.com.fiap.domain.dto.responses.IndicadorResponse;
import br.com.fiap.domain.usecase.IndicadorUseCase;

@Service
public class IndicadorService implements IndicadorUseCase {
	
	@Autowired
	private IndicadorDAO indicadorDAO;

	@Override
	public List<IndicadorResponse> getIndicador(String indicadorKey) {
		List<Object[]> results = indicadorDAO.obterIndicadores(indicadorKey);
		
		List<IndicadorResponse> indicadores = results.stream()
				.map(IndicadorResponse::from)
				.collect(Collectors.toList());

		return indicadores;
	}

}
