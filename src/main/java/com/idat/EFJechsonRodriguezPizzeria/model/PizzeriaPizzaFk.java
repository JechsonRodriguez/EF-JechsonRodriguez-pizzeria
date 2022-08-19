package com.idat.EFJechsonRodriguezPizzeria.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PizzeriaPizzaFk {
	
	public PizzeriaPizzaFk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PizzeriaPizzaFk(int idpizza, int idpizzeria) {
		super();
		this.idpizza = idpizza;
		this.idpizzeria = idpizzeria;
	}

	@Column(name= "idpizza", nullable =false, unique=true)
	private int idpizza;
	
	@Column(name= "idpizzeria", nullable =false, unique=true)
	private int idpizzeria;


	public int getIdpizza() {
		return idpizza;
	}

	public void setIdpizza(int idpizza) {
		this.idpizza = idpizza;
	}

	public int getIdpizzeria() {
		return idpizzeria;
	}

	public void setIdpizzeria(int idpizzeria) {
		this.idpizzeria = idpizzeria;
	}
	
	
	

}
