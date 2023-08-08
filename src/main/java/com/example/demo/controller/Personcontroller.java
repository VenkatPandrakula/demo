package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
public class Personcontroller {
	
	
	  private final PersonService personservice;

	    @Autowired
	    public Personcontroller(PersonService personservice) {
	        this.personservice = personservice;
	    }
	
	
	
	@PostMapping("/addPerson")
	public 	Person addPerson(@RequestBody Person person)
	{
     	personservice.savePerson(person);
		return person;
	}
	
	@GetMapping("/retrivePerson")
	public 	List<Person> retrivePerson()
	{
      return	personservice.getAllPerson();
		//return person;
	}
	
	
	/*
	 * @GetMapping("/{id}") public List<Person> retrivePerson(@PathVariable int id)
	 * { return (List<Person>) personservice.getPersonById(id); // Find the book by
	 * id and return it // If book is not found, return ResponseEntity with
	 * appropriate status code }
	 */

	
	
	

}
