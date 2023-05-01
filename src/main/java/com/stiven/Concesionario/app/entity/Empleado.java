package com.stiven.Concesionario.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "empleados")
@Data
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombres")
    private String nombres;
    @Column (name="apellidos")
    private String apellidos;
    @Column (name="telefono")
    private int telefono;
    @Column (name="correo")
    private String correo;

    @ManyToOne
    @JoinColumn (name="idConcesionario")
    Concesionario idConcesionario;

    @JsonIgnore
    @OneToMany(mappedBy = "idEmpleado")
    private List<Venta> listaVentas;
}
