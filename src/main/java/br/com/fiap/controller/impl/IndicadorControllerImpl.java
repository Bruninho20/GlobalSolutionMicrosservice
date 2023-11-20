package br.com.fiap.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.controller.IndicadorController;
import br.com.fiap.domain.dto.responses.IndicadorResponse;
import br.com.fiap.domain.service.IndicadorService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/indicador")
public class IndicadorControllerImpl implements IndicadorController {
	
	@Autowired
	IndicadorService indicadorService;

	@Override
	@GetMapping("/{indicadorKey}")
	public List<IndicadorResponse> getConsumo(@PathVariable String indicadorKey) {
		return indicadorService.getIndicador(indicadorKey);
	}

}
