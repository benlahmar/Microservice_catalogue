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
public class CatalogueisgaApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CatalogueisgaApplication.class, args);
	}

	

}
