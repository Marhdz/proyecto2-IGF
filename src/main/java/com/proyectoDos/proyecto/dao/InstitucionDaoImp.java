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
    public Institucion getInstitucion(Integer id) {
        return entityManager.find(Institucion.class, id);
    }

    @Override
    @Transactional
    public List<Institucion> getInstituciones() {
        String query = "FROM Institucion";
        return entityManager.createQuery(query).getResultList();
    }

}
