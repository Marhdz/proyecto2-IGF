package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.PacienteDao;
import com.proyectoDos.proyecto.models.Expediente;
import com.proyectoDos.proyecto.models.Paciente;
import com.proyectoDos.proyecto.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    private PacienteDao pacienteDao;

    @RequestMapping(value = "paciente")
    public List<Paciente> getPacientes(){
        return pacienteDao.getPacientes();
    }

    @RequestMapping(value = "paciente/{id}")
    public Paciente getPaciente(@PathVariable("id") Integer id_paciente){
        return pacienteDao.getPaciente(id_paciente);
    }

    @RequestMapping(value = "paciente", method = RequestMethod.POST)
    public void RegistrarPaciente(@RequestBody Paciente paciente){
        pacienteDao.registrar(paciente);
    }
}