package com.stiven.Concesionario.app.implementacion;

import com.stiven.Concesionario.app.entity.Empleado;
import com.stiven.Concesionario.app.repositorio.RepositoryEmpleado;
import com.stiven.Concesionario.app.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoImpl implements EmpleadoServicio {
    @Autowired
    RepositoryEmpleado repositoryEmpleado;
    @Override
    public List<Empleado> encontrarTodos() {
        return this.repositoryEmpleado.findAll();
    }

    @Override
    public Empleado encontrarporId(int id) {
        return this.repositoryEmpleado.encontrarporId(id);
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        this.repositoryEmpleado.save(empleado);
    }

    @Override
    public void crearEmpleado(Empleado empleado) {
        this.repositoryEmpleado.save(empleado);
    }

    @Override
    public void eliminarCEmpleado(int id) {

    }
}
