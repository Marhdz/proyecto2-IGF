package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "municipio")
@ToString
@EqualsAndHashCode
public class Municipio {
    @Id
    @Column(name = "id_municipio", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer id_municipio;

    @Column(name = "nombre_municipio")
    @Getter @Setter
    private String nombre_municipio;

    @Column (name = "id_departamento")
    @Getter @Setter
    private Integer id_departamento;

    public Integer getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(Integer id_municipio) {
        this.id_municipio = id_municipio;
    }
}
