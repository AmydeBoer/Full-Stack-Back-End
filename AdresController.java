package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
public class AdresController {
	
	@Autowired
	private AdresService service;
	
	@RequestMapping(value = "/adressen")
	public List<Adres> vind() {
		return service.vindAlleAdressen();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/maakadresaan")
	public Adres maakAdresAan(@RequestBody Adres adres) {
		return service.maakAdresAan(adres);
	}
	
}
