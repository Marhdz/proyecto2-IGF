package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "consulta_control")
@ToString
@EqualsAndHashCode
public class ConsultaControl {
    @Id
    @Column(name = "id_consulta", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter
    private Integer id_consulta;

    @Getter
    @Setter
    @Column(name = "id_expediente")
    private Integer id_expediente;

    @Getter
    @Setter
    @Column(name = "fecha_consulta")
    private Timestamp fechaConsulta;

    public Integer getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Integer id_consulta) {
        this.id_consulta = id_consulta;
    }

}
