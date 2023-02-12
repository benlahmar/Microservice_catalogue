package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;
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
	@GetMapping("/categories")
	public List<Categorie> all()
	{
		return service.allc();
	}	
	@DeleteMapping("/categories/{idc}")
	public void deletec(@PathVariable long idc)
	{
		service.deletecat(idc);
	}
	@PostMapping("/categories/{idc}")
	public Produit addp(@RequestBody Produit p,@PathVariable long idc)
	{
		return service.addproduit(p, idc);
	}
	
}
