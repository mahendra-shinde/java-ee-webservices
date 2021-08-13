package com.mahendra.services;

import com.mahendra.models.Customer;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import java.util.*;

@Path("/customer")
public class CustomerResource {

	private List<Customer>  customerList = new LinkedList<Customer>();
	
	public CustomerResource() {
		Customer c1 =  new Customer(1,"Rajiv","Bhatia","akki@yahoo.co.in");
		customerList.add(c1);
	}
	
	
	@GET
	@Path("/{id}") // Resulting Path Suffix customer/{id}
	@Produces({"application/json","application/xml"})
	public Customer find(@PathParam("id")int id) {
		for(Customer c : customerList) {
			if(c.getId() == id) {
				System.out.println("Found :"+c.getFirstName());
				return c;
			}
		}
		return null;
	}
	
	@POST
	@Consumes("application/json")
	public Customer create(Customer customer) {
		int newId = customerList.size()+1;
		customer.setId(newId);
		customerList.add(customer);
		return customer;
	}
	
	@GET
	@Produces({"application/json","application/xml"})
	public List<Customer> findAll(){
		//returns a READONLY copy of List
		return Collections.unmodifiableList(customerList);
	}
}
