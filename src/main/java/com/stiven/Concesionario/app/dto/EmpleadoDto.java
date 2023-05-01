package com.stiven.Concesionario.app.dto;

import lombok.Data;

@Data
public class EmpleadoDto {
    private int id;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String correo;
}
