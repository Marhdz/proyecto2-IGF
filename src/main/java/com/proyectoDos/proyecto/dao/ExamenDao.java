package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Examen;

import java.util.List;

public interface ExamenDao {

    List<Examen> getExamenes();

    Examen getExamen(Integer id);

    void postExamen(Examen examen);

}