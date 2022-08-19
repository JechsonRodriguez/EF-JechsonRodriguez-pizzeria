package com.idat.EFJechsonRodriguezPizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJechsonRodriguezPizzeria.model.ClientePizza;

@Repository
public interface ClientePizzaRepository extends JpaRepository<ClientePizza, Integer>{

}
