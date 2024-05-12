package com.veterinaria.demo.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.demo.models.entitys.Mascota;

public interface MascotaRepository extends CrudRepository<Mascota, Integer> {

}
