package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.model.Person;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    // Perform CRUD operations using PersonRepository
    // Example: Saving a Person
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

   // Example: Retrieving all Person
    public java.util.List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    // Example: Retrieving a product by ID
 //   public Product getProductById(Long id) {
   //     return productRepository.findById(id).orElse(null);
    //}

    // Example: Updating a product
    public Payment Payment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Example: Deleting a product
	/*
	 * public void deletePayment(String id) { paymentRepository.deleteAllById(id); }
	 */ 
    
	/*
	 * // Example: Retrieving a person by ID public Person getPersonById(int id) {
	 * return personRepository.getById((long) id).orElse(null); }
	 */
}
