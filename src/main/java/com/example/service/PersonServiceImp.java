package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonServiceImp implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public Person create(Person person) {
		return personRepository.save(person);
	}

	public void delete(Person person) {
		personRepository.delete(person);
	}
	
}