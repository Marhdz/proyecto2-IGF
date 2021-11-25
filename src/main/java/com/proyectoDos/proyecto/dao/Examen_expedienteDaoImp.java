package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Examen_expediente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class Examen_expedienteDaoImp implements Examen_expedienteDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Examen_expediente> getExamen_expediente() {
        String query = "FROM Examen_expediente";
        return entityManager.createQuery(query).getResultList();
    }
}