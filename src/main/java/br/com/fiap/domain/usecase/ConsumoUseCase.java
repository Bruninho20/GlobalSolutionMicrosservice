package br.com.fiap.domain.usecase;

import java.util.List;

import br.com.fiap.domain.entity.ConsumoEntity;
import br.com.fiap.domain.model.Consumo;

public interface ConsumoUseCase {

	public List<ConsumoEntity> getConsumo();

}
