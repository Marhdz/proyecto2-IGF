package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.DepartamentoDao;
import com.proyectoDos.proyecto.models.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartamentoController {

    @Autowired
    private DepartamentoDao departamentoDao;

    @RequestMapping(value = "departamentos")
    public List<Departamento> getDepartamento(){
        return departamentoDao.getDepartamento();
    }
}
