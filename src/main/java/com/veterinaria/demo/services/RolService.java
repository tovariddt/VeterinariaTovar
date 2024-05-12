package com.veterinaria.demo.services;

import java.sql.Timestamp;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.demo.models.entitys.Rol;
import com.veterinaria.demo.models.repository.RolRepository;
import com.veterinaria.demo.utilities.Utilities;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping(path="/Vete") // This means URL's start with /demo (after Application path)
public class RolService {

   private static final Log LOG = LogFactory.getLog(RolService.class);

	 
@Autowired
private RolRepository rolRepository;

  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "Prueba servicios Rol") String name) {
    return String.format("Hello %s!", name);
  }

   @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewRol (@RequestParam String Nombre
      , @RequestParam String Caracteristicas ) {
  

	    Rol n = new Rol();
	    n.setNombre(Nombre);
	    n.setCaracteristicas(Caracteristicas);
	  
	    Timestamp timestamp = Utilities.getCurrentTimestamp();	  
	    n.setCreadoEN(timestamp);
	    n.setActualizadoEN(timestamp);
	    
	    rolRepository.save(n);

		    return "Saved"; 
  
  }
  
  @PostMapping(path="/addrol")
  public ResponseEntity<?> addNewRol(@RequestBody Rol newRol) {
      Timestamp timestamp = Utilities.getCurrentTimestamp();	  
      newRol.setCreadoEN(timestamp);
      newRol.setActualizadoEN(timestamp);

      Rol savedRol = rolRepository.save(newRol);

      return new ResponseEntity<>(savedRol, HttpStatus.OK);
  }
  

  

  @GetMapping(path="/all/rol")
  public ResponseEntity<Iterable<Rol>> getAllRol() {
      LOG.info("Este es un mensaje de nivel INFO");
      LOG.debug("Este mensaje es de error");
      Iterable<Rol> roles = rolRepository.findAll();
      return new ResponseEntity<>(roles, HttpStatus.OK);
 
  }
  
  
  

}