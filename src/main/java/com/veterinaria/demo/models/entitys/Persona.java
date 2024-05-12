package com.veterinaria.demo.models.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;



@Entity
@Table(name = "Persona")
public class Persona {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="IDPersona")
	  private Integer ID;
	  
	  @Column(name = "NombrePersona")
	  private String Nombre;
	  
	  @Column(name = "ApellidoPPersona")
	  private String ApellidoP;
	  
	  @Column(name = "ApellidoMPersona")
	  private String ApellidoM;
	  
	  @Column(name = "DireccionPersona")
	  private String Direccion;
	  
	  @Column(name = "TelefonoPersona")
	  private String Telefono;
	  
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
		
			public String getApellidoP() {
				return ApellidoP;
			}
		
			public void setApellidoP(String apellidoP) {
				ApellidoP = apellidoP;
			}
		
			public String getApellidoM() {
				return ApellidoM;
			}
		
			public void setApellidoM(String apellidoM) {
				ApellidoM = apellidoM;
			}
		
			public String getDireccion() {
				return Direccion;
			}
		
			public void setDireccion(String direccion) {
				Direccion = direccion;
			}
		
			public String getTelefono() {
				return Telefono;
			}
		
			public void setTelefono(String telefono) {
				Telefono = telefono;
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
