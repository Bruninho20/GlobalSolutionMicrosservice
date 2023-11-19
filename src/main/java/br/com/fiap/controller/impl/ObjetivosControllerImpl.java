package br.com.fiap.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.controller.ObjetivosController;
import br.com.fiap.domain.dto.responses.ObjetivosGeraisResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/objetivos")
public class ObjetivosControllerImpl implements ObjetivosController {

	@Override
	public ResponseEntity<ObjetivosGeraisResponse> getOds() {
		return null;
	}

}
