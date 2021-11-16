package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Paciente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PacienteDao {


    List<Paciente> getPacientes();

    Paciente getPaciente(Integer id_paciente);

    void registrar(Paciente paciente);
}
