package com.backend.ventas.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "detalle")
public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long detall_num;

	private Double detall_precio;

	private int detall_cantidad;

	// foreign key
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	private Producto producto;

	@JsonIgnoreProperties(value={"items", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY)
	private Factura factura;

	public Long getDetall_num() {
		return detall_num;
	}

	public void setDetall_num(Long detall_num) {
		this.detall_num = detall_num;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Double getDetall_precio() {
		return detall_precio;
	}

	public void setDetall_precio(Double detall_precio) {
		this.detall_precio = detall_precio;
	}

	public int getDetall_cantidad() {
		return detall_cantidad;
	}

	public void setDetall_cantidad(int detall_cantidad) {
		this.detall_cantidad = detall_cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
