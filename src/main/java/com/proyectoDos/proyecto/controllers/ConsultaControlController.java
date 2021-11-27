package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.ConsultaControlDao;
import com.proyectoDos.proyecto.models.ConsultaControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/consulta")
public class ConsultaControlController {

    @Autowired
    private ConsultaControlDao consultaControlDao;

    @GetMapping
    public List<ConsultaControl> getConsultasControl() { return consultaControlDao.getConsultasControl(); }

    @GetMapping(value = "{id}")
    public ConsultaControl getConsultaControl(@PathVariable Integer id_consulta_control) {
        return consultaControlDao.getConsultaControl(id_consulta_control);
    }

    @PostMapping
    public void createConsulta(@RequestBody ConsultaControl consultaControl){
        consultaControlDao.createConsultaControl(consultaControl);
    }
}
