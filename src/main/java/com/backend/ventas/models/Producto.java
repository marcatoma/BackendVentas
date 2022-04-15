package com.backend.ventas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double product_precio;

	private int product_stock;

	private String product_nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getProduct_precio() {
		return product_precio;
	}

	public void setProduct_precio(Double product_precio) {
		this.product_precio = product_precio;
	}

	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

	public String getProduct_nombre() {
		return product_nombre;
	}

	public void setProduct_nombre(String product_nombre) {
		this.product_nombre = product_nombre;
	}

}
