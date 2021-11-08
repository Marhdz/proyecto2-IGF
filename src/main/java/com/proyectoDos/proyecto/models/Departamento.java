package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
@ToString
@EqualsAndHashCode
public class Departamento {

    @Id
    @Column(name = "id_departamento", nullable = false)
    @Getter @Setter
    private Integer id_departamento;

    @Column(name = "nombre_departamento")
    @Getter @Setter
    private String nombre_departamento;

    public Integer getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(Integer id_departamento) {
        this.id_departamento = id_departamento;
    }
}
