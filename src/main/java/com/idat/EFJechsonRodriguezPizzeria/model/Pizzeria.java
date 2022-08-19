package com.idat.EFJechsonRodriguezPizzeria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizzeria")
public class Pizzeria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpizzeria;
	private String pizzeria;
	private String sede;
	public Pizzeria(int idpizzeria, String pizzeria, String sede) {
		super();
		this.idpizzeria = idpizzeria;
		this.pizzeria = pizzeria;
		this.sede = sede;
	}
	public Pizzeria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdpizzeria() {
		return idpizzeria;
	}
	public void setIdpizzeria(int idpizzeria) {
		this.idpizzeria = idpizzeria;
	}
	public String getPizzeria() {
		return pizzeria;
	}
	public void setPizzeria(String pizzeria) {
		this.pizzeria = pizzeria;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	
	
}
