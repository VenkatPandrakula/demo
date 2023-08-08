package com.example.demo.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

	@Service
	public class PersonService {

	    private final PersonRepository personRepository;

	    @Autowired
	    public PersonService(PersonRepository personRepository) {
	        this.personRepository = personRepository;
	    }

	    // Perform CRUD operations using PersonRepository
	    // Example: Saving a Person
	    public Person savePerson(Person person) {
	        return personRepository.save(person);
	    }

	   // Example: Retrieving all Person
	    public java.util.List<Person> getAllPerson() {
	        return personRepository.findAll();
	    }

	    // Example: Retrieving a product by ID
	 //   public Product getProductById(Long id) {
	   //     return productRepository.findById(id).orElse(null);
	    //}

	    // Example: Updating a product
	    public Person updatePerson(Person person) {
	        return personRepository.save(person);
	    }

	    // Example: Deleting a product
	    public void deletePerson(Long id) {
	    	personRepository.deleteById(id);
	    }
	    
	    
		/*
		 * // Example: Retrieving a person by ID public Person getPersonById(int id) {
		 * return personRepository.getById((long) id).orElse(null); }
		 */
	}

	
		
	


