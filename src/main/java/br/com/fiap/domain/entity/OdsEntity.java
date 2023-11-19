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
@Entity(name = "ods")
@Table(name = "ods")
public class OdsEntity {

	@Id
	@Column(name = "odsKey")
	private String odsKey;
	@Column(name = "objetivoGlobal")
	private String objetivosGlobais;
	@Column(name = "objetivoBrasil")
	private String objetivosBrasil;

}
