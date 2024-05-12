package com.veterinaria.demo.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.demo.models.entitys.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

}
