package com.example.demo.services;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Categorie;
import com.example.demo.repo.ICategorie;

@WebService(endpointInterface = "com.example.demo.services.IserviceSoap")
public class SoapImpl implements IserviceSoap{

	@Autowired
	ICategorie repo;
	@Override
	public Categorie getcat(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
