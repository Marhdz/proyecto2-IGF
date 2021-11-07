package com.proyectoDos.proyecto.controllers;


import com.proyectoDos.proyecto.dao.Medicamento_ConsultaDao;
import com.proyectoDos.proyecto.models.Institucion;
import com.proyectoDos.proyecto.models.Medicamento_Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Medicamento_ConsultaController {
    @Autowired
    private Medicamento_ConsultaDao medicamento_consultaDao;

    @RequestMapping(value = "medicamento_consulta")
    public List<Medicamento_Consulta> getMedicamento_Consulta(){
        return medicamento_consultaDao.getMedicamento_Consulta();
    }

}
