package com.backend.ventas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clie_num;

	@Column(unique = true)
	private String cedula;

	private String clie_nombres;

	private String clie_apellidos;

	private String clie_telefono;

	public Cliente(Long clie_num, String cedula, String clie_nombres, String clie_apellidos, String clie_telefono) {
		super();
		this.clie_num = clie_num;
		this.cedula = cedula;
		this.clie_nombres = clie_nombres;
		this.clie_apellidos = clie_apellidos;
		this.clie_telefono = clie_telefono;
	}

	public Cliente() {

	}

	public Long getClie_num() {
		return clie_num;
	}

	public void setClie_num(Long clie_num) {
		this.clie_num = clie_num;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getClie_nombres() {
		return clie_nombres;
	}

	public void setClie_nombres(String clie_nombres) {
		this.clie_nombres = clie_nombres;
	}

	public String getClie_apellidos() {
		return clie_apellidos;
	}

	public void setClie_apellidos(String clie_apellidos) {
		this.clie_apellidos = clie_apellidos;
	}

	public String getClie_telefono() {
		return clie_telefono;
	}

	public void setClie_telefono(String clie_telefono) {
		this.clie_telefono = clie_telefono;
	}

}
