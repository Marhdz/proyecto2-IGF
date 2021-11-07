package com.proyectoDos.proyecto.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "institucion")
@ToString
@EqualsAndHashCode
public class Institucion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "[id_institucion]", nullable = false)
    @Getter @Setter
    private Integer id_Institucion;

    @Getter @Setter  @Column(name = "[nombre_institucion]")
    private String nombre_institucion;

    public Integer getId_Institucion() {
        return id_Institucion;
    }

    public void setId_Institucion(Integer id_Institucion) {
        this.id_Institucion = id_Institucion;
    }
}
