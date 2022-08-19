package com.idat.EFJechsonRodriguezPizzeria.service;

import java.util.List;

import com.idat.EFJechsonRodriguezPizzeria.model.Pizzeria;


public interface PizzeriaService {

	public List<Pizzeria> listar();
	
	public void guardar(Pizzeria pizzeria);
	
	

}
