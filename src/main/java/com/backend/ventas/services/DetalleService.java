package com.backend.ventas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.ventas.respository.IDetalleRepo;

@Service
public class DetalleService {

	@Autowired
	IDetalleRepo detalleRepo;

}
