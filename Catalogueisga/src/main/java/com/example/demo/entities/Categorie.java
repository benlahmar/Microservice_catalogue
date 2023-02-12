package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Categorie {

	@Id
	@GeneratedValue
	long id;
	@Column(name = "lib",length = 64,unique = true)
	String libelle;
	String description;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy ="cat",cascade = CascadeType.ALL )
	List<Produit> produits;
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
}
