package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.ConsultaControlDao;
import com.proyectoDos.proyecto.models.ConsultaControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultaControlController {

    @Autowired
    private ConsultaControlDao consultaControlDao;

    @RequestMapping(value = "consultas")
    public List<ConsultaControl> getConsultaControl() { return consultaControlDao.getConsultaControl(); }
}
