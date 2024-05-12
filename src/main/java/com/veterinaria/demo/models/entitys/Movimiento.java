package com.veterinaria.demo.models.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "Movimiento")
public class Movimiento {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDMovimiento")
	private Integer ID;
	
	@Column(name = "NombreMovimiento")
	private String Nombre;
	
	@Column(name = "DescripcionMovimiento")
	private String Descripcion;
	
	@Column(name = "CreadoEN")
	private Timestamp CreadoEN;
	  
	@Column(name = "ActualizadoEN")
	private Timestamp ActualizadoEN;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Timestamp getCreadoEN() {
		return CreadoEN;
	}

	public void setCreadoEN(Timestamp creadoEN) {
		CreadoEN = creadoEN;
	}

	public Timestamp getActualizadoEN() {
		return ActualizadoEN;
	}

	public void setActualizadoEN(Timestamp actualizadoEN) {
		ActualizadoEN = actualizadoEN;
	}
	
	

}
