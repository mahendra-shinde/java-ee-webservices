package com.mahendra.models;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
//1 Class should be Serializable
//2 Must have no-argument constructor
//3 Every property should have getter and setter
//4 Properties must be private
public class Customer implements Serializable {

	private String firstName;
	private String lastName;
	private String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
}
