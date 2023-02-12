package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Categorie;
import com.example.demo.services.IService;

@RestController
public class CatalogueApi {

	@Autowired
	IService service;
	
	@GetMapping("/categories/{id}")
	public Categorie findcategorie(@PathVariable long id)
	{
		return service.findcat(id);
	}
	
	@PostMapping("/categories")
	public Categorie addcat(@RequestBody Categorie c)
	{
		return service.addcat(c);
	}
	
	@GetMapping("salut")
	public String hello()
	{
		return "hi";
	}
	
	@GetMapping("/som/{x}/{b}")
	public int somm(@PathVariable(name = "x") int a,@PathVariable int b)
	{
		return a+b;
	}
	
	@GetMapping("/som")
	public int somm2(@RequestParam int a,@RequestParam int b)
	{
		return a+b;
	}
}
