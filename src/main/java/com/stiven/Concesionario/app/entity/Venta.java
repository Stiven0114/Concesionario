package com.stiven.Concesionario.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ventas")
@Data
public class Venta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha")
    private Date fecha;
    @Column (name="metPago")
    private String metPago;
    @Column (name="totalVenta")
    private int totalVenta;
    @Column (name="nomCliente")
    private String nomCliente;
    @Column (name="apellCliente")
    private String apellCliente;
    @Column (name="nomEmpleado")
    private String nomEmpleado;
    @Column (name="apellEmpleado")
    private String apellEmpleado;
    @Column (name="precio")
    private int precio;
    @Column (name="color")
    private String color;

    @ManyToOne
    @JoinColumn(name="idEmpleado")
    Empleado idEmpleado;
    @ManyToOne
    @JoinColumn(name="idCliente")
    Cliente idCliente;
    @ManyToOne
    @JoinColumn(name="idConcesionario")
    Concesionario idConcesionario;
}
