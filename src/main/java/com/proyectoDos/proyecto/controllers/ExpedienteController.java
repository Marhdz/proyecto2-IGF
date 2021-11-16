package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.ExpedienteDao;
import com.proyectoDos.proyecto.models.Expediente;
import com.proyectoDos.proyecto.models.Institucion;
import com.proyectoDos.proyecto.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpedienteController {

    @Autowired
    private ExpedienteDao expedienteDao;

    @RequestMapping(value = "expedientes")
    public List<Expediente> getExpediente(){
        return expedienteDao.getExpediente();
    }

    @RequestMapping(value = "expediente/{id}")
    public Expediente getExpedientes(@PathVariable("id") Integer id_expediente){
        return expedienteDao.getExpedientes(id_expediente);
    }


    @RequestMapping(value = "expediente/{id}", method = RequestMethod.POST)
    public void RegistrarExpediente(@PathVariable("id")  Integer id_paciente, @RequestBody Expediente expediente){
        expediente.setId_paciente(id_paciente);
        expedienteDao.registrar(expediente);
    }
}
