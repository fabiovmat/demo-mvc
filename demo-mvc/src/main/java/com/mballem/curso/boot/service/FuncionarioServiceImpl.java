package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.FuncionarioDao;
import com.mballem.curso.boot.domain.Funcionario;

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

	
	
	@Autowired
	private FuncionarioDao dao;
	
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		dao.save(funcionario);
	}
	
	@Transactional(readOnly = false)
	@Override
	public void editar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		dao.update(funcionario);
	}
	@Transactional(readOnly = false)
	@Override	
	public void exclui(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}
	@Transactional(readOnly = true)
	@Override
	public Funcionario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		
		dao.findById(id);
		return null;
	}
	@Transactional(readOnly = true)
	@Override
	public List<Funcionario> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
