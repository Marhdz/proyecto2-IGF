package com.proyectoDos.proyecto.models;


import jdk.jfr.Enabled;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pedido")
@ToString
@EqualsAndHashCode
public class Pedido {

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    @Getter @Setter
    private Integer id_pedido;

    @Getter @Setter @Column(name = "id_medicamento")
    private Integer id_medicamento;

    @Getter @Setter @Column(name = "periodo")
    private Date periodo;

    @Getter @Setter @Column(name = "id_pedido_anterior")
    private Integer id_pedido_anterior;

    @Getter @Setter @Column(name = "cantidad_inicial")
    private Integer cantidad_inicial;

    @Getter @Setter @Column(name = "existencias")
    private Integer existencias;

}
