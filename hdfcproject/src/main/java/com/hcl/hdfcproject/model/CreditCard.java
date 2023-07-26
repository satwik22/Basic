package com.hcl.hdfcproject.model;

import java.util.Date;

public class CreditCard {
	
	private long cardNumber;
	private String cardHolderName;
	private int cvv;
	private Date expiryDate;
	
	
	public CreditCard(long cardNumber, String cardHolderName, int cvv, Date expiryDate) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	
	public CreditCard() {
		super();
	}

	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", cvv=" + cvv
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	

}
