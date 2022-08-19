package com.idat.EFJechsonRodriguezPizzeria.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="detalle_clientepizza")
public class ClientePizza {
	
	@EmbeddedId
	private ClientePizzaFk fk = new ClientePizzaFk();

	public ClientePizzaFk getFk() {
		return fk;
	}

	public void setFk(ClientePizzaFk fk) {
		this.fk = fk;
	}
	
	

}
