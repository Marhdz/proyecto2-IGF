package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.DepartamentoDao;
import com.proyectoDos.proyecto.models.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoDao departamentoDao;

    @GetMapping
    public List<Departamento> getDepartamentos(){
        return departamentoDao.getDepartamentos();
    }

    @GetMapping(value = "{id}")
    public Departamento getDepartamento(@PathVariable Integer id_departamento){
        return departamentoDao.getDepartamento(id_departamento);
    }


}
