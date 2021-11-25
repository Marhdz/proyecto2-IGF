package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.ExamenDao;
import com.proyectoDos.proyecto.models.Examen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExamenController {

    @Autowired
    private ExamenDao examenDao;

    @RequestMapping(value = "examenes")
    public List<Examen> getExamen(){
        return examenDao.getExamen();
    }

}