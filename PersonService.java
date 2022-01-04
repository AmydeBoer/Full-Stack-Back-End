package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private IPersonRepository repository;
	
	public List<Person> vindAllePersonen() {
		List<Person> personenlijst = repository.findAll();
		
		return personenlijst;
	}
	
	public Person maakPersoonAan(Person person) {
		return repository.save(person);
	}
	

}




