package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Institucion;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class InstitucionDaoImp implements InstitucionDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Institucion> getInstitucion() {
        String query = "FROM Institucion";
        return entityManager.createQuery(query).getResultList();
    }
}
