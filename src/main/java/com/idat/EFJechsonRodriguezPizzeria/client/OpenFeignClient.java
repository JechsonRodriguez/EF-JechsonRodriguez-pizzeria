package com.idat.EFJechsonRodriguezPizzeria.client;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFJechsonRodriguezPizzeria.model.ClienteMicroServicio;

@FeignClient(name="efjechson-cliente", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/v1/cliente/listar")
	public List<ClienteMicroServicio> listarclientemicro();
	

}
