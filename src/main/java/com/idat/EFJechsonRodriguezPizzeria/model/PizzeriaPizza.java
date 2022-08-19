package com.idat.EFJechsonRodriguezPizzeria.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="detalle_pizzapizzeria")
public class PizzeriaPizza {
	
	@EmbeddedId
	private PizzeriaPizzaFk fk = new PizzeriaPizzaFk();

	public PizzeriaPizzaFk getFk() {
		return fk;
	}

	public void setFk(PizzeriaPizzaFk fk) {
		this.fk = fk;
	}
	
	
}
