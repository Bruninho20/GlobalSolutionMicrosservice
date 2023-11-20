package br.com.fiap.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.domain.dto.IndicadorDTO;
import br.com.fiap.domain.dto.ObjetivosDTO;
import br.com.fiap.domain.dto.responses.ObjetivosGeraisResponse;
import br.com.fiap.domain.entity.OdsEntity;
import br.com.fiap.domain.repository.ConsumoRepository;
import br.com.fiap.domain.repository.IndicadorRepository;
import br.com.fiap.domain.repository.OdsRepository;
import br.com.fiap.domain.usecase.ObjetivosUseCase;

@Service
public class ObjetivosService implements ObjetivosUseCase {

	@Autowired
	private ConsumoRepository consumoRepository;

	@Autowired
	private OdsRepository odsRepository;

	@Autowired
	private IndicadorRepository indicatorRepository;

	public List<ObjetivosGeraisResponse> getConsumo() {
		return odsRepository.findAll().stream().map(this::mapingOds).collect(Collectors.toList());
	}

	private ObjetivosGeraisResponse mapingOds(OdsEntity ods) {
		ObjetivosGeraisResponse response = new ObjetivosGeraisResponse();
		response.setId(ods.getOdsKey());
		response.setObjetivos(new ObjetivosDTO(ods.getObjetivosBrasil(), ods.getObjetivosGlobais()));
		response.setIndicadores(indicatorRepository.findByOdsKey(ods.getOdsKey()).stream()
				.map(ind -> new IndicadorDTO(ind.getIndicadorKey(), ind.getDescricaoIndicador()))
				.collect(Collectors.toList()));
		return response;
	}
}