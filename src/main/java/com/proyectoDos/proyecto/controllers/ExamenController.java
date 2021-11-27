package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.ExamenDao;
import com.proyectoDos.proyecto.models.Examen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/examen")
public class ExamenController {

    @Autowired
    private ExamenDao examenDao;

   @GetMapping
    public List<Examen> getExamenes(){
        return examenDao.getExamenes();
    }

    @GetMapping(value = "{id}")
    public Examen getExamen(@PathVariable Integer id_Examen){
       return examenDao.getExamen(id_Examen);
    }

    @PostMapping
    public void CreateExamen(@RequestBody Examen examen){
       examenDao.postExamen(examen);
    }

    @PostMapping(value = "{id}")
    public void UpdateExamen(@PathVariable Integer id_examen, @RequestBody Examen examen){
       examen.setId_examen(id_examen);
       examenDao.postExamen(examen);
    }
}