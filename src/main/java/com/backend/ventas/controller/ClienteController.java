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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ventas.models.Cliente;
import com.backend.ventas.services.ClienteService;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@GetMapping("/")
	public ResponseEntity<?> ObtenerClientes() {
		Map<String, Object> response = new HashMap<>();
		List<Cliente> clientes = new ArrayList<>();
		try {
			clientes = clienteService.ListarClientes();
			response.put("content", clientes);
		} catch (DataAccessException e) {
			response.put("error", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

	@GetMapping("/{cedula}")
	public ResponseEntity<?> ObtenerClienteByCedula(@PathVariable String cedula) {
		Map<String, Object> response = new HashMap<>();
		Cliente cliente = new Cliente();
		try {
			cliente = clienteService.ObtenerClienteCedula(cedula);
			response.put("content", cliente);
		} catch (DataAccessException e) {
			response.put("error", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	
}
