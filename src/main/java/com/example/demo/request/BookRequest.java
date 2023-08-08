package com.example.demo.request;

import com.example.demo.model.Payment;
import com.example.demo.model.Person;

public class BookRequest {
	
	private Person person;
	private Payment payment;
	
	
	
	
	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}



	public Payment getPayment() {
		return payment;
	}



	public void setPayment(Payment payment) {
		this.payment = payment;
	}




	
	
	
	public BookRequest(Person person, Payment payment) {
		super();
		this.person = person;
		this.payment = payment;
	}



	public BookRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
