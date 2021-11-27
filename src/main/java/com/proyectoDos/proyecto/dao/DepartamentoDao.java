package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Departamento;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface DepartamentoDao {

    List<Departamento> getDepartamentos();

    Departamento getDepartamento(Integer id);

}
