package br.com.fiap.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "indicador")
@Table(name = "indicador")
public class IndicadorEntity {

	@Id
	@Column(name = "indicadorKey")
	private String indicadorKey;
	@Column(name = "odsKey")
	private String odsKey;
	@Column(name = "descricaoIndicador")
	private String descricaoIndicador;
	@Column(name = "nomeIndicador")
	private String nomeIndicador;

}
