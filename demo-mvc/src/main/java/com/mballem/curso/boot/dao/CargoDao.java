package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Cargo;


public interface CargoDao {
	
	
	
	public void save(Cargo cargo); 

	public void update( Cargo cargo);

	public void delete(Long id);
			
	Cargo findById(Long id);
			
	List <Cargo> findAll(); 
	
	
	
	

}
