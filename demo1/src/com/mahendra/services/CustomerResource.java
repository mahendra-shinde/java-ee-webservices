package com.mahendra.services;

import com.mahendra.models.Customer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/customer")
public class CustomerResource {

	@GET
	@Produces({"application/json","application/xml"})
	public Customer find() {
		return new Customer("Rajiv","Bhatia","akki@yahoo.co.in");
	}
}
