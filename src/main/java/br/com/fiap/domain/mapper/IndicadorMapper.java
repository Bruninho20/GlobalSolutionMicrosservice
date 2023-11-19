package br.com.fiap.domain.mapper;

import java.sql.Driver;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.domain.dto.responses.IndicadorResponse;
import br.com.fiap.domain.entity.IndicadorEntity;

@Component
public class IndicadorMapper {

	@Autowired(required = false)
	ModelMapper mapper;

	public IndicadorResponse toIndicadorResponse(IndicadorEntity indicador) {
		return mapper.map(indicador, IndicadorResponse.class);
	}

	public List<IndicadorResponse> toListDriverResponse(List<IndicadorEntity> indicador) {
		List<IndicadorResponse> list = indicador.stream().map(this::toIndicadorResponse).collect(Collectors.toList());
		return list;
	}

}
