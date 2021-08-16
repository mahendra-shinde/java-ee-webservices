package com.mahendra.models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account implements Serializable {

	private int accNo;
	private String name;
	private String contact;
	private double amount;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Account(int accNo, String name, String contact, double amount) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.contact = contact;
		this.amount = amount;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
