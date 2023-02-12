package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Categorie;
import com.example.demo.repo.ICategorie;

@Component
public class Testcat {

	@Autowired
	ICategorie repo;
	
	public Categorie addcat(String lib,String desc) {
		Categorie c=new Categorie(lib, desc);
		c=repo.save(c);
		return c;
	}
	
	public Categorie addcat(Categorie c)
	{
		return repo.save(c);
	}
	
	public Categorie findcat(long id)
	{
		return repo.getById(id);
				
	}
}
