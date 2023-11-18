package br.com.fiap.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.domain.entity.ConsumoEntity;
import br.com.fiap.domain.model.Consumo;
import br.com.fiap.domain.repository.ConsumoRepository;
import br.com.fiap.domain.usecase.ConsumoUseCase;

@Service
public class ConsumoService implements ConsumoUseCase {
	
	@Autowired
	ConsumoRepository consumoRepository;

	@Override
	public List<ConsumoEntity> getConsumo() {
		return consumoRepository.findAll();
	}

}
