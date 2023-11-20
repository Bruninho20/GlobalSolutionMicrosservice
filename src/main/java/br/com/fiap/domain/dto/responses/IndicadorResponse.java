package br.com.fiap.domain.dto.responses;

public class IndicadorResponse {

	private String ano;
	private String consumo;

	public static IndicadorResponse from(Object[] result) {
		String ano = String.valueOf(result[0]);
		String consumo = String.valueOf(result[1]);
		return new IndicadorResponse(ano, consumo);
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public IndicadorResponse(String ano, String consumo) {
		super();
		this.ano = ano;
		this.consumo = consumo;
	}

}
