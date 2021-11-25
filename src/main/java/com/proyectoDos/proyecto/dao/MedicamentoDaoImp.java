package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Medicamento;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional

public class MedicamentoDaoImp implements MedicamentoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Medicamento> getMedicamentos() {
        String query = "FROM Medicamento";
        return entityManager.createQuery(query).getResultList();
    }
}
