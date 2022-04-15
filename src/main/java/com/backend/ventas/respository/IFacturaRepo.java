package com.backend.ventas.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ventas.models.Factura;

@Repository
public interface IFacturaRepo extends JpaRepository<Factura, Long> {
	
}
