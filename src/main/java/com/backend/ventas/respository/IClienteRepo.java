package com.backend.ventas.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ventas.models.Cliente;

@Repository
public interface IClienteRepo extends JpaRepository<Cliente, Long> {

	public Cliente findByCedula(String cedula);
}
