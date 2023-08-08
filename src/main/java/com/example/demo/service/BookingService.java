package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.model.Person;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.PersonRepository;
import com.example.demo.request.BookRequest;
import com.example.demo.response.BookResponse;

@Service
public class BookingService {
	
     @Autowired
	 private  PersonRepository personRepository;
     @Autowired
	 private  PaymentRepository paymentRepository;
	 
	 
	 	
	 public BookResponse bookTicket(BookRequest bookrequest)
	 {
		 Person person= bookrequest.getPerson();
		 
		 personRepository.save(person);
		 
		 Payment payment = bookrequest.getPayment();
		  System.out.println("account number"+payment.getAccountno());    
		 
		 paymentRepository.save(payment);
		
		 return new BookResponse("Success");
		 
		  
	 }
	 

}
