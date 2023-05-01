package com.stiven.Concesionario.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "concesionarios")
@Data
public class Concesionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name="nombre")
    private String nombre;
    @Column (name="direccion")
    private String direccion;
    @Column (name="telefono")
    private int telefono;

    @JsonIgnore
    @OneToMany(mappedBy = "idConcesionario")
    private List<Empleado> listaEmpleados;
    @JsonIgnore
    @OneToMany(mappedBy = "idConcesionario")
    private List<Venta> listaVentas;
    @JsonIgnore
    @OneToMany(mappedBy = "idConcesionario")
    private List<Vehiculo> listaVehiculos;
    @ManyToMany
    @JoinTable(name="concesio_clientes",
        joinColumns = @JoinColumn(name="idCliente",nullable = false),
        inverseJoinColumns = @JoinColumn(name="idConcesionario",nullable = false))
    private List<Cliente> listaClientes;;


}
