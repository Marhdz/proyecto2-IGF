package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "medicamento_consulta")
@ToString
@EqualsAndHashCode
public class Medicamento_Consulta {
    @Id
    @Column(name = "id_medicamento_consulta", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_medicamento_consulta;

    @Getter @Setter @Column(name = "id_medicamento")
    private Integer id_medicamento;

    @Getter @Setter @Column(name = "id_consulta ")
    private Integer id_consulta;

    @Getter @Setter @Column(name = "cantidad")
    private Integer cantidad;

    @Getter @Setter @Column(name = "entregado")
    private Integer entregado;

    public Integer getId_medicamento_consulta() {
        return id_medicamento_consulta;
    }

    public void setId_medicamento_consulta(Integer id_medicamento_consulta) {
        this.id_medicamento_consulta = id_medicamento_consulta;
    }
}
