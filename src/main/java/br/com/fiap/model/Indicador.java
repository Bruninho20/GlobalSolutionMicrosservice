package br.com.fiap.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "indicador")
public class Indicador {

	@Id
	private String indicadorKey;

	private OdsModel odsKey;

	private String descricaoIndicador;

	private String nomeIndicador;

}
