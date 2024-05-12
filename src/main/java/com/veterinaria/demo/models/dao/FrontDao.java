package com.veterinaria.demo.models.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.veterinaria.demo.models.dto.response.DtoRoles;

@Repository
public class FrontDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Log LOG = LogFactory.getLog(FrontDao.class) ;
	
	public List<DtoRoles> getRoles(){
		
		List<DtoRoles> result = new ArrayList<DtoRoles>();
		String sqlRoles = "SELECT IDRol,NombreRol,CaracteristicasRol FROM Veterinaria.Rol;";
		
		return jdbcTemplate.query(sqlRoles, new Object[] { }, (rs, rowNum) -> {
		    DtoRoles dtoR = new DtoRoles();
		    dtoR.setIDRol(rs.getInt("IDRol"));	
		    dtoR.setNombreRol(rs.getNString("NombreRol"));
		    dtoR.setCaracteristicasRol(rs.getNString("CaracteristicasRol"));
		    return dtoR;
		});

		
		
	}
}
