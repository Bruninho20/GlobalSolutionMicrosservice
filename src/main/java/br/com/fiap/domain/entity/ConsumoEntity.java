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
@Entity(name = "consumo")
@Table(name = "consumo")
public class ConsumoEntity {

	@Id
	@Column(name = "consumoKey")
	private Long consumoKey;
	@Column(name = "indicadorKey")
	private String indicadorKey;
	@Column(name = "anoConsumo")
	private Integer anoConsumo;
	@Column(name = "quantidadeConsumo")
	private Integer quantidadeConsumo;

}
