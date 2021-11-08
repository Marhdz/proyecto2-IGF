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
@Table(name = "consulta_control")
@ToString
@EqualsAndHashCode
public class ConsultaControl {
    @Id
    @Column(name = "id_consulta", nullable = false)
    private Integer id_consulta;

    @Getter
    @Setter
    @Column(name = "id_expediente")
    private Integer id_expediente;

    @Getter
    @Setter
    @Column(name = "fecha_consulta")
    private Integer fechaConsulta;

    public Integer getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Integer id_consulta) {
        this.id_consulta = id_consulta;
    }

}
