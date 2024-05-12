package com.veterinaria.demo.models.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "Actividad")
public class Actividad {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDActividad")
	private Integer ID;
	
	@Column(name="IDProducto")
	private Integer IDProducto;
	
	@Column(name="IDUsuario")
	private Integer IDUsuario;
	
	@Column(name="IDMovimiento")
	private Integer IDMovimiento;
	
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

	public Integer getIDProducto() {
		return IDProducto;
	}

	public void setIDProducto(Integer iDProducto) {
		IDProducto = iDProducto;
	}

	public Integer getIDUsuario() {
		return IDUsuario;
	}

	public void setIDUsuario(Integer iDUsuario) {
		IDUsuario = iDUsuario;
	}

	public Integer getIDMovimiento() {
		return IDMovimiento;
	}

	public void setIDMovimiento(Integer iDMovimiento) {
		IDMovimiento = iDMovimiento;
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
