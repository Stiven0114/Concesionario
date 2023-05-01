package com.stiven.Concesionario.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vehiculos")
@Data
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="tipoVehiculo")
    private String tipoVehiculo;
    @Column(name="modelo")
    private int modelo;
    @Column(name="centCubicos")
    private int centCubicos;
    @Column(name="placa")
    private String placa;
    @Column(name="precio")
    private int precio;
    @Column(name="marca")
    private String marca;
    @Column(name="color")
    private String color;

    @ManyToOne
    @JoinColumn(name="idConcesionario")
    Concesionario idConcesionario;
}
