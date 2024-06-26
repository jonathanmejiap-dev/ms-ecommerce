package com.jmp.ms.ecommerce.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmp.ms.ecommerce.domain.Categoria;
import com.jmp.ms.ecommerce.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	Optional<Producto> findByNombre(String nombre);
	Optional<Producto> findByDescripcion(String descripcion);
	List<Producto> findByCategoria(Categoria categoria);
}
