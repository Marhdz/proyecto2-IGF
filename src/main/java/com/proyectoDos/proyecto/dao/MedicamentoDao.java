package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Medicamento;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional

public interface MedicamentoDao {
    List<Medicamento> getMedicamentos();
}
