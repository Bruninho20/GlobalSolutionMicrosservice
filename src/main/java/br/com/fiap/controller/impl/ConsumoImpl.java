package br.com.fiap.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.controller.ConsumoController;
import br.com.fiap.domain.model.Consumo;
import br.com.fiap.domain.service.ConsumoService;

@RestController
@RequestMapping("/consumo")
public class ConsumoImpl implements ConsumoController {
	
	@Autowired
	ConsumoService consumoService;

	@Override
	public List<Consumo> getConsumo() {
		return consumoService.getConsumo();
	}

}
