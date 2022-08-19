package com.idat.EFJechsonRodriguezPizzeria.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFJechsonRodriguezPizzeria.model.PizzaMicroServicio;

@FeignClient(name="efjechson-pizza", url="localhost:8081")
public interface OpenFeignPizza {
	
	@GetMapping("/v1/pizza/listar")
	public List<PizzaMicroServicio> listarclientemicro();
	

}
