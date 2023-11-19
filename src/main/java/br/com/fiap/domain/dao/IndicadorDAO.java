package br.com.fiap.domain.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.fiap.domain.dto.responses.IndicadorResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class IndicadorDAO {
    
    @PersistenceContext
    private EntityManager entityManager;

    public List<IndicadorResponse> obterIndicadores(String indicadorKey) {
        String sql = "SELECT CONSUMO.ANO_CONSUMO as ano, " +
                     "CONSUMO.QUANTIDADE_CONSUMO as consumo " +
                     "FROM CONSUMO CONSUMO " +
                     "INNER JOIN INDICADOR INDICADOR " +
                     "ON CONSUMO.INDICADOR_KEY = INDICADOR.INDICADOR_KEY " +
                     "WHERE INDICADOR.INDICADOR_KEY = :id " +
                     "ORDER BY 1 ASC";

        List<Object[]> results = entityManager
                                    .createNativeQuery(sql)
                                    .setParameter("id", indicadorKey)
                                    .getResultList();

        List<IndicadorResponse> indicadores = new ArrayList<>();
        for (Object[] row : results) {
            IndicadorResponse response = new IndicadorResponse();
            response.setAno((Integer) row[0]); 
            response.setConsumo((Double) row[1]); 
            indicadores.add(response);
        }

        return indicadores;
    }
}

