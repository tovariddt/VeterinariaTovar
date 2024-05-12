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
@Table(name = "Cita")
public class Cita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDCita")
	private Integer ID;
	
	@Column(name = "FechaHoraCita")
	private Date FechaHora;
	
	@Column(name = "IDMascota")
	private Integer IDMascota;
	
	@Column(name = "IDUsuario")
	private Integer IDUsuario;
	
	@Column(name = "ObservacionesCita")
	private String Observaciones;
	
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

	public Date getFechaHora() {
		return FechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		FechaHora = fechaHora;
	}

	public Integer getIDMascota() {
		return IDMascota;
	}

	public void setIDMascota(Integer iDMascota) {
		IDMascota = iDMascota;
	}

	public Integer getIDUsuario() {
		return IDUsuario;
	}

	public void setIDUsuario(Integer iDUsuario) {
		IDUsuario = iDUsuario;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
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
