package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.ConsultaControl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ConsultaControlDaoImp implements ConsultaControlDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<ConsultaControl> getConsultaControl() {
        String query = "FROM ConsultaControl";
        return entityManager.createQuery(query).getResultList();

    }
}
