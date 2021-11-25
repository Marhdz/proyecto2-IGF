package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "medicamento")
@ToString
@EqualsAndHashCode
public class Medicamento {
    @Id
    @Column(name = "id_medicamento", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter
    private Integer id_medicamento;

    @Getter @Setter
    @Column(name = "acronimo")
    private String acronimo;

    @Getter @Setter
    @Column(name = "nombre_medicamento")
    private String nombre_medicamento;

    @Getter @Setter
    @Column(name = "laboratorio")
    private String laboratorio;

    @Getter @Setter
    @Column(name = "concentracion")
    private Integer concentracion;

    @Getter @Setter
    @Column(name = "presentacion")
    private String presentacion;

    @Getter @Setter
    @Column(name = "vencimiento")
    private Timestamp vencimiento;

    @Getter @Setter
    @Column(name = "cantidad")
    private Integer cantidad;

    public Integer getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(Integer id_medicamento) {
        this.id_medicamento = id_medicamento;
    }
}
