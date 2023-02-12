package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

	@Id @GeneratedValue
	long id;
	String desg;
	double price;
	int qte;
	String description;
	String image;
	
	@ManyToOne
	Categorie cat;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Categorie getCat() {
		return cat;
	}

	public void setCat(Categorie cat) {
		this.cat = cat;
	}

	public Produit(String desg, double price, int qte, String description, String image) {
		super();
		this.desg = desg;
		this.price = price;
		this.qte = qte;
		this.description = description;
		this.image = image;
	}

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
