package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.MunicipioDao;
import com.proyectoDos.proyecto.dao.PacienteDao;
import com.proyectoDos.proyecto.models.Institucion;
import com.proyectoDos.proyecto.models.Municipio;
import com.proyectoDos.proyecto.models.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/municipio")
public class MunicipioController {

    @Autowired
    private MunicipioDao municipioDao;

    @GetMapping
    public List<Municipio> getMunicipios(){return municipioDao.getMunicipios();
    }

    @GetMapping(value = "{id}")
    public Municipio getMunicipio(@PathVariable("id") Integer id_municipio){
        return  municipioDao.getMunicipio(id_municipio);
    }
}
