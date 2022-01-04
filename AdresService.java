package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdresService {
	
	@Autowired
	private IAdresRepository repository;
	
	public List<Adres> vindAlleAdressen() {
		List<Adres> adreslijst = repository.findAll();
		
		return adreslijst;
	}

	public Adres maakAdresAan(Adres adres) {
		return repository.save(adres);
	}
}
