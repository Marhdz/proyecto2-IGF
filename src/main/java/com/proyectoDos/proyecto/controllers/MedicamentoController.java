package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.MedicamentoDao;
import com.proyectoDos.proyecto.models.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MedicamentoController {

    @Autowired
    private MedicamentoDao medicamentoDao;
    @RequestMapping(value = "medicamentos")
    public List<Medicamento> getMedicamentos(){

        return medicamentoDao.getMedicamentos();
    }

}
