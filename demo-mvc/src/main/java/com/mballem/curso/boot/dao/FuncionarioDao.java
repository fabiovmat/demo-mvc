package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Funcionario;

public interface FuncionarioDao {

	
	
	public void save(Funcionario funcionario); 

	public void update( Funcionario funcionario);

	public void delete(Long id);
			
	Funcionario findById(Long id);
			
	List <Funcionario> findAll(); 
		
	
}






