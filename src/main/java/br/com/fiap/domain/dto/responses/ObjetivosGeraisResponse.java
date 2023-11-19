package br.com.fiap.domain.dto.responses;

import java.util.List;

import br.com.fiap.domain.dto.IndicadorDTO;
import br.com.fiap.domain.dto.ObjetivosDTO;

public class ObjetivosGeraisResponse {

	private String id;
	private ObjetivosDTO objetivos;
	private List<IndicadorDTO> indicadores;

	public ObjetivosGeraisResponse() {
		super();
	}

	public ObjetivosGeraisResponse(String id, ObjetivosDTO objetivos, List<IndicadorDTO> indicadores) {
		super();
		this.id = id;
		this.objetivos = objetivos;
		this.indicadores = indicadores;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ObjetivosDTO getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(ObjetivosDTO objetivos) {
		this.objetivos = objetivos;
	}

	public List<IndicadorDTO> getIndicadores() {
		return indicadores;
	}

	public void setIndicadores(List<IndicadorDTO> indicadores) {
		this.indicadores = indicadores;
	}

}
