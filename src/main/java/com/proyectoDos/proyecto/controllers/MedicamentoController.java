package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.MedicamentoDao;
import com.proyectoDos.proyecto.models.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/medicamento")
public class MedicamentoController {

    @Autowired
    private MedicamentoDao medicamentoDao;

    @GetMapping
    public List<Medicamento> getMedicamentos(){

        return medicamentoDao.getMedicamentos();
    }

    @GetMapping(value = "{id}")
    public Medicamento getMedicamento(@PathVariable("id") Integer id_medicamento){
        return  medicamentoDao.getMedicamento(id_medicamento);
    }

    @PostMapping
    public void createMedicamento(@RequestBody Medicamento medicamento){
        medicamentoDao.postMedicamento(medicamento);
    }

    @PostMapping(value = "{id}")
    public void updateMedicamento(@PathVariable("id") Integer id_medicamento, @RequestBody Medicamento medicamento){
        medicamento.setId_medicamento(id_medicamento);
        medicamentoDao.postMedicamento(medicamento);
    }



}
