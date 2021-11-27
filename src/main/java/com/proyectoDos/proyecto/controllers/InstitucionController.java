package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.InstitucionDao;
import com.proyectoDos.proyecto.models.Institucion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/institucion")
public class InstitucionController {

    @Autowired
    private InstitucionDao institucionDao;

    @GetMapping
    public List<Institucion> getInstituciones(){
        return institucionDao.getInstituciones();
    }

    @GetMapping(value = "{id}")
    public Institucion getInstitucion(@PathVariable("id") Integer id_institucion){
        return institucionDao.getInstitucion(id_institucion);
    }
}