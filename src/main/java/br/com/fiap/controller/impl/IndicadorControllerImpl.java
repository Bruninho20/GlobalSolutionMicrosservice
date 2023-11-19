package br.com.fiap.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.controller.IndicadorController;
import br.com.fiap.domain.dto.responses.IndicadorResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/indicador")
public class IndicadorControllerImpl implements IndicadorController {

	@Override
	@GetMapping("/{id}")
	public List<IndicadorResponse> getConsumo() {
		return null;
	}

}
