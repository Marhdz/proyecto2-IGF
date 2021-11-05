package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.PacienteDao;
import com.proyectoDos.proyecto.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    private PacienteDao  pacienteDao;

    @RequestMapping(value = "pacientes")
    public List<Paciente> getPacientes(){

        return pacienteDao.getPacientes();
    }
}
