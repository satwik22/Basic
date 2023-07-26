package com.hcl.hdfcproject.model;

public class Cards {

	private int customerId;
	private CreditCard creditcard;
	
	
	public Cards() {
		super();
	}
	//private DebitCard debitcard;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public CreditCard getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}
	
	
	
	
}
