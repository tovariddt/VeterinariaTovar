package com.veterinaria.demo.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.demo.models.entitys.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
