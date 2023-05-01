package com.stiven.Concesionario.app.repositorio;

import com.stiven.Concesionario.app.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmpleado extends JpaRepository <Empleado,Integer> {
    @Query(value = "SELECT e FROM Empleado e WHERE e.id=id")
    public Empleado encontrarporId(int id);
}
