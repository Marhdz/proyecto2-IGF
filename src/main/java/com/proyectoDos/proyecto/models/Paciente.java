package com.proyectoDos.proyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "paciente")
@ToString
@EqualsAndHashCode
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_paciente", nullable = false)
    @Getter @Setter
    private Integer id_paciente;

    @Getter @Setter  @Column(name = "nombre_paciente")
    private String nombre_paciente;

    @Getter @Setter  @Column(name = "apellido")
    private String apellido;

    @Getter @Setter  @Column(name = "fecha_nacimiento")
    private Timestamp fecha_nacimiento;

    @Getter @Setter  @Column(name = "lugar_nacimiento")
    private String lugar_nacimiento;

    @Getter @Setter  @Column(name = "sexo")
    private Boolean sexo;

    @Getter @Setter  @Column(name = "estado_civil")
    private String estado_civil;

    @Getter @Setter  @Column(name = "escolaridad")
    private String escolaridad;

    @Getter @Setter  @Column(name = "ocupacion")
    private String ocupacion;

    @Getter @Setter  @Column(name = "direccion")
    private String direccion;

    @Getter @Setter  @Column(name = "id_municipio")
    private Integer id_municipio;

    @Getter @Setter  @Column(name = "id_departamento")
    private Integer id_departamento;

    @Getter @Setter  @Column(name = "clinica_referido")
    private String clinica_referido;

    @Getter @Setter  @Column(name = "telefono")
    private String telefono;

    @Getter @Setter  @Column(name = "dui")
    private String dui;

    @Getter @Setter  @Column(name = "isss")
    private String isss;

    @Getter @Setter  @Column(name = "responsable")
    private String responsable;

    @Getter @Setter  @Column(name = "parentesco")
    private String parentesco;

    @Getter @Setter  @Column(name = "id_expediente")
    private String id_expediente;

    @Getter @Setter  @Column(name = "activo")
    private Boolean activo;

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

}