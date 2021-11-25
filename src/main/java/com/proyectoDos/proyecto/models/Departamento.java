package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "departamento")
@ToString
@EqualsAndHashCode
public class Departamento {

    @Id
    @Column(name = "id_departamento", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
