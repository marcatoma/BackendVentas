package com.backend.ventas.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ventas.models.Producto;

@Repository
public interface IProductoRepo extends JpaRepository<Producto, Long> {

}
