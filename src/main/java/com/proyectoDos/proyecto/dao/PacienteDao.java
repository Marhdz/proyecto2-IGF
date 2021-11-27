package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PacienteDao {

    List<Paciente> getPacientes();

    void postPaciente(Paciente paciente);

    Paciente getPaciente(Integer id_paciente);

    void deletePaciente(Integer id);
}
