package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.PacienteDao;
import com.proyectoDos.proyecto.models.Expediente;
import com.proyectoDos.proyecto.models.Paciente;
import com.proyectoDos.proyecto.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/paciente")
public class PacienteController {

    @Autowired
    private PacienteDao pacienteDao;

    @GetMapping
    public List<Paciente> getPacientes(){
        return pacienteDao.getPacientes();
    }

    @GetMapping(value = "{id}")
    public Paciente getPaciente(@PathVariable("id") Integer id_paciente){
       return pacienteDao.getPaciente(id_paciente);
    }

    @PostMapping(value = "{id}")
    public void updatePaciente(@PathVariable("id") Integer id_paciente, @RequestBody Paciente paciente){
        paciente.setId_paciente(id_paciente);
        pacienteDao.postPaciente(paciente);
    }

    @PostMapping
    public void RegistrarPaciente(@RequestBody Paciente paciente){
        pacienteDao.postPaciente(paciente);
    }

    @DeleteMapping(value = "{id}")
    public void deletePaciente(@PathVariable("id") Integer id_paciente){
        pacienteDao.deletePaciente(id_paciente);
    }
}