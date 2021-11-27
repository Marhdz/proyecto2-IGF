package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.ConsultaControl;

import java.util.List;

public interface ConsultaControlDao {

    List<ConsultaControl> getConsultasControl();

    ConsultaControl getConsultaControl(Integer id_C);

    void createConsultaControl(ConsultaControl consultaControl);
}

