package com.backend.ventas.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ventas.models.Factura;
import com.backend.ventas.services.FacturaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	FacturaService facturaService;

	@GetMapping("/")
	public ResponseEntity<?> ListarFcaturas() {
		Map<String, Object> response = new HashMap<>();
		List<Factura> facturas = new ArrayList<>();
		try {
			facturas = facturaService.ObtenerTodasFacturas();
			response.put("content", facturas);

		} catch (DataAccessException e) {
			response.put("error", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}
}
