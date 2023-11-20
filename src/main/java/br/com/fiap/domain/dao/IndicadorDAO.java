package br.com.fiap.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class IndicadorDAO {
    
    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> obterIndicadores(String id) {
        String sql = "SELECT ANO_CONSUMO as ano, " +
                     "		 QUANTIDADE_CONSUMO as consumo " +
                     " FROM CONSUMO " +
                     " WHERE INDICADOR_KEY = :id " +
                     "	ORDER BY 1 ASC";

		@SuppressWarnings("unchecked")
		List<Object[]> results = entityManager
					.createNativeQuery(sql)
					.setParameter("id", id)
					.getResultList();

        return results;
    }
}

