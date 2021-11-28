package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.ExpedienteDao;
import com.proyectoDos.proyecto.models.Expediente;
import com.proyectoDos.proyecto.models.Institucion;
import com.proyectoDos.proyecto.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/expediente")
public class ExpedienteController {

    @Autowired
    private ExpedienteDao expedienteDao;

    @GetMapping
    public List<Expediente> getExpediente(){
        return expedienteDao.getExpediente();
    }

    @GetMapping(value = "{id}")
    public Expediente getExpedientes(@PathVariable("id") Integer id_expediente){
        return expedienteDao.getExpedientes(id_expediente);
    }


    @PostMapping(value = "{id}")
    public void RegistrarExpediente(@PathVariable("id")  Integer id_paciente, @RequestBody Expediente expediente){
        expediente.setId_paciente(id_paciente);
        expediente.setId_expediente(id_paciente);
        expedienteDao.postExpediente(expediente);
    }
}
