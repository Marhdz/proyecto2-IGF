package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Departamento;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class DepartamentoDaoImp implements DepartamentoDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Departamento> getDepartamento() {
        String query = "FROM Departamento";
        return entityManager.createQuery(query).getResultList();
    }
}
