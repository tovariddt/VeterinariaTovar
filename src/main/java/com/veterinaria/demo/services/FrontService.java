package com.veterinaria.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.demo.models.dao.FrontDao;
import com.veterinaria.demo.models.dto.response.DtoRoles;

@RestController
@RequestMapping(path="/ServiceVete") // This means URL's start with /demo (after Application path)
public class FrontService {

	   private static final Log LOG = LogFactory.getLog(FrontService.class);

		 
	@Autowired
	private FrontDao rolesDao;
	
	@GetMapping("/RolesInfo")
	public ResponseEntity<?> getAllRoles(){
	      LOG.info("Este es un mensaje de nivel INFO");
	       
	      ResponseEntity<?> response =null;
	      
	      try {
	    	 List<DtoRoles> result = new ArrayList<DtoRoles>();
	    	 
	    	 result=rolesDao.getRoles();  
	    	 response= new ResponseEntity<>(result, HttpStatus.OK);
	      }catch (Exception e) {
	    	  
		      LOG.info("Este es un mensaje de Error");


	      }
		return response;
		
	}
	
	
}

