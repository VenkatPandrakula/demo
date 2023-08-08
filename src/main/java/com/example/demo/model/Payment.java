package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Payment {
	
	@Id
	@GeneratedValue
	private int paymentid;
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPaymentid() {
		return paymentid;
	}

	public Payment(int paymentid, String accountno, double amount) {
		super();
		this.paymentid = paymentid;
		this.accountno = accountno;
		this.amount = amount;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column
	private String accountno;
	
	@Column
	private double amount;
	

}
