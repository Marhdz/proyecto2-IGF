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
@Table(name = "examen")
@ToString
@EqualsAndHashCode
public class Examen {

    @Id
    @Column(name = "id_examen", nullable = false)
    @Getter @Setter
    private Integer id_examen;

    @Column(name = "nombre_examen", nullable = false)
    @Getter @Setter
    private String nombre_examen;

    public Integer getId_examen() {
        return id_examen;
    }

    public void setId_examen(Integer id_examen) {
        this.id_examen = id_examen;
    }

}