package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;
import com.example.demo.repo.ICategorie;
import com.example.demo.repo.IProduit;

@Service
public class ServiceImpl implements IService{

	@Autowired
	ICategorie crepo;
	@Autowired
	IProduit prepo;
	
	@Override
	public Categorie addcat(String lb, String ds) {
		Categorie c=new Categorie(lb, ds);
		return crepo.save(c);
	}

	@Override
	public Categorie findcat(long id) {
		
		return crepo.findById(id).get();
	}

	@Override
	public Produit addproduit(Produit p, long idcat) {
		
		Categorie c = crepo.findById(idcat).get();
		
		p.setCat(c);
		
		p=prepo.save(p);
		return p;
	}

	@Override
	public Produit addproduit(String desg, double price, int qte, String description, String image, long idcat) {
        Categorie c = crepo.findById(idcat).get();
		Produit p=new Produit(desg, price, qte, description, image);
		p.setCat(c);
		
		p=prepo.save(p);
		return p;
	}

	@Override
	public Categorie addcat(Categorie c) {
		
		return crepo.save(c);
	}

	

	
}
