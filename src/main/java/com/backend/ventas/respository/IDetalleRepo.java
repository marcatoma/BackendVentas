package com.backend.ventas.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ventas.models.Detalle;
import com.backend.ventas.models.Factura;

@Repository
public interface IDetalleRepo extends JpaRepository<Detalle, Long> {

	List<Detalle> findByFactura(Factura factura);
	
}
