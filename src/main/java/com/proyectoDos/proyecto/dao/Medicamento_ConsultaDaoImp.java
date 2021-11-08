package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Medicamento_Consulta;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class Medicamento_ConsultaDaoImp implements Medicamento_ConsultaDao {

    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Medicamento_Consulta> getMedicamento_Consulta() {
        String query = "FROM Medicamento_Consulta";
        return entityManager.createQuery(query).getResultList();
    }
}
