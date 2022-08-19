package com.idat.EFJechsonRodriguezPizzeria.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClientePizzaFk {
	
	@Column(name= "idpizza", nullable =false, unique=true)
	private int idpizza;
	@Column(name= "idcliente", nullable =false, unique=true)
	private int idcliente;

	public int getIdpizza() {
		return idpizza;
	}

	public void setIdpizza(int idpizza) {
		this.idpizza = idpizza;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public ClientePizzaFk(int idpizza, int idcliente) {
		super();
		this.idpizza = idpizza;
		this.idcliente = idcliente;
	}

	public ClientePizzaFk() {
		super();
		// TODO Auto-generated constructor stub
	}

}
