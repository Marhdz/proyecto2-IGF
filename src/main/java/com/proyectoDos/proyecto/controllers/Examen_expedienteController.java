package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.Examen_expedienteDao;
import com.proyectoDos.proyecto.models.Examen_expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Examen_expedienteController {

    @Autowired
    private Examen_expedienteDao examen_expedienteDao;

    @RequestMapping(value = "examenes_expediente")
    public List<Examen_expediente> getExamen_expediente(){

        return examen_expedienteDao.getExamen_expediente();
    }
}