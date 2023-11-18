package br.com.fiap.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="ods")
public class OdsModel {
	
	@Id
	private String odsKey;
	
	private String objetivosGlobais;

	private String brasilObjetivos;

	public OdsModel() {
		super();
	}

	public OdsModel(String odsKey, String objetivosGlobais, String brasilObjetivos) {
		super();
		this.odsKey = odsKey;
		this.objetivosGlobais = objetivosGlobais;
		this.brasilObjetivos = brasilObjetivos;
	}

	public String getOdsKey() {
		return odsKey;
	}

	public void setOdsKey(String odsKey) {
		this.odsKey = odsKey;
	}

	public String getObjetivosGlobais() {
		return objetivosGlobais;
	}

	public void setObjetivosGlobais(String objetivosGlobais) {
		this.objetivosGlobais = objetivosGlobais;
	}

	public String getBrasilObjetivos() {
		return brasilObjetivos;
	}

	public void setBrasilObjetivos(String brasilObjetivos) {
		this.brasilObjetivos = brasilObjetivos;
	}

	@Override
	public String toString() {
		return "OdsModel [odsKey=" + odsKey + ", objetivosGlobais=" + objetivosGlobais + ", brasilObjetivos="
				+ brasilObjetivos + "]";
	}

}
