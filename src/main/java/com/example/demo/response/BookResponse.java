package com.example.demo.response;




public class BookResponse {
	
	private String status;
	private String name;
	private double amount;
	
	
	public BookResponse(String status, String name, double amount) {
		super();
		this.status = status;
		this.name = name;
		this.amount = amount;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	
	
	
	public BookResponse() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BookResponse(String status) {
		this.status = status;
		// TODO Auto-generated constructor stub
	}

}
