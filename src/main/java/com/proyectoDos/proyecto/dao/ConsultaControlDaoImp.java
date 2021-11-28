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
    public List<ConsultaControl> getConsultasControl() {
        String query = "FROM ConsultaControl";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public ConsultaControl getConsultaControl(Integer id_consulta) {
        return entityManager.find(ConsultaControl.class, id_consulta);
    }

    @Override
    public void createConsultaControl(ConsultaControl consultaControl) {
        entityManager.merge(consultaControl);
    }
}
