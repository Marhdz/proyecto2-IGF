package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.InstitucionDao;
import com.proyectoDos.proyecto.models.Institucion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstitucionController {

    @Autowired
    private InstitucionDao institucionDao;

    @RequestMapping (value = "instituciones")
    public List<Institucion> getInstitucion(){
        return institucionDao.getInstitucion();
    }
}
