package br.com.fiap.domain.dto.responses;

public class IndicadorResponse {

	private Integer ano;
	private Double consumo;

	public IndicadorResponse(Integer ano, Double consumo) {
		super();
		this.ano = ano;
		this.consumo = consumo;
	}

	public IndicadorResponse() {
		super();
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getConsumo() {
		return consumo;
	}

	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}

}
