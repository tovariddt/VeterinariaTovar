package com.veterinaria.demo.models.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;


@Entity
@Table(name = "Usuario")
public class Usuario {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="IDUsuario")
	  private Integer ID;
	  
	  @Column(name = "NombreUsuario")
	  private String Nombre;
	  
	  @Column(name = "ContraseñaUsuario")
	  private String Contraseña;
	  
	  @Column(name = "CorreoUsuario")
	  private String Correo;
	  
	  @Column(name="IDRol")
	  private Integer IDRol;	  
	  
	  @Column(name="IDPersona")
	  private Integer IDPersona;
	  
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
		
			public String getContraseña() {
				return Contraseña;
			}
		
			public void setContraseña(String contraseña) {
				Contraseña = contraseña;
			}
		
			public String getCorreo() {
				return Correo;
			}
		
			public void setCorreo(String correo) {
				Correo = correo;
			}
		
			public Integer getIDRol() {
				return IDRol;
			}
		
			public void setIDRol(Integer iDRol) {
				IDRol = iDRol;
			}
		
			public Integer getIDPersona() {
				return IDPersona;
			}
		
			public void setIDPersona(Integer iDPersona) {
				IDPersona = iDPersona;
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
