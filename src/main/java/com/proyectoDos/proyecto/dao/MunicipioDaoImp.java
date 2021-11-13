package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Municipio;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class MunicipioDaoImp implements MunicipioDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Municipio> getMunicipio() {
        String query = "FROM Municipio";
        return entityManager.createQuery(query).getResultList();
    }
}
