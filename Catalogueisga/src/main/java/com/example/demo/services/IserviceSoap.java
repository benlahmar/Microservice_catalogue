package com.example.demo.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.demo.entities.Categorie;

@WebService
public interface IserviceSoap {

	@WebMethod
    Categorie getcat(long id);
}
