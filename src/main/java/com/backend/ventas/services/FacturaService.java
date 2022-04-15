package com.backend.ventas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.ventas.models.Factura;
import com.backend.ventas.respository.IFacturaRepo;

@Service
public class FacturaService {

	@Autowired
	IFacturaRepo facturaRepo;

	public List<Factura> ObtenerTodasFacturas() {
		return facturaRepo.findAll();
	}

}
