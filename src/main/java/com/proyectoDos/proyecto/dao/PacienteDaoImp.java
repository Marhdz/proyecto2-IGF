package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Paciente;
import com.proyectoDos.proyecto.models.Usuario;
import org.springframework.stereotype.Repository;
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
    public void registrar(Paciente paciente) {
        entityManager.merge(paciente);
    }

//    @Override
//    public void deletePaciente(Long id) {
//        Paciente paciente = entityManager.find(Paciente.class, id);
//        entityManager.merge(paciente);
//    }
}
