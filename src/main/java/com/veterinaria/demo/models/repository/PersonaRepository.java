package com.veterinaria.demo.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.demo.models.entitys.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
