package br.com.fiap.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "consumo")
public class Consumo {
	
	@Id
	private String indicadorKey;

	private Integer anoConsumo;

	private Integer quantidadeConsumo;

	public Consumo() {
		super();
	}

	public Consumo(String indicadorKey, Integer anoConsumo, Integer quantidadeConsumo) {
		super();
		this.indicadorKey = indicadorKey;
		this.anoConsumo = anoConsumo;
		this.quantidadeConsumo = quantidadeConsumo;
	}

	public String getIndicadorKey() {
		return indicadorKey;
	}

	public void setIndicadorKey(String indicadorKey) {
		this.indicadorKey = indicadorKey;
	}

	public Integer getAnoConsumo() {
		return anoConsumo;
	}

	public void setAnoConsumo(Integer anoConsumo) {
		this.anoConsumo = anoConsumo;
	}

	public Integer getQuantidadeConsumo() {
		return quantidadeConsumo;
	}

	public void setQuantidadeConsumo(Integer quantidadeConsumo) {
		this.quantidadeConsumo = quantidadeConsumo;
	}

	@Override
	public String toString() {
		return "Consumo [indicadorKey=" + indicadorKey + ", anoConsumo=" + anoConsumo + ", quantidadeConsumo="
				+ quantidadeConsumo + "]";
	}

}
