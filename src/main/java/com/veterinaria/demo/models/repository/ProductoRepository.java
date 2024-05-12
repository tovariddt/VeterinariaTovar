package com.veterinaria.demo.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.demo.models.entitys.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {

}
