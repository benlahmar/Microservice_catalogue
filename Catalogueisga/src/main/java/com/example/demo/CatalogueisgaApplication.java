package com.example.demo;

import javax.xml.ws.Endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Categorie;
import com.example.demo.repo.ICategorie;
import com.example.demo.services.IService;
import com.example.demo.services.SoapImpl;

@SpringBootApplication
public class CatalogueisgaApplication implements CommandLineRunner{

	@Autowired
	IService service;
	
	public static void main(String[] args) {
		SpringApplication.run(CatalogueisgaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//service.addcat("xxx", "yyyy");
		service.addproduit("gg", 100, 10, "description", "image", 2);
		
	}

}
