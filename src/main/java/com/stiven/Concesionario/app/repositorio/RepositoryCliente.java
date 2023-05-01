package com.stiven.Concesionario.app.repositorio;

import com.stiven.Concesionario.app.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCliente extends JpaRepository <Cliente,Integer> {
    @Query (value = "SELECT cl FROM Cliente cl WHERE cl.id=id")
    public Cliente encontrarporId(int id);


}
