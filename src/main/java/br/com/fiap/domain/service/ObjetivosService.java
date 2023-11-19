package br.com.fiap.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.fiap.domain.dto.responses.ObjetivosGeraisResponse;
import br.com.fiap.domain.entity.ConsumoEntity;
import br.com.fiap.domain.repository.ConsumoRepository;
import br.com.fiap.domain.usecase.ObjetivosUseCase;

@Service
public class ObjetivosService implements ObjetivosUseCase {
	
	@Autowired
	ConsumoRepository consumoRepository;

	@Override
	public ResponseEntity<ObjetivosGeraisResponse> getConsumo() {
		return null;
	}

}
