package br.com.fiap.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.domain.dao.IndicadorDAO;
import br.com.fiap.domain.dto.responses.IndicadorResponse;
import br.com.fiap.domain.usecase.IndicadorUseCase;

@Service
public class IndicadorService implements IndicadorUseCase {
	
	@Autowired
	IndicadorDAO indicadorDAO;

	@Override
	public List<IndicadorResponse> getIndicador(String indicadorKey) {
		return indicadorDAO.obterIndicadores(indicadorKey);
	}

}
