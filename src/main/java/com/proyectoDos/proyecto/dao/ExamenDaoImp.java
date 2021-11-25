package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Examen;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ExamenDaoImp implements ExamenDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Examen> getExamen() {
        String query = "FROM Examen";
        return entityManager.createQuery(query).getResultList();
    }
}