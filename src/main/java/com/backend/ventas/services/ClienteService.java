package com.backend.ventas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.ventas.models.Cliente;
import com.backend.ventas.respository.IClienteRepo;

@Service
public class ClienteService {

	@Autowired
	IClienteRepo clienteRepo;

	public Cliente RegistrarCliente(Cliente cliente) {
		return clienteRepo.save(cliente);
	}

	public List<Cliente> ListarClientes() {
		return clienteRepo.findAll();
	}

	public Cliente ObtenerClienteCedula(String cedula) {
		return clienteRepo.findByCedula(cedula);
	}

	public Cliente ObtenerClienteId(Long id) {
		return clienteRepo.findById(id).orElse(null);
	}

}
