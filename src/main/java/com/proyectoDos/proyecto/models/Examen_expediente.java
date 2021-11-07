package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "examen_expediente")
@ToString
@EqualsAndHashCode
public class Examen_expediente {

    @Id
    @Column(name = "id_examen_expediente", nullable = false)
    @Getter @Setter
    private Integer id_examen_expediente;

    @Column(name = "id_examen")
    @Getter @Setter
    private Integer id_examen ;

    @Column(name = "id_expediente")
    @Getter @Setter
    private Integer id_expediente;

    @Column(name = "fecha_asignado")
    @Getter @Setter
    private Timestamp fecha_asignado;

    @Column(name = "resultado")
    @Getter @Setter
    private String resultado;

    @Column(name = "fecha_realizado")
    @Getter @Setter
    private Timestamp fecha_realizado;

    public Integer getId_examen_expediente() {
        return id_examen_expediente;
    }

    public void setId_examen_expediente(Integer id_examen_expediente) {
        this.id_examen_expediente = id_examen_expediente;
    }
}