package com.example.service;

import com.example.entity.Person;

public interface PersonService {
	Person create(Person person);
	void delete(Person person);
}
