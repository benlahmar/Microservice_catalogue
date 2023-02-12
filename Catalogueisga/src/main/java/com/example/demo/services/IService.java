package com.example.demo.services;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;

public interface IService {

	public Categorie addcat(String lb,String ds) ;
	public Categorie addcat(Categorie c) ;
	public Categorie findcat(long id) ;
	
	public Produit addproduit(Produit p, long idcat);
	
	public Produit addproduit(String desg,double price,int qte,String description,String image,long idcat);

}
