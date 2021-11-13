package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.PacienteDao;
import com.proyectoDos.proyecto.models.Paciente;
import com.proyectoDos.proyecto.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    private PacienteDao pacienteDao;

    @RequestMapping(value = "paciente")
    public List<Paciente> getPacientes(){
        return pacienteDao.getPacientes();
    }

    @RequestMapping(value = "paciente", method = RequestMethod.POST)
    public void RegistrarPaciente(@RequestBody Paciente paciente){
        pacienteDao.registrar(paciente);
    }
}