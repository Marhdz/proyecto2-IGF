package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name ="expediente")
@ToString
@EqualsAndHashCode
public class Expediente {

    @Id
    @Column(name = "id_expediente", nullable = false)
    @Getter @Setter
    private Integer id_expediente;


    @Getter @Setter
    private Integer id_paciente;

    @Getter @Setter @Column(name ="alimentacion")
    private Boolean alimentacion;

    @Getter @Setter @Column(name = "dieta")
    private String dieta;

    @Getter @Setter @Column(name = "peso")
    private Integer peso;

    @Getter @Setter @Column(name = "talla")
    private Integer talla;

    @Getter @Setter @Column(name = "agua_cantidad")
    private Integer agua_cantidad;

    @Getter @Setter @Column(name = "agua_estado")
    private Boolean agua_estado;

    @Getter @Setter @Column(name = "cafe_cantidad")
    private Integer cafe_cantidad;

    @Getter @Setter @Column(name = "cafe_fecha_inicio")
    private Timestamp cafe_fecha_inicio;

    @Getter @Setter @Column(name = "alcohol_cantidad")
    private Integer alcohol_cantidad;

    @Getter @Setter @Column(name = "alcohol_fecha_inicio")
    private Timestamp alcohol_fecha_incio;

    @Getter @Setter @Column(name = "alcohol_tipo")
    private String alcohol_tipo;

    @Getter @Setter @Column(name = "tabaco_cantidad")
    private Integer tabaco_cantidad;

    @Getter @Setter @Column(name = "tabaco_fecha_inicio")
    private Timestamp tabaco_fecha_inicio;

    @Getter @Setter @Column(name = "tabaco_tipo")
    private String tabaco_tipo;

    @Getter @Setter @Column(name = "prueba_rapida")
    private String prueba_rapida;

    @Getter @Setter @Column(name = "elisa")
    private String elisa;

    @Getter @Setter @Column(name = "western_blot")
    private String western_blot;

    @Getter @Setter @Column(name = "medicamento_comun")
    private String medicamento_comun;

    public Integer getId_expediente() {
        return id_expediente;
    }

    public void setId_expediente(Integer id_expediente) {
        this.id_expediente = id_expediente;
    }

}
