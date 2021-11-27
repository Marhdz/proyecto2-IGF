package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Expediente;
import com.proyectoDos.proyecto.models.Paciente;
import com.proyectoDos.proyecto.models.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ExpedienteDaoImp implements ExpedienteDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Expediente> getExpediente() {
        String query = "FROM Expediente";
        return entityManager.createQuery(query).getResultList();
    }
    @Override
    public Expediente getExpedientes(Integer id_expediente) {
        return entityManager.find(Expediente.class, id_expediente);

    }

    @Override
    public void postExpediente(Expediente expediente) {
        entityManager.merge(expediente);
    }
}
