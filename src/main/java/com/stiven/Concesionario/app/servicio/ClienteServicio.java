package com.stiven.Concesionario.app.servicio;

import com.stiven.Concesionario.app.entity.Cliente;

import java.util.List;

public interface ClienteServicio {
    public List<Cliente> encontrarTodos();
    public Cliente encontrarporId(int id);
    public void actualizarCliente(Cliente cliente);
    public void crearCliente(Cliente cliente);
    public void eliminarCliente(int id);
}
