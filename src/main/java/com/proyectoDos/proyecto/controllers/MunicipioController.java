package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.MunicipioDao;
import com.proyectoDos.proyecto.dao.PacienteDao;
import com.proyectoDos.proyecto.models.Institucion;
import com.proyectoDos.proyecto.models.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MunicipioController {

    @Autowired
    private MunicipioDao municipioDao;

    @RequestMapping(value = "municipios")
    public List<Municipio> getMunicipio(){return municipioDao.getMunicipio();
    }
}
