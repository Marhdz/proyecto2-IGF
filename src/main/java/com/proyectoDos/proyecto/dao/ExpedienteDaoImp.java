package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Expediente;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ExpedienteDaoImp implements ExpedienteDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Expediente> getExpediente() {
        String query = "FROM Expediente";
        return entityManager.createQuery(query).getResultList();
    }
}
