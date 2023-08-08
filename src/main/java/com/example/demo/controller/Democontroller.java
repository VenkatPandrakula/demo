package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
import com.example.demo.model.Employee;

@RestController

public class Democontroller {
	
	ConcurrentMap<String,Contact> contacts= new ConcurrentHashMap<String,Contact>();
	ConcurrentMap<Integer,Employee> employes= new ConcurrentHashMap<Integer,Employee>();
	
	@RequestMapping("/hello")
    @ResponseBody
 
    // Method
    public String helloWorld()	
    {
 
        // Print statement
        return "Hello World!";
    }
	
	
	@RequestMapping("/addtwonumber")
    @ResponseBody
 
    // Method
    public int addtwonumber(int x , int y)	
    {
		 int z = x+y;
 
        // Print statement
        return z;
    }
	
	@GetMapping("/")
	public List<Contact> getAllContacts()
	{
		List<Contact> list= new ArrayList<Contact>(contacts.values());
		           
		return list;
	}
	
	
	@PostMapping("/")
	public 	Contact addContact(@RequestBody Contact contact)
	{
	   contacts.put(contact.getId(), contact)	;
	
		return contact;
	}
	
	
	@PostMapping("/addEmployee")
	public 	Employee addEmployee(@RequestBody Employee employee)
	{
		employes.put(employee.getEmpid(), employee)	;
	
		return employee;
	}
	
	@GetMapping("/getAllEmployess")
	public List<Employee> getAllEmployess()
	{
		List<Employee> list= new ArrayList<Employee>(employes.values());
		           
		return list;
	}
	

}
