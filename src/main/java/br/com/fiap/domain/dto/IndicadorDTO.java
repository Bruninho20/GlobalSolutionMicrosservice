package br.com.fiap.domain.dto;

public class IndicadorDTO {

	private String id;
	private String descricao;

	public IndicadorDTO() {
		super();
	}

	public IndicadorDTO(String id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
