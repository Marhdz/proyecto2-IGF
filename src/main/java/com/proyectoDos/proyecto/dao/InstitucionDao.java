package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Institucion;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface InstitucionDao {

    List<Institucion> getInstitucion();
}
