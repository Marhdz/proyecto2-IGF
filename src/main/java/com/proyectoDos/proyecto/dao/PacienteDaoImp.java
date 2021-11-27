package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PacienteDaoImp implements PacienteDao{
    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public List<Paciente> getPacientes() {
        String query = "FROM Paciente";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void postPaciente(Paciente paciente) {
        entityManager.merge(paciente);
    }

    @Override
    public Paciente getPaciente(Integer id_paciente) {
        return entityManager.find(Paciente.class, id_paciente);

    }


    @Override
    public void deletePaciente(Integer id) {
        Paciente paciente = entityManager.find(Paciente.class, id);
        paciente.setActivo(false);
        entityManager.merge(paciente);
    }
}
