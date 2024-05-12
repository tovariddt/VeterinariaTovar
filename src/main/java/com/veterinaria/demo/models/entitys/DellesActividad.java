package com.veterinaria.demo.models.entitys;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DellesActividad")
public class DellesActividad {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "IDDellesActividad")
	private Integer ID;
	
	@Column(name = "IDActividad")
	private Integer IDActividad;
	
	@Column(name = "CantidadDellesActividad")
	private Integer Cantidad;
	
	@Column(name = "DescripcionDellesActividad")
    private String Descripcion;
	
	@Column(name = "IDProveedor")
	private Integer IDProveedor;
	
	@Column(name = "DineroDellesActividad")
	private double Dinero;
	
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

	public Integer getIDActividad() {
		return IDActividad;
	}

	public void setIDActividad(Integer iDActividad) {
		IDActividad = iDActividad;
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getIDProveedor() {
		return IDProveedor;
	}

	public void setIDProveedor(Integer iDProveedor) {
		IDProveedor = iDProveedor;
	}

	public double getDinero() {
		return Dinero;
	}

	public void setDinero(double dinero) {
		Dinero = dinero;
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
