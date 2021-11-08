package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.ExpedienteDao;
import com.proyectoDos.proyecto.models.Expediente;
import com.proyectoDos.proyecto.models.Institucion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpedienteController {

    @Autowired
    private ExpedienteDao expedienteDao;

    @RequestMapping(value = "expedientes")
    public List<Expediente> getExpediente(){
        return expedienteDao.getExpediente();
    }
}
