package com.idat.EFJechsonRodriguezPizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJechsonRodriguezPizzeria.model.PizzeriaPizza;

@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<PizzeriaPizza, Integer>{

}
