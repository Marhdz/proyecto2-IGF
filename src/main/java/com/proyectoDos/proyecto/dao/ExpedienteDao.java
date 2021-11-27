package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Expediente;
import com.proyectoDos.proyecto.models.Paciente;

import java.util.List;

public interface ExpedienteDao {

    List <Expediente> getExpediente();

    Expediente getExpedientes(Integer id_expediente);

    void postExpediente(Expediente expediente);
}
