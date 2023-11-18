package br.com.fiap.domain.dto;

public class ObjetivosDTO {

	private String global;
	private String brazil;

	public ObjetivosDTO() {
		super();
	}

	public ObjetivosDTO(String global, String brazil) {
		super();
		this.global = global;
		this.brazil = brazil;
	}

	public String getGlobal() {
		return global;
	}

	public void setGlobal(String global) {
		this.global = global;
	}

	public String getBrazil() {
		return brazil;
	}

	public void setBrazil(String brazil) {
		this.brazil = brazil;
	}

}
