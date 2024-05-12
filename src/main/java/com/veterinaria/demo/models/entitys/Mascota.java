package com.veterinaria.demo.models.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "Mascota")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDMascota")
	private Integer ID;
	
	@Column(name="NombreMascota")
	private String Nombre ;
	
	@Column(name="EspecieMascota")
	private String Especie;
	
	@Column(name="RazaMascota")
	private String Raza;
	
	@Column(name = "FechaNacimientoMascota")
	private Date FechaNacimiento;
	
	@Column(name = "IDPropietario")
	private Integer IDPropietario;
	
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

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public Integer getIDPropietario() {
		return IDPropietario;
	}

	public void setIDPropietario(Integer iDPropietario) {
		IDPropietario = iDPropietario;
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
