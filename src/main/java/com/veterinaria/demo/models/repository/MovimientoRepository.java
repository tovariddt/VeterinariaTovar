package com.veterinaria.demo.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.demo.models.entitys.Movimiento;

public interface MovimientoRepository extends CrudRepository<Movimiento, Integer> {


}
