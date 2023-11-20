package br.com.fiap.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.controller.ObjetivosController;
import br.com.fiap.domain.dto.responses.ObjetivosGeraisResponse;
import br.com.fiap.domain.service.ObjetivosService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/objetivos")
public class ObjetivosControllerImpl implements ObjetivosController {
	
	@Autowired
	ObjetivosService objetivosService;

	@Override
	public List<ObjetivosGeraisResponse> getOds() {
		return objetivosService.getConsumo();
	}

}
