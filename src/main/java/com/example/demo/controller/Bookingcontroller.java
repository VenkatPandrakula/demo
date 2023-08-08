package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.BookRequest;
import com.example.demo.response.BookResponse;
import com.example.demo.service.BookingService;

@RestController
public class Bookingcontroller {
	
	  @Autowired	
	  private   BookingService bookingservice;
	  
	  @Autowired
	    public Bookingcontroller(BookingService bookingservice) {
	        this.bookingservice = bookingservice;
	    }
	  
	  
		@PostMapping("/bookticket")
		public 	BookResponse bookTicket(@RequestBody BookRequest bookrequest)
		{
			System.out.println("called book Tikcet ");
			return bookingservice.bookTicket(bookrequest);
			
		}
		
	  
	  
	  

}
